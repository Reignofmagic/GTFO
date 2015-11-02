package com.reignofmagic.gems.init;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.blocks.GemBlocks;
import com.reignofmagic.gems.blocks.GemOres;
import com.reignofmagic.gems.blocks.GemLights;
import com.reignofmagic.gems.blocks.ItemGemOres;
import com.reignofmagic.gems.blocks.chesttest;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block gemBlocks;
	public static Block gemOres;
	public static Block chesttest;
	
	//Testing lights for a potential mod, please ignore
	public static Block GemLights;
	

	public static void loadBlocks() {

		//Gem Blocks
		gemBlocks = new GemBlocks();
		GameRegistry.registerBlock(gemBlocks, ItemGemOres.class, "allGemBlocks");
		
		
		// Ores
		gemOres = new GemOres();
		GameRegistry.registerBlock(gemOres, ItemGemOres.class, "AllGems");
		
		// Gem Lights
		GemLights = new GemLights();
		GameRegistry.registerBlock(GemLights, "basic");

		chesttest = new chesttest(0).setBlockName("Test Chest").setCreativeTab(Gems.GTFOtab);
		GameRegistry.registerBlock(chesttest, "Test Chest");
		
	
	
	
		
	}

}
