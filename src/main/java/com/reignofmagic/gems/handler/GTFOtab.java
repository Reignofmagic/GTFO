package com.reignofmagic.gems.handler;

import com.reignofmagic.gems.items.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class GTFOtab extends CreativeTabs{
	public GTFOtab(int par1, String par2Str)
	{
		super(par1, par2Str);
		
	}
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem(){
		return ModItems.topazPickaxe;
	}
}
	