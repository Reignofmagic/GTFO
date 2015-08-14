package com.reignofmagic.gems.items;

import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.helper.RegisterHelper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	   //Gems
	   public static Item gemCitrine;
	   
	   //Tools
	   public static Item citrinePickaxe;
	   
	   public static Item citrineAxe;
	   
	   public static Item citrineHoe;
	   
	   public static Item citrineShovel;
	   
	   public static Item citrineSword;
	   
	   //Armor
	   public static Item citrineHelmet;
	   public static Item citrineChest;
	   public static Item citrineLegs;
	   public static Item citrineBoots;
	   //Materials Tool Single Purpose
	   
	   public static Item.ToolMaterial gemCITRINE = EnumHelper.addToolMaterial("gemCITRINE", 2, 175, 5F, 1.5F, 16);
	   public static Item.ToolMaterial gemTOPAZ = EnumHelper.addToolMaterial("gemTOPAZ", 2, 225, 5.5F, 2F, 14);
	   public static Item.ToolMaterial gemQUARTZ = EnumHelper.addToolMaterial("gemQUARTZ", 2, 250, 6F, 2.5F, 12);
	   public static Item.ToolMaterial gemOPAL = EnumHelper.addToolMaterial("gemOPAL", 2, 900, 7F, 2.75F, 12);
	   public static Item.ToolMaterial gemDIAMOND = EnumHelper.addToolMaterial("gemDIMAOND", 3, 1563, 8F, 3F, 10);
	   public static Item.ToolMaterial gemSAPPHIRE = EnumHelper.addToolMaterial("gemSAPPHIRE", 3, 1860, 9F, 4F, 12);
	   public static Item.ToolMaterial gemRUBY = EnumHelper.addToolMaterial("gemRUBY", 3, 2190, 10F, 5F, 14);
	   public static Item.ToolMaterial gemEMERALD = EnumHelper.addToolMaterial("gemEMERALD", 3, 3310, 11F, 7F, 16);
	   public static Item.ToolMaterial gemAMYTHEST = EnumHelper.addToolMaterial("gemAMYTHEST", 3, 5120, 12F, 9F, 20);
	   public static Item.ToolMaterial gemJET = EnumHelper.addToolMaterial("gemJET", 3, 8686, 15F, 11F, 25);
	   
	   //Multiple Tool Materials
	   public static Item.ToolMaterial gemCITRINEPoel = EnumHelper.addToolMaterial("gemCITRINEPoel", 2, 675, 50F, 1.5F, 16);
	   
	   
	   //Armor Material
	   public static ArmorMaterial gemCITRINEarmor = EnumHelper.addArmorMaterial("gemCITRINEarmor", 10, new int[]{2, 4, 3, 1}, 16);
	   
	
	public static void LoadItems()
	{
		//Gems
    	gemCitrine = new ItemGemCitrine();
    	RegisterHelper.registerItem(gemCitrine);
    	 		
    	//Tools
    	citrinePickaxe = new ItemCitrinePickaxe(gemCITRINE);
    	RegisterHelper.registerItem(citrinePickaxe);
    	
    	citrineAxe = new ItemCitrineAxe(gemCITRINE);
    	RegisterHelper.registerItem(citrineAxe);
    	
    	citrineShovel = new ItemCitrineShovel(gemCITRINE);
    	RegisterHelper.registerItem(citrineShovel);
    	
    	citrineHoe = new ItemCitrineHoe(gemCITRINE);
    	RegisterHelper.registerItem(citrineHoe);
    	
    	citrineSword = new ItemCitrineSword(gemCITRINE);
    	RegisterHelper.registerItem(citrineSword);
    	
    	
    	// Armor
    	
    	citrineHelmet = new ItemCitrineArmor(gemCITRINEarmor, 0, 0).setUnlocalizedName("citrineHelmet").setTextureName(Reference.MODID + ":" + "citrineHelmet"); 	
    	RegisterHelper.registerItem(citrineHelmet);
    	
    	citrineChest = new ItemCitrineArmor(gemCITRINEarmor, 0, 1).setUnlocalizedName("citrineChest").setTextureName(Reference.MODID + ":" + "citrineChest");	
    	RegisterHelper.registerItem(citrineChest);
    	
    	citrineLegs = new ItemCitrineArmor(gemCITRINEarmor, 0, 2).setUnlocalizedName("citrineLegs").setTextureName(Reference.MODID + ":" + "citrineLegs"); 	
    	RegisterHelper.registerItem(citrineLegs);
    	
    	citrineBoots = new ItemCitrineArmor(gemCITRINEarmor, 0, 3).setUnlocalizedName("citrineBoots").setTextureName(Reference.MODID + ":" + "citrineBoots");; 	
    	RegisterHelper.registerItem(citrineBoots);
	}

}
