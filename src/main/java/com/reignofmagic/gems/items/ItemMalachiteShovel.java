package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemMalachiteShovel extends ItemSpade{
	public ItemMalachiteShovel(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + "malachiteShovel");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
		
		
	
	}
}
