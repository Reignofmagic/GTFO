package com.reignofmagic.gems.blocks;

import com.reignofmagic.gems.helper.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks 
{
	   //Ores
	   public static Block oreCitrine; 
	   
public static void loadBlocks()
	{
	//Ores
	oreCitrine = new BlockOreCitrine();
	RegisterHelper.registerBlock(oreCitrine);
	}

}
