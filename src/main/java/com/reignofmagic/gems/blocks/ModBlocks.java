package com.reignofmagic.gems.blocks;

import com.reignofmagic.gems.helper.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks {

	public static Block gemBlocks;
	public static Block gemOres;
	

	public static void loadBlocks() {

		//Gem Blocks
		gemBlocks = new gemBlocks();
		GameRegistry.registerBlock(gemBlocks, ItemgemOres.class, "allGemBlocks");
		
		
		// Ores

		gemOres = new gemOres();
		GameRegistry.registerBlock(gemOres, ItemgemOres.class, "AllGems");

	}

}
