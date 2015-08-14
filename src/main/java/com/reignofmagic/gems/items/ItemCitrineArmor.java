package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCitrineArmor extends ItemArmor 
{

	public ItemCitrineArmor(ArmorMaterial armourMaterial, int renderIndex,int armourType) 
	{
		super(armourMaterial, renderIndex, armourType);
		setCreativeTab(Gems.GTFOtab);
	}
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == (ModItems.citrineHelmet)
				|| stack.getItem() == ModItems.citrineBoots
				|| stack.getItem() == ModItems.citrineChest) {
			return (Reference.MODID + ":models/armor/citrineArmor1.png");
		} else if (stack.getItem() == ModItems.citrineLegs) {
			return Reference.MODID + ":models/armor/citrineArmor2.png";
		} else {
			System.out.println("invalid armor code");
			return null;
		}

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	/*	{
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(CreativeTabs.tabTools);
	}
	// overids are linked to mod not generic
		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, int slot,
				String type) {
			if (stack.getItem() == (Gems.citrineHelmet)
					|| stack.getItem() == Gems.citrineBoots
					|| stack.getItem() == Gems.citrineChest) {
				return (Reference.MODID + ":models/armor/citrineArmor1.png");
			} else if (stack.getItem() == Gems.citrineLegs) {
				return Reference.MODID + ":models/armor/citrineArmor2.png";
			} else {
				System.out.println("invalid armor code");
				return null;
			}

		}
}
	
	*/
	
	
	
	/*@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == Gems.citrineHelmet)
		{
			return Reference.MODID + ":models/armor/citrineArmor1.png";
		}
		else
		{
			System.out.println("Invalid Item gemCitrinearmor");
		}
			
		return null;
	}

	
}*/
