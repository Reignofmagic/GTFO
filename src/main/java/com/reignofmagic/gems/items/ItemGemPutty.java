package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import net.minecraft.item.Item;

public class ItemGemPutty extends Item {
	public ItemGemPutty() {
		super();
		setUnlocalizedName(Reference.MODID + "_" + "name" + "Putty");
		setCreativeTab(Gems.GTFOtab);
}
}
