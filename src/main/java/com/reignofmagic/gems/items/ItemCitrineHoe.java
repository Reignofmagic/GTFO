package com.reignofmagic.gems.items;

import com.reignofmagic.gems.helper.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;


public class ItemCitrineHoe extends ItemHoe{
	public ItemCitrineHoe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("citrineHoe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabTools);
		
		
	
	}
}
