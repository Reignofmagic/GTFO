package com.reignofmagic.gems.items;

import com.reignofmagic.gems.blocks.ItemgemPreDiamond;
import com.reignofmagic.gems.blocks.gemPreDiamond;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.helper.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	
	   /*Gems Now unused due to Metadata
	   public static Item gemCitrine;
	  */
	   
	   //Gems Metadata 1
	   public static Item PreDiamondgemstones;
	   
	   
	  	   
	   //Tools
	   public static Item topazPickaxe;
	   
	   public static Item topazAxe;
	   
	   public static Item topazHoe;
	   
	   public static Item topazShovel;
	   
	   public static Item topazSword;
	   
	   public static Item malachitePickaxe;
	   
	   //Armor
	   public static Item topazHelmet;
	   public static Item topazChest;
	   public static Item topazLegs;
	   public static Item topazBoots;
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
		/*Gems now unused due to metadata
    	gemCitrine = new ItemGemCitrine();
    	RegisterHelper.registerItem(gemCitrine);*/
    	
    	
    	//Gems metadata 1
    	PreDiamondgemstones = new ItemGemstones();
    	GameRegistry.registerItem(PreDiamondgemstones, "LowGemstones");
    
    	
    	
    	
    	
    	//Tools
    	topazPickaxe = new ItemTopazPickaxe(gemCITRINE);
    	RegisterHelper.registerItem(topazPickaxe);
    	
    	topazAxe = new ItemTopazAxe(gemCITRINE);
    	RegisterHelper.registerItem(topazAxe);
    	
    	topazShovel = new ItemTopazShovel(gemCITRINE);
    	RegisterHelper.registerItem(topazShovel);
    	
    	topazHoe = new ItemTopazHoe(gemCITRINE);
    	RegisterHelper.registerItem(topazHoe);
    	
    	topazSword = new ItemTopazSword(gemCITRINE);
    	RegisterHelper.registerItem(topazSword);
    	
    	malachitePickaxe = new ItemMalachitePickaxe(gemTOPAZ);
    	RegisterHelper.registerItem(malachitePickaxe);
    	
    	
    	// Armor
    	
    	topazHelmet = new ItemTopazArmor(gemCITRINEarmor, 0, 0).setUnlocalizedName("topazHelmet").setTextureName(Reference.MODID + ":" + "topazHelmet"); 	
    	RegisterHelper.registerItem(topazHelmet);
    	
    	topazChest = new ItemTopazArmor(gemCITRINEarmor, 0, 1).setUnlocalizedName("topazChest").setTextureName(Reference.MODID + ":" + "topazChest");	
    	RegisterHelper.registerItem(topazChest);
    	
    	topazLegs = new ItemTopazArmor(gemCITRINEarmor, 0, 2).setUnlocalizedName("topazLegs").setTextureName(Reference.MODID + ":" + "topazLegs"); 	
    	RegisterHelper.registerItem(topazLegs);
    	
    	topazBoots = new ItemTopazArmor(gemCITRINEarmor, 0, 3).setUnlocalizedName("topazBoots").setTextureName(Reference.MODID + ":" + "topazBoots");; 	
    	RegisterHelper.registerItem(topazBoots);
	}

}
