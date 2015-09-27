package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.init.ModItems;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemGTFOSword extends ItemSword{
	public ItemGTFOSword(ToolMaterial material, String name)
	{
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name + "Sword");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
	}
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
	return par2ItemStack.isItemEqual(new ItemStack(ModItems.gemPutty)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
}
