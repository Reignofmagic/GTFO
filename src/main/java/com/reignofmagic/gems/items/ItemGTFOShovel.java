package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.init.ModItems;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemGTFOShovel extends ItemSpade{
	public ItemGTFOShovel(ToolMaterial material, String name)
	{
		super(material);
		setUnlocalizedName(Reference.MODID + "_" + name + "Shovel");
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
	}

}
