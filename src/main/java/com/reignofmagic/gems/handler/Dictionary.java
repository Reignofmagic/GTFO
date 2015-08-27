package com.reignofmagic.gems.handler;

import com.reignofmagic.gems.blocks.ModBlocks;
import com.reignofmagic.gems.items.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Dictionary {

		public static void oreDictionary() {

		// Ores
		OreDictionary.registerOre("oreTopaz", new ItemStack(ModBlocks.gemOres, 1, 0));
		OreDictionary.registerOre("oreMalachite", new ItemStack(ModBlocks.gemOres, 1, 1));

		// Gems
		OreDictionary.registerOre("gemTopaz", new ItemStack(ModItems.Gemstones, 1, 0));
		OreDictionary.registerOre("gemMalachite", new ItemStack(ModItems.Gemstones, 1, 1));
	}
}
