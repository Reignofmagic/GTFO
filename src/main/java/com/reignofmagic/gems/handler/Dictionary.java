package com.reignofmagic.gems.handler;

import com.reignofmagic.gems.blocks.ModBlocks;
import com.reignofmagic.gems.items.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Dictionary {

	public static final int WILDCARD_VALUE = Short.MAX_VALUE;

	public static void oreDictionary() {

		// Ores
		OreDictionary.registerOre("oreTopaz", new ItemStack(ModBlocks.gemOres, WILDCARD_VALUE, 0));
		OreDictionary.registerOre("oreMalachite", new ItemStack(ModBlocks.gemOres, WILDCARD_VALUE, 1));

		// Gems

		// Failed attempts
		// OreDictionary.registerOre("gemMalachite", new
		// ItemStack(ModItems.Gemstones, 1));

		OreDictionary.registerOre("gemTopaz", new ItemStack(ModItems.Gemstones, WILDCARD_VALUE, 0));
		OreDictionary.registerOre("gemMalachite", new ItemStack(ModItems.Gemstones, WILDCARD_VALUE, 1));
	}
}
