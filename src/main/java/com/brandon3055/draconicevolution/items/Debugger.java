package com.brandon3055.draconicevolution.items;

import com.brandon3055.brandonscore.items.ItemBCore;
import com.brandon3055.draconicevolution.utils.LogHelper;
import net.minecraft.block.BlockVine;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.NoiseGeneratorSimplex;

import java.util.Random;

/**
 * Created by brandon3055 on 4/4/2016.
 */
public class Debugger extends ItemBCore {

    //todo remove from tab and NEI

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

//    private void generate(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand) {
//
//        int posX = (int)player.posX;
//        double posY = (int)player.posY;
//        int posZ = (int)player.posZ;
//
//        int rayCount = 500;
//
//        NoiseGeneratorSimplex ng = new NoiseGeneratorSimplex();
//
//        for (int ray = rayCount; ray > 0; ray--){
//
//            double pc = ray / (double)rayCount;
//            double direction = Math.PI * 2 * pc;
//            int rayDist = 20 + itemRand.nextInt(10);
//
//            double x = posX + itemRand.nextGaussian() * 5;
//            double y = posY + itemRand.nextGaussian() * 5;
//            double z = posZ + itemRand.nextGaussian() * 5;
//
//            double r = 1 + itemRand.nextDouble();
//
//            for (int rayD = 0; rayD < rayDist; rayD++){
//                double dpc = 1D - (rayD / (double)rayDist);
//
//                double d2 = direction + (ng.getValue(x/1.8, z/1.8) * r);
//                x += Math.cos(d2);
//                z += Math.sin(d2);
//
//                int prevY = (int)y;
//                y += itemRand.nextGaussian() + (dpc*1.3);
//                if ((int)y - prevY > 1) y--;
//                if ((int)y - prevY < -1) y++;
//
//                BlockPos pos = new BlockPos((int)x, (int)y, (int)z);
//
//                world.setBlockState(pos, Blocks.LOG.getDefaultState());
//
//                for (EnumFacing facing : EnumFacing.VALUES){
//                    BlockPos pos2 = pos.offset(facing);
//                    if (world.isAirBlock(pos2)) {
//                        world.setBlockState(pos2, Blocks.LEAVES.getDefaultState());
//                    }
//                }
//            }
//        }

//        rayCount = 200;
//
//
//        for (; rayCount > 0; rayCount--) {
//
//            double pc = rayCount / 100D;
//            double direction = Math.PI * 2 * pc;
//            int rayDist = 15 + itemRand.nextInt(5);
//
//            Vec3I vec = new Vec3I(posX, (int) posY, posZ);
//            double x = posX + itemRand.nextDouble() * 10;
//            double y = posY + itemRand.nextDouble() * 10;
//            double z = posZ + itemRand.nextDouble() * 10;
//
//            double r = 1 + itemRand.nextDouble();
//
//            for (int rayD = 0; rayD < rayDist; rayD++) {
//                double d2 = direction + (ng.getValue(x / 1.8, z / 1.8) * r);
//                x += Math.cos(d2);
//                z += Math.sin(d2);
//
//                int prevY = (int) y;
//                y += itemRand.nextGaussian();
//                if ((int) y - prevY > 1) y--;
//                if ((int) y - prevY < -1) y++;
//
//                vec.set((int) x, (int) y, (int) z);
//
//                world.setBlockState(vec.getPos(), Blocks.LOG.getDefaultState());
//
//                for (EnumFacing facing : EnumFacing.VALUES) {
//                    BlockPos pos = vec.getPos().add(facing.getFrontOffsetX(), facing.getFrontOffsetY(), facing.getFrontOffsetZ());
//                    if (world.isAirBlock(pos)) {
//                        world.setBlockState(pos, Blocks.LEAVES.getDefaultState());
//                    }
//                }
//            }
//        }

//        int posX = (int)player.posX;
//        double posY = (int)player.posY;
//        int posZ = (int)player.posZ;
//
//        int rayCount = 100;
//
//        for (; rayCount > 0; rayCount--){
//
//            double pc = rayCount / 100D;
//            double direction = Math.PI * 2 * pc;
//            int rayDist = 35 + itemRand.nextInt(10);
//
//            Vec3I vec = new Vec3I(posX, (int)posY, posZ);
//            double x = posX + itemRand.nextDouble() * 10;
//            double y = posY + itemRand.nextDouble() * 10;
//            double z = posZ + itemRand.nextDouble() * 10;
//
//            for (int rayD = 0; rayD < rayDist; rayD++){
//                double d2 = direction + itemRand.nextDouble();
//                x += Math.cos(d2);
//                z += Math.sin(d2);
//                y += itemRand.nextGaussian();
//
//                vec.set((int)x, (int)y, (int)z);
//
//                world.setBlockState(vec.getPos(), Blocks.LOG.getDefaultState());
//
//                for (EnumFacing facing : EnumFacing.VALUES){
//                    BlockPos pos = vec.getPos().add(facing.getFrontOffsetX(), facing.getFrontOffsetY(), facing.getFrontOffsetZ());
//                    if (world.isAirBlock(pos)) {
//                        world.setBlockState(pos, Blocks.LEAVES.getDefaultState());
//                    }
//                }
//            }
//        }
//    }

