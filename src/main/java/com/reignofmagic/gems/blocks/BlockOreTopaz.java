package com.reignofmagic.gems.blocks;

import java.util.Random;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockOreTopaz extends Block{
	public BlockOreTopaz()
	{
		super(Material.rock);
		setBlockName("oreTopaz");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
		setStepSound(soundTypeStone);
		setHardness(2.5F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 1);
		
	}
	
/*	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune)
	{
		return ModItems.gemTopaz;
	}*/

}
