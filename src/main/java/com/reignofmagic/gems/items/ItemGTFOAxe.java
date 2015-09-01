package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import net.minecraft.item.ItemAxe;

public class ItemGTFOAxe extends ItemAxe{
	public ItemGTFOAxe(ToolMaterial material, String name)
	{
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name + "Axe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
	}
}