    public boolean generate(World worldIn, Random rand, BlockPos position) {
//        if (position.getY() + 2 + height > 256) {
////            return false;
////
//  }
        int trunkHeight = 20;


//        for (BlockPos pos : BlockPos.getAllInBox(position.add(-1, -1, -1), position.add(1, -1, 1))) {
//            IBlockState state = worldIn.getBlockState(pos);
//            if (!(state.getBlock() == Blocks.DIRT || state.getBlock() == Blocks.GRASS)) {
//                return false;
//            }
//        }
        //TODO Check gen area.
        //for (BlockPos pos : BlockPos.getAllInBox(position.add(-1, 0, -1), position.add(1, 1, 1))) {
        //    IBlockState state = worldIn.getBlockState(pos);
        //    Block block = state.getBlock();
        //    if (!block.isLeaves(state, worldIn, pos) && !block.isWood(worldIn, pos) && block != Blocks.tallgrass && block != Blocks.grass && block != Blocks.vine) {
        //        return false;
        //    }
        //}

        for (BlockPos pos : BlockPos.getAllInBox(position.add(-1, -1, -1), position.add(1, -1, 1))) {
            worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState());
        }
        for (BlockPos pos : BlockPos.getAllInBox(position.add(-1, 0, -1), position.add(1, trunkHeight, 1))) {
            worldIn.setBlockState(pos, Blocks.LOG.getDefaultState());
        }
        for (EnumFacing dir : EnumFacing.HORIZONTALS) {
            BlockPos edgePos = position.offset(dir, 2);
            switch (dir) {
                case NORTH:
                    generateVines(worldIn, rand, dir, edgePos.add(-1, 0, 0), edgePos.add(1, trunkHeight, 0));
                    continue;
                case SOUTH:
                    generateVines(worldIn, rand, dir, edgePos.add(-1, 0, 0), edgePos.add(1, trunkHeight, 0));
                    continue;
                case WEST:
                    generateVines(worldIn, rand, dir, edgePos.add(0, 0, -1), edgePos.add(0, trunkHeight, 1));
                    continue;
                case EAST:
                    generateVines(worldIn, rand, dir, edgePos.add(0, 0, -1), edgePos.add(0, trunkHeight, 1));
                    continue;
                default:
                    LogHelper.info("Invalid side in EnumFacing.HORIZONTALS [%s]", dir.getName());
            }
        }
        BlockPos rayStartPos = position.add(0, trunkHeight - 3, 0);
        int posX = rayStartPos.getX();
        double posY = rayStartPos.getY();
        int posZ = rayStartPos.getZ();

        /*int rayCount = 1000;

        NoiseGeneratorSimplex ng = new NoiseGeneratorSimplex();

        for (int ray = rayCount; ray > 0; ray--){

            double pc = ray / (double)rayCount;
            double direction = Math.PI * 2 * pc;
            int rayDist = 20 + rand.nextInt(10);

            double x = posX;
            double y = posY;
            double z = posZ;

            double r = 1 + rand.nextDouble();

            for (int rayD = 0; rayD < rayDist; rayD++) {
                double d2 = direction + (ng.func_151605_a(x/1.8, z/1.8) * r);
                x += Math.cos(d2);
                z += Math.sin(d2);

                int prevY = (int) y;
                y += rand.nextGaussian();
                if ((int) y - prevY > 1) {
                    y--;
                }
                if ((int) y - prevY < -1) {
                    y++;
                }
                placeRayPart(worldIn, new BlockPos(x, y, z));
            }
        }*/
        int rayCount = 100;

