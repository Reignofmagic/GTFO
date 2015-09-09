package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import net.minecraft.item.ItemHoe;

public class ItemGTFOHoe extends ItemHoe {
	public ItemGTFOHoe(ToolMaterial material, String name) {
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name + "Hoe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
	}
}
