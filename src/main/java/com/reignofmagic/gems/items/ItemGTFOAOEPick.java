package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.init.AOEHarvestPick;

import net.minecraft.item.Item.ToolMaterial;

public class ItemGTFOAOEPick extends AOEHarvestPick {

	public ItemGTFOAOEPick(ToolMaterial material, String name) {
		super(material, 1, 0);
		setUnlocalizedName(Reference.MODID + "_" + name + "AOEPick");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
		

	}
}
