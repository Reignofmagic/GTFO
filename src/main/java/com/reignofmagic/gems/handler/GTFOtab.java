package com.reignofmagic.gems.handler;

import com.reignofmagic.gems.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class GTFOtab extends CreativeTabs{
	public GTFOtab(int par1, String par2Str)
	{
		super(par1, par2Str);
		
	}
	@Override
	public Item getTabIconItem(){
		return ModItems.gemCitrine;
	}
}
	