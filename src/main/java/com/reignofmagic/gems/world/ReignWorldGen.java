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

	private void generateEnd(World world, Random random, int x, int z) {

	}

	private void generateSurface(World world, Random random, int x, int z) {
		addOreSpawn(ModBlocks.gemOres, 0, world, random, x, z, 16, 16, 5 + random.nextInt(9), 15, 1, 128);//topaz
		addOreSpawn(ModBlocks.gemOres, 1, world, random, x, z, 16, 16, 4 + random.nextInt(8), 15, 1, 96);//malachite
		addOreSpawn(ModBlocks.gemOres, 2, world, random, x, z, 16, 16, 4 + random.nextInt(7), 15, 1, 64);//amber
		addOreSpawn(ModBlocks.gemOres, 3, world, random, x, z, 16, 16, 3 + random.nextInt(5), 10, 1, 64);//tanzanite
		addOreSpawn(ModBlocks.gemOres, 4, world, random, x, z, 16, 16, 3 + random.nextInt(5), 6, 1, 48);//peridot
		addOreSpawn(ModBlocks.gemOres, 5, world, random, x, z, 16, 16, 3 + random.nextInt(4), 6, 1, 48);//sapphire
		addOreSpawn(ModBlocks.gemOres, 6, world, random, x, z, 16, 16, 3 + random.nextInt(4), 6, 1, 32);//ruby
		addOreSpawn(ModBlocks.gemOres, 7, world, random, x, z, 16, 16, 2 + random.nextInt(3), 4, 1, 12);//amethyst
		addOreSpawn(ModBlocks.gemOres, 8, world, random, x, z, 16, 16, 2 + random.nextInt(3), 4, 1, 12);//jet
	}

	private void generateNether(World world, Random random, int x, int z) {

	}

	/**
	 * adds an ore spawn to minecraft simply register all ores to spawn with
	 * this method in your generation method in your IWorldGeneration extending
	 * class
	 * 
	 * @param The Block to spawn
	 * 
	 * @param The metadata
	 * 
	 * @param The Block where to generate in
	 * 
	 * @param the world to spawn in
	 * 
	 * @param a random object for retrieving random positions within the world
	 * to spawn the block
	 * 
	 * @param an int for passing the x coordinate for the generation method
	 * 
	 * @param an int for passing the Z-coordinate for generation method
	 * 
	 * @param an int for setting the maximum x coordinate values for spawning on
	 * the x axis on a per chunk basis
	 * 
	 * @param an int for setting the maximum z coordinate values for spawning on
	 * the z axis on a per chunk basis
	 * 
	 * @param an int for setting the maximum size of a vein
	 * 
	 * @param an int for the number of chances available for the block to spawn
	 * per chunk
	 * 
	 * @param an int for the minimum y coordinate height at which this block may
	 * spawn
	 * 
	 * @param an int for the maximum y coordinate height at which this block may
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
	
	public void addOreSpawn(Block block, int metadata, World world, Random random, int blockXPos,
			int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		this.addOreSpawn(block, metadata, Blocks.stone, world, random, blockXPos, blockZPos, maxX, maxZ, maxVeinSize, chancesToSpawn, minY, maxY);

	}
}
