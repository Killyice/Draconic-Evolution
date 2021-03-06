package com.brandon3055.draconicevolution.blocks;

import com.brandon3055.brandonscore.blocks.BlockBCore;
import com.brandon3055.draconicevolution.DEFeatures;
import com.brandon3055.draconicevolution.blocks.tileentity.TileDislocatorReceptacle;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by brandon3055 on 16/07/2016.
 */
public class DislocatorReceptacle extends BlockBCore implements ITileEntityProvider {

    public static final PropertyBool ACTIVE = PropertyBool.create("active");
    public static final PropertyBool CAMO = PropertyBool.create("camo");

    public DislocatorReceptacle() {
        this.setDefaultState(blockState.getBaseState().withProperty(ACTIVE, false).withProperty(CAMO, false));
    }

    //region Block state and tile creation

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(ACTIVE, meta == 1);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(ACTIVE) ? 1 : 0;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, ACTIVE, CAMO);
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileDislocatorReceptacle();
    }

    @Override
    public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        TileEntity tile = worldIn.getTileEntity(pos);
        return state.withProperty(CAMO, tile instanceof TileDislocatorReceptacle && ((TileDislocatorReceptacle) tile).camo.get());
    }

    //endregion

    //region Fun stuff

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
        TileEntity tile = worldIn.getTileEntity(pos);

        if (tile instanceof TileDislocatorReceptacle) {
            ItemStack stack = playerIn.getHeldItem(hand);
            if (stack.getItem() instanceof ItemBlock && ((ItemBlock) stack.getItem()).getBlock() == DEFeatures.infusedObsidian) {
                ((TileDislocatorReceptacle) tile).camo.set(!((TileDislocatorReceptacle) tile).camo.get());
                ((TileDislocatorReceptacle) tile).updateBlock();
                return true;
            }

            return ((TileDislocatorReceptacle) tile).onBlockActivated(playerIn);
        }

        return false;
    }

    @Override
    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
        TileEntity tile = worldIn.getTileEntity(pos);

        if (tile instanceof TileDislocatorReceptacle) {
            ((TileDislocatorReceptacle) tile).deactivate();
        }

        super.breakBlock(worldIn, pos, state);
    }

    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        TileEntity tile = worldIn.getTileEntity(pos);

        if (tile instanceof TileDislocatorReceptacle) {
            ((TileDislocatorReceptacle) tile).attemptIgnition();
        }
    }

    @Override
    public void neighborChanged(IBlockState state, World world, BlockPos pos, Block blockIn, BlockPos fromPos) {
        TileEntity t = world.getTileEntity(pos);

        if (t instanceof TileDislocatorReceptacle) {
            TileDislocatorReceptacle tile = (TileDislocatorReceptacle) t;

            boolean powered = world.isBlockIndirectlyGettingPowered(pos) > 0;

            if (!powered && tile.ltRedstone.get()) {
                tile.ltRedstone.set(false);
                tile.deactivate();
            }
            else if (powered && !tile.ltRedstone.get()) {
                tile.ltRedstone.set(true);
                tile.updateBlock();
                if (!tile.active.get()) {
                    tile.attemptIgnition();
                }
            }
        }
    }

    //endregion
}
