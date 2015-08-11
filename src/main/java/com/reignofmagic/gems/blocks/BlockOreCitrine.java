package com.reignofmagic.gems.blocks;

import java.util.Random;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockOreCitrine extends Block{
	public BlockOreCitrine()
	{
		super(Material.rock);
		setBlockName("oreCitrine");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabBlock);
		setStepSound(soundTypeStone);
		setHardness(2.5F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 1);
		
	}
	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune)
	{
		return Gems.gemCitrine;
	}

}
