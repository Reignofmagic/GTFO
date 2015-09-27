package com.reignofmagic.gems.items;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.init.ModItems;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemDualTool extends ItemPickaxe {

	public ItemDualTool(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name + "dualTool");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
		this.setHarvestLevel("pickaxe", 10);
		this.setHarvestLevel("Shovel", 10);

	}

	@Override
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("pickaxe", "shovel");
	}

	@Override
	public int getHarvestLevel(ItemStack itemStack, String toolClass) {
		if ((toolClass.equals("shovel") || toolClass.equals("pickaxe"))) {
			return super.getHarvestLevel(itemStack, toolClass);
		} else {
			return -1;
		}
	}
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
	return par2ItemStack.isItemEqual(new ItemStack(ModItems.gemPutty)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
	}

}
