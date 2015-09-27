package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.init.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemGTFOHoe extends ItemHoe {
	public ItemGTFOHoe(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name + "Hoe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
	
		}
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
	return par2ItemStack.isItemEqual(new ItemStack(ModItems.gemPutty)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
}
