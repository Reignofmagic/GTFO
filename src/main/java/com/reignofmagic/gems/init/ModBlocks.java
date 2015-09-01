package com.reignofmagic.gems.init;

import com.reignofmagic.gems.blocks.GemBlocks;
import com.reignofmagic.gems.blocks.GemOres;
import com.reignofmagic.gems.blocks.ItemGemOres;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block gemBlocks;
	public static Block gemOres;
	

	public static void loadBlocks() {

		//Gem Blocks
		gemBlocks = new GemBlocks();
		GameRegistry.registerBlock(gemBlocks, ItemGemOres.class, "allGemBlocks");
		
		
		// Ores
		gemOres = new GemOres();
		GameRegistry.registerBlock(gemOres, ItemGemOres.class, "AllGems");

	}

}
