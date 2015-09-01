package com.reignofmagic.gems.handler;

import com.reignofmagic.gems.blocks.ModBlocks;
import com.reignofmagic.gems.items.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Dictionary {

		public static void oreDictionary() {



		// Gems
		OreDictionary.registerOre("gemTopaz", new ItemStack(ModItems.Gemstones, 1, 0));
		OreDictionary.registerOre("gemMalachite", new ItemStack(ModItems.Gemstones, 1, 1));	
		OreDictionary.registerOre("gemAmber", new ItemStack(ModItems.Gemstones, 1, 2));	
		OreDictionary.registerOre("gemTanzanite", new ItemStack(ModItems.Gemstones, 1, 3));	
		OreDictionary.registerOre("gemPeridot", new ItemStack(ModItems.Gemstones, 1, 4));	
		OreDictionary.registerOre("gemSapphire", new ItemStack(ModItems.Gemstones, 1, 5));	
		OreDictionary.registerOre("gemRuby", new ItemStack(ModItems.Gemstones, 1, 6));	
		OreDictionary.registerOre("gemAmethyst", new ItemStack(ModItems.Gemstones, 1, 7));	
		OreDictionary.registerOre("gemJet", new ItemStack(ModItems.Gemstones, 1, 8));	
	
		// Gem Blocks
		OreDictionary.registerOre("blockTopaz", new ItemStack(ModBlocks.gemBlocks, 1, 0));
		OreDictionary.registerOre("blockMalachite", new ItemStack(ModBlocks.gemBlocks, 1, 1));	
		OreDictionary.registerOre("blockAmber", new ItemStack(ModBlocks.gemBlocks, 1, 2));	
		OreDictionary.registerOre("blockTanzanite", new ItemStack(ModBlocks.gemBlocks, 1, 3));	
		OreDictionary.registerOre("blockPeridot", new ItemStack(ModBlocks.gemBlocks, 1, 4));	
		OreDictionary.registerOre("blockSapphire", new ItemStack(ModBlocks.gemBlocks, 1, 5));	
		OreDictionary.registerOre("blockRuby", new ItemStack(ModBlocks.gemBlocks, 1, 6));	
		OreDictionary.registerOre("blockAmethyst", new ItemStack(ModBlocks.gemBlocks, 1, 7));	
		OreDictionary.registerOre("blockJet", new ItemStack(ModBlocks.gemBlocks, 1, 8));	
		
		// Ores
		OreDictionary.registerOre("oreTopaz", new ItemStack(ModBlocks.gemOres, 1, 0));
		OreDictionary.registerOre("oreMalachite", new ItemStack(ModBlocks.gemOres, 1, 1));	
		OreDictionary.registerOre("oreAmber", new ItemStack(ModBlocks.gemOres, 1, 2));	
		OreDictionary.registerOre("oreTanzanite", new ItemStack(ModBlocks.gemOres, 1, 3));	
		OreDictionary.registerOre("orePeridot", new ItemStack(ModBlocks.gemOres, 1, 4));	
		OreDictionary.registerOre("oreSapphire", new ItemStack(ModBlocks.gemOres, 1, 5));	
		OreDictionary.registerOre("oreRuby", new ItemStack(ModBlocks.gemOres, 1, 6));	
		OreDictionary.registerOre("oreAmethyst", new ItemStack(ModBlocks.gemOres, 1, 7));	
		OreDictionary.registerOre("oreJet", new ItemStack(ModBlocks.gemOres, 1, 8));
	}
}
