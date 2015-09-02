package com.reignofmagic.gems.world;

import java.util.Random;

import com.reignofmagic.gems.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class ReignWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);

		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);

		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateEnd(World world, Random random, int x, int z) {}

	private void generateSurface(World world, Random random, int x, int z) {
		for (int i = 0; i < ModBlocks.gemOres.icons.length; i++) { //Consider using a different array for length
			int[] ints = getRelevantInts(i, random);
			addOreSpawn(ModBlocks.gemOres, i, world, random, x, z, 16, 16, ints[0], ints[1], ints[2], ints[3])
		}
	}

	private void generateNether(World world, Random random, int x, int z) {}

	/**
	 * @param metadata			The metadata for the block whose relevantInts you want
	 * @param random			Just an instance of the Random class
	 * @return 	The ints needed for the ore generation
	*/
	private int[] getRelevantInts(int metadata, Random random) {
		int[] ret = new int[];
		switch (metadata) {
			case 0:
				ret = { 5 + random.nextInt(9), 15, 1, 128 };
			case 1:
				ret = { 4 + random.nextInt(8), 15, 1, 96 };
			case 2:
				ret = { 4 + random.nextInt(7), 15, 1, 64 };
			case 3:
				ret = { 3 + random.nextInt(5), 10, 1, 64 };
			case 4:
				ret = { 3 + random.nextInt(5), 6, 1, 48 };
			case 5:
				ret = { 3 + random.nextInt(4), 6, 1, 48 };
			case 6:
				ret = { 3 + random.nextInt(4), 6, 1, 32 };
			case 7:
				ret = { 2 + random.nextInt(3), 4, 1, 12 };
			case 8:
				ret = { 2 + random.nextInt(3), 4, 1, 12 };
			default:
				ret = { 5 + random.nextInt(9), 15, 1, 128 };
		}
		return ret;
	}

	/**
	 * @param block 			The Block to spawn
	 * @param metadata 			The metadata
	 * @param target 			The Block where to generate in
	 * @param world 			The world to spawn in
	 * @param random 			A random object for retrieving random positions within the world
	 * to spawn the block
	 * @param blockXPos			an int for passing the x coordinate for the generation method
	 * @param blockZPos			an int for passing the Z-coordinate for generation method
	 * @param maxX				an int for setting the maximum x coordinate values for spawning on
	 * the x axis on a per chunk basis
	 * @param maxZ				an int for setting the maximum z coordinate values for spawning on
	 * the z axis on a per chunk basis
	 * @param maxVeinSize		an int for setting the maximum size of a vein
	 * @param chancesToSpawn	an int for the number of chances available for the block to spawn
	 * per chunk
	 * @param minY				an int for the minimum y coordinate height at which this block may
	 * spawn
	 * @param maxY				an int for the maximum y coordinate height at which this block may
	 * spawn
	 */
	public void addOreSpawn(Block block, int metadata, Block target, World world, Random random, int blockXPos,
			int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: the Maximum x must be greater than 0 but less than 16";
		assert minY > 0 : "addOreSpawn: the minimum y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: the maximum y must be les than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: the maximum z must be greater than 0 and less than 16";

		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, metadata, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
		}
	}
}
