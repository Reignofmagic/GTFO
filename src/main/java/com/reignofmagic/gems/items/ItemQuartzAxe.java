package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class ItemQuartzAxe extends ItemAxe{
	public ItemQuartzAxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + "quartzAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
		
		
	
	}
}
