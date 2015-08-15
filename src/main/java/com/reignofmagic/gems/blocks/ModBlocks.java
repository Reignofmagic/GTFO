package com.reignofmagic.gems.blocks;

import com.reignofmagic.gems.helper.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks 
{
	   //Ores
	   public static Block oreCitrine; 
	   
	   public static Block gemPreDiamond;
/*	   
 * Metadata attempt
 * public static Block lowtierGems;
*/	   
	   
public static void loadBlocks()
	{
	//Ores
	oreCitrine = new BlockOreCitrine();
	GameRegistry.registerBlock(oreCitrine, "OreCitrine");
	
	
	GameRegistry.registerBlock(gemPreDiamond,  ItemgemPreDiamond.class, "LowGems");
	
	//Metadata old
	 //GameRegistry.registerBlock(lowtierGems, BlockLowGems.class, lowtierGems.getUnlocalizedName().substring(5));*/
	}

}