        NoiseGeneratorSimplex ng = new NoiseGeneratorSimplex();

        //region Long Rays

        for (int ray = rayCount; ray > 0; ray--) {

            double pc = ray / (double) rayCount;
            double direction = Math.PI * 2 * pc;
            int rayDist = 35 + rand.nextInt(10);

            double x = posX + itemRand.nextGaussian() * 3;
            double y = posY + itemRand.nextGaussian() * 2;
            double z = posZ + itemRand.nextGaussian() * 3;

            double r = 1 + rand.nextDouble();

            for (int rayD = 0; rayD < rayDist; rayD++) {
                double dpc = 1D - (rayD / (double) rayDist);

                double d2 = direction + (ng.getValue(x / 1.8, z / 1.8) * r);
                x += Math.cos(d2);
                z += Math.sin(d2);

                int prevY = (int) y;
                y += rand.nextGaussian() + (dpc);
                if ((int) y - prevY > 1) {
                    y--;
                }
                if ((int) y - prevY < -1) {
                    y++;
                }

                BlockPos vec = new BlockPos(x, y, z);

                placeRayPart(worldIn, vec);
            }
        }
        //endregion

        //region Short Rays

        rayCount = 100;

        for (int ray = rayCount; ray > 0; ray--) {

            double pc = ray / (double) rayCount;
            double direction = Math.PI * 2 * pc;
            int rayDist = 15 + rand.nextInt(5);

            double x = posX + itemRand.nextGaussian() * 3;
            double y = posY + itemRand.nextGaussian() * 2;
            double z = posZ + itemRand.nextGaussian() * 3;

            double r = 1 + rand.nextDouble();

            for (int rayD = 0; rayD < rayDist; rayD++) {
                double dpc = 1D - (rayD / (double) rayDist);

                double d2 = direction + (ng.getValue(x / 1.8, z / 1.8) * r);
                x += Math.cos(d2);
                z += Math.sin(d2);

                int prevY = (int) y;
                y += rand.nextGaussian() + (dpc);
                if ((int) y - prevY > 1) {
                    y--;
                }
                if ((int) y - prevY < -1) {
                    y++;
                }

                BlockPos vec = new BlockPos(x, y, z);

                placeRayPart(worldIn, vec);
            }
        }

        //endregion

