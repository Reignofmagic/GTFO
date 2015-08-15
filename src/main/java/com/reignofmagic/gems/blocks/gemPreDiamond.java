package com.reignofmagic.gems.blocks;

import java.util.List;
import java.util.Random;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.items.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class gemPreDiamond extends Block{
	
	String name = "LowGem";
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	
	public gemPreDiamond()
	{
		super(Material.rock);
		setBlockName(Reference.MODID + "_" + name);
		setStepSound(soundTypeStone);
		setHardness(2.5F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 2);
	}	
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		icons = new IIcon(2);
		for (int i =0; i < icons.length; i++)
		{
			icons(i) = par1IconRegister.registerIcon(Reference.MODID + ":" + "lowgems" + i);
		}
	}
		@Override
		@SideOnly(Side.CLIENT)
		public IIcon getIcon(int par1, int par2){
			return icons(par2);
		}
		
		
		@SuppressWarnings({"unchecked", "rawtypes"})
		@SideOnly(Side.CLIENT)
		@Override
				public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
				{
			for (int var4 = 0; var4 < 2; ++var4)
			{
				par3List.add(new ItemStack(par1, 1, var4));
			}
				}
		

	
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune)
	{
		return ModItems.gemCitrine;
	}

}
