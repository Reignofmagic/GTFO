package com.reignofmagic.gems.blocks;

import com.reignofmagic.gems.helper.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks 
{
	   //Ores
	   public static Block oreTopaz; 
	   
	   public static Block gemPreDiamond;
/*	   
 *  attempt
 * public static Block lowtierGems;
*/	   
	   
public static void loadBlocks()
	{
	//Ores
	oreTopaz = new BlockOreTopaz();
	GameRegistry.registerBlock(oreTopaz, "OreTopaz");
	
	
	gemPreDiamond = new gemPreDiamond();
	GameRegistry.registerBlock(gemPreDiamond,  ItemgemPreDiamond.class, "LowGems");
	
	
	}

}
