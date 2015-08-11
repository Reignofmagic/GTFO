package com.reignofmagic.gems.items;

import com.reignofmagic.gems.helper.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemCitrinePickaxe extends ItemPickaxe{
	public ItemCitrinePickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName("citrinePickaxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabTools);
		
		
	
	}
}
