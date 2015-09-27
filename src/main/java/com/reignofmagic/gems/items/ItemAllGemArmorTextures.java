package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.init.ModItems;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemAllGemArmorTextures extends ItemArmor 
{

	public ItemAllGemArmorTextures(ArmorMaterial armourMaterial, int renderIndex,int armourType) 
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
		} 
		if (stack.getItem() == (ModItems.malachiteHelmet)
				|| stack.getItem() == ModItems.malachiteBoots
				|| stack.getItem() == ModItems.malachiteChest) {
			return (Reference.MODID + ":models/armor/malachiteArmor1.png");
		} else if (stack.getItem() == ModItems.malachiteLegs) {
			return Reference.MODID + ":models/armor/malachiteArmor2.png";
		} 
		if (stack.getItem() == (ModItems.quartzHelmet)
				|| stack.getItem() == ModItems.quartzBoots
				|| stack.getItem() == ModItems.quartzChest) {
			return (Reference.MODID + ":models/armor/quartzArmor1.png");
		} else if (stack.getItem() == ModItems.quartzLegs) {
			return Reference.MODID + ":models/armor/quartzArmor2.png";
		}
		if (stack.getItem() == (ModItems.amberHelmet)
				|| stack.getItem() == ModItems.amberBoots
				|| stack.getItem() == ModItems.amberChest) {
			return (Reference.MODID + ":models/armor/amberArmor1.png");
		} else if (stack.getItem() == ModItems.amberLegs) {
			return Reference.MODID + ":models/armor/amberArmor2.png";
		}
		if (stack.getItem() == (ModItems.tanzaniteHelmet)
				|| stack.getItem() == ModItems.tanzaniteBoots
				|| stack.getItem() == ModItems.tanzaniteChest) {
			return (Reference.MODID + ":models/armor/tanzaniteArmor1.png");
		} else if (stack.getItem() == ModItems.tanzaniteLegs) {
			return Reference.MODID + ":models/armor/tanzaniteArmor2.png";
		}
		if (stack.getItem() == (ModItems.peridotHelmet)
				|| stack.getItem() == ModItems.peridotBoots
				|| stack.getItem() == ModItems.peridotChest) {
			return (Reference.MODID + ":models/armor/peridotArmor1.png");
		} else if (stack.getItem() == ModItems.peridotLegs) {
			return Reference.MODID + ":models/armor/peridotArmor2.png";
		}
		if (stack.getItem() == (ModItems.sapphireHelmet)
				|| stack.getItem() == ModItems.sapphireBoots
				|| stack.getItem() == ModItems.sapphireChest) {
			return (Reference.MODID + ":models/armor/sapphireArmor1.png");
		} else if (stack.getItem() == ModItems.sapphireLegs) {
			return Reference.MODID + ":models/armor/sapphireArmor2.png";
		}
		if (stack.getItem() == (ModItems.rubyHelmet)
				|| stack.getItem() == ModItems.rubyBoots
				|| stack.getItem() == ModItems.rubyChest) {
			return (Reference.MODID + ":models/armor/rubyArmor1.png");
		} else if (stack.getItem() == ModItems.rubyLegs) {
			return Reference.MODID + ":models/armor/rubyArmor2.png";
		}
		if (stack.getItem() == (ModItems.emeraldHelmet)
				|| stack.getItem() == ModItems.emeraldBoots
				|| stack.getItem() == ModItems.emeraldChest) {
			return (Reference.MODID + ":models/armor/emeraldArmor1.png");
		} else if (stack.getItem() == ModItems.emeraldLegs) {
			return Reference.MODID + ":models/armor/emeraldArmor2.png";
		}
		if (stack.getItem() == (ModItems.amethystHelmet)
				|| stack.getItem() == ModItems.amethystBoots
				|| stack.getItem() == ModItems.amethystChest) {
			return (Reference.MODID + ":models/armor/amethystArmor1.png");
		} else if (stack.getItem() == ModItems.amethystLegs) {
			return Reference.MODID + ":models/armor/amethystArmor2.png";
		}
		if (stack.getItem() == (ModItems.jetHelmet)
				|| stack.getItem() == ModItems.jetBoots
				|| stack.getItem() == ModItems.jetChest) {
			return (Reference.MODID + ":models/armor/jetArmor1.png");
		} else if (stack.getItem() == ModItems.jetLegs) {
			return Reference.MODID + ":models/armor/jetArmor2.png";
		}
		
		else {
			System.out.println("invalid armor code");
			return null;
		}

	}
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
	return par2ItemStack.isItemEqual(new ItemStack(ModItems.gemPutty)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
}
	
	