        return true;
    }

    private void generateVines(World world, Random rand, EnumFacing dir, BlockPos from, BlockPos to) {
        for (BlockPos pos : BlockPos.getAllInBox(from, to)) {
            if (rand.nextInt(5) == 1 && world.getBlockState(pos).getBlock() == Blocks.AIR) {
                world.setBlockState(pos, Blocks.VINE.getDefaultState().withProperty(BlockVine.getPropertyFor(dir.getOpposite()), true));
            }
        }
    }

    private void placeRayPart(World world, BlockPos pos) {
        //Iterable<BlockPos> l = BlockPos.getAllInBox(sPos, sPos.add(itemRand.nextInt(2), itemRand.nextInt(2), itemRand.nextInt(2)));

        //for (BlockPos pos : l) {
            world.setBlockState(pos, Blocks.LOG.getDefaultState());
            for (EnumFacing side : EnumFacing.VALUES) {
                BlockPos leavesPos = pos.offset(side);
                if (world.isAirBlock(leavesPos)) {
                    world.setBlockState(leavesPos, Blocks.LEAVES.getDefaultState());
                }
            }
        //}
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand) {
        if (world.isRemote) return super.onItemRightClick(itemStack, world, player, hand);
//

      //  LogHelper.info();

//        BigInteger bigInteger = BigInteger.valueOf(Long.MAX_VALUE);
//        BigInteger bigInteger2 = BigInteger.valueOf(Long.MAX_VALUE);
//        BigInteger value = bigInteger.multiply(bigInteger2);
//        LogHelper.info(value+" "+bigInteger);
       // generate(world, world.rand, new BlockPos(player.posX, player.posY, player.posZ));


//        for (int i = 0; i < 6; i++){
//            LogHelper.info(i+" " + (i / 3) + " " + (i % 3));
//        }

        //BCEffectHandler.testRenderer.spawnEffectParticle(EnumParticleTypes.BARRIER.getParticleID(), player.posX, player.posY, player.posZ, 0, 0, 0);
        //world.spawnParticle(EnumParticleTypes.BARRIER, player.posX, player.posY, player.posZ + 1, 0, 0, 0);
        // for (int i = 0; i < 20000; i++) BCEffectHandler.s(new ResourceLocation("textures/particle/particles.png"), new EntitySpellParticleFX.AmbientMobFactory().getEntityFX(EnumParticleTypes.SPELL_MOB.getParticleID(), world, player.posX + itemRand.nextDouble(), player.posY+itemRand.nextDouble(), player.posZ + itemRand.nextDouble(), 0, 0, 0));

//        for (int i = 0; i < 200; i++) BCEffectHandler.spawnFX(DEParticles.ENERGY_PARTICLE, world, player.posX+ itemRand.nextFloat(), player.posY+ itemRand.nextFloat(), player.posZ+ itemRand.nextFloat(), player.posX, player.posY, player.posZ + 10);

//        LogHelper.info("Clic");
//        int posX = (int)player.posX;
//        int posY = (int)player.posY;
//        int posZ = (int)player.posZ;
//        int size = 500;
//
//
//        for (int x = posX; x < posX + size; x++){
//            double perc = (double)(x - posX) / (double)(size);
//            LogHelper.info(perc * 100D+"-Percent");
//            for (int z = posZ; z < posZ + size; z++){
//                for (int y = posY; y < 255; y++){
//                    BlockPos pos = new BlockPos(x, y, z);
//
//                    double noise = 0;
//
//                    for (int octave = 1; octave < 5; octave++) {
//                        double d = octave * 0.007D;
//                        noise +-= SimplexNoise.noise(x * d, y * d, z * d);
//                    }
//
//
//
//                    //noise = Math.abs(noise);
//
//                    //LogHelper.info(noise);
//                    double d = 0.05D;
//                    if (noise > SimplexNoise.noise(y * d, x * d, z * d)) {
//                        world.setBlockState(pos, Blocks.stone.getDefaultState());
//                    }
//                    else {
//                       // world.setBlockToAir(pos);
//                    }
//                }
//            }
//        }



//        for (int x = posX; x < posX + size; x++){
//            for (int y = posY; y < posY + size; y++){
//                for (int z = posZ; z < posZ + size; z++){
//                    BlockPos pos = new BlockPos(x, y, z);
//
//                    double dist = Utills.getDistanceAtoB(x - posX, y - posY, z - posZ, size / 2, size / 2, size / 2);
//
//                    dist /= size;
//
//                   // dist = 1 - dist;
//
//                   //LogHelper.info(dist);
//
//                    double noise = 0;
//
//                    for (int octave = 1; octave < 2; octave++) {
//                        double d = octave * 0.5D;
//                        noise += SimplexNoise.noise(x * d, y * d, z * d) - (dist * 2);
//                    }
//
//
//
//                    //noise = Math.abs(noise);
//
//                    //LogHelper.info(noise);
//
//                    if (noise > 0) {
//                       world.setBlockState(pos, Blocks.stone.getDefaultState());
//                    }
//                    else {
//                       world.setBlockToAir(pos);
//                    }
//                }
//            }
//        }
//
//        LogHelper.info("Done!");
//
//
//
//
//
//        for (int x = posX; x < posX + size; x++){
//            for (int y = posY; y < posY + size; y++){
//                for (int z = posZ; z < posZ + size; z++){
//                    BlockPos pos = new BlockPos(x, y, z);
//
//                    double noise = 0;
//
//                    for (int octave = 1; octave < 5; octave++) {
//                        double d = octave * 0.005D;
//                        noise += SimplexNoise.noise(x * d, y * d, z * d);
//                    }
//
//
//
//                    //noise = Math.abs(noise);
//
//                    //LogHelper.info(noise);
//
//                    if (noise > 0) {
//                        world.setBlockState(pos, Blocks.stone.getDefaultState());
//                    }
//                    else {
//                        world.setBlockToAir(pos);
//                    }
//                }
//            }
//        }


        return super.onItemRightClick(itemStack, world, player, hand);
    }
}


//int drain = Integer.MAX_VALUE;
//long ticks = Long.MAX_VALUE / drain;
//long seconds = ticks / 20;
//long minutes = seconds / 60;
//long hours = minutes / 60;
//long days = hours / 24;
//double years = days / 365D;
//int centuries = (int)years / 100;
//LogHelper.info(centuries+" "+years+" "+Integer.MAX_VALUE);