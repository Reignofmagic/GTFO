package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.init.AOEHarvestDual;

import net.minecraft.item.Item.ToolMaterial;

public class ItemGTFOAOEDual extends AOEHarvestDual {

	public ItemGTFOAOEDual(ToolMaterial material, String name) {
		super(material, 1, 0);
		setUnlocalizedName(Reference.MODID + "_" + name + "AOEDual");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
		

	}
}
