package com.reignofmagic.gems.items;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.reignofmagic.gems.Gems;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemToolTest extends ItemPickaxe {

	public ItemToolTest(ToolMaterial material) {
		super(material);
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
		} 
			else {
			return -1;
		}
	}
	

}
