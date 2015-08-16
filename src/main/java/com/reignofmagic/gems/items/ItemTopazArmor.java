package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemTopazArmor extends ItemArmor 
{

	public ItemTopazArmor(ArmorMaterial armourMaterial, int renderIndex,int armourType) 
	{
		super(armourMaterial, renderIndex, armourType);
		setCreativeTab(Gems.GTFOtab);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == (ModItems.topazHelmet)
				|| stack.getItem() == ModItems.topazBoots
				|| stack.getItem() == ModItems.topazChest) {
			return (Reference.MODID + ":models/armor/topazArmor1.png");
		} else if (stack.getItem() == ModItems.topazLegs) {
			return Reference.MODID + ":models/armor/topazArmor2.png";
		} else {
			System.out.println("invalid armor code");
			return null;
		}

	}
}
	
	