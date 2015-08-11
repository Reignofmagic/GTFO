package com.reignofmagic.gems.items;

import com.reignofmagic.gems.helper.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemCitrineSword extends ItemSword{
	public ItemCitrineSword(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("citrineSword");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabTools);
		
		
	
	}
}
