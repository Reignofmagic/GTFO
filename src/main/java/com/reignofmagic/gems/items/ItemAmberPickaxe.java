package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ItemAmberPickaxe extends ItemPickaxe{
	public ItemAmberPickaxe(ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + "amberPickaxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
		
		
	
	}
}
