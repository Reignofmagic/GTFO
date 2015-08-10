package com.reignofmagic.gems.blocks;

import com.reignofmagic.gems.helper.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockOreCitrine extends Block{
	public BlockOreCitrine()
	{
		super(Material.rock);
		setBlockName("oreCitrine");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
	}

}
