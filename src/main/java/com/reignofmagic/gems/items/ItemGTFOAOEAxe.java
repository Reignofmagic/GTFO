package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.init.AOEHarvestAxe;

import net.minecraft.item.Item.ToolMaterial;

public class ItemGTFOAOEAxe extends AOEHarvestAxe {

	public ItemGTFOAOEAxe(ToolMaterial material, String name) {
		super(material, 1, 0);
		setUnlocalizedName(Reference.MODID + "_" + name + "AOEAxe");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
		

	}
}
