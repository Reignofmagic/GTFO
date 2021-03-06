package com.reignofmagic.gems.init;

import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.helper.RegisterHelper;
import com.reignofmagic.gems.items.ItemAllGemArmorTextures;
import com.reignofmagic.gems.items.ItemDualTool;
import com.reignofmagic.gems.items.ItemGTFOAOEAxe;
import com.reignofmagic.gems.items.ItemGTFOAOEDual;
import com.reignofmagic.gems.items.ItemGTFOAxe;
import com.reignofmagic.gems.items.ItemGTFOHoe;
import com.reignofmagic.gems.items.ItemGTFOAOEPick;
import com.reignofmagic.gems.items.ItemGTFOAOEShovel;
import com.reignofmagic.gems.items.ItemGTFOPickaxe;
import com.reignofmagic.gems.items.ItemGTFOShovel;
import com.reignofmagic.gems.items.ItemGTFOSword;
import com.reignofmagic.gems.items.ItemGemPutty;
import com.reignofmagic.gems.items.ItemGemPuttyCompact;
import com.reignofmagic.gems.items.ItemGemstones;
import com.reignofmagic.gems.items.ItemToolTest;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;


// Thanks to Hlaaftana for making this page better Namely, auto generating tool types based on their name. 
public class ModItems {

	
	
	// Gems
	public static Item Gemstones;

	// Tools Section
	
	// Repair
	public static Item gemPutty;
	public static Item gemPuttyCompact;

	// Topaz
	public static Item topazPickaxe;
	public static Item topazAxe;
	public static Item topazHoe;
	public static Item topazShovel;
	public static Item topazSword;

	// Malachite
	public static Item malachitePickaxe;
	public static Item malachiteAxe;
	public static Item malachiteHoe;
	public static Item malachiteShovel;
	public static Item malachiteSword;

	// Quartz
	public static Item quartzPickaxe;
	public static Item quartzAxe;
	public static Item quartzHoe;
	public static Item quartzShovel;
	public static Item quartzSword;

	// Amber
	public static Item amberPickaxe;
	public static Item amberAxe;
	public static Item amberHoe;
	public static Item amberShovel;
	public static Item amberSword;

	// Tanzanite
	public static Item tanzanitePickaxe;
	public static Item tanzaniteAxe;
	public static Item tanzaniteHoe;
	public static Item tanzaniteShovel;
	public static Item tanzaniteSword;

	// Peridot
	public static Item peridotPickaxe;
	public static Item peridotAxe;
	public static Item peridotHoe;
	public static Item peridotShovel;
	public static Item peridotSword;

	// Sapphire
	public static Item sapphirePickaxe;
	public static Item sapphireAxe;
	public static Item sapphireHoe;
	public static Item sapphireShovel;
	public static Item sapphireSword;

	// Ruby
	public static Item rubyPickaxe;
	public static Item rubyAxe;
	public static Item rubyHoe;
	public static Item rubyShovel;
	public static Item rubySword;

	// Emerald
	public static Item emeraldPickaxe;
	public static Item emeraldAxe;
	public static Item emeraldHoe;
	public static Item emeraldShovel;
	public static Item emeraldSword;

	// Amethyst
	public static Item amethystPickaxe;
	public static Item amethystAxe;
	public static Item amethystHoe;
	public static Item amethystShovel;
	public static Item amethystSword;

	// Jet
	public static Item jetPickaxe;
	public static Item jetAxe;
	public static Item jetHoe;
	public static Item jetShovel;
	public static Item jetSword;

	// Armor Section

	// Topaz
	public static Item topazHelmet;
	public static Item topazChest;
	public static Item topazLegs;
	public static Item topazBoots;

	// Malachite
	public static Item malachiteHelmet;
	public static Item malachiteChest;
	public static Item malachiteLegs;
	public static Item malachiteBoots;
	// Quartz
	public static Item quartzHelmet;
	public static Item quartzChest;
	public static Item quartzLegs;
	public static Item quartzBoots;
	// Amber
	public static Item amberHelmet;
	public static Item amberChest;
	public static Item amberLegs;
	public static Item amberBoots;
	// Tanzanite
	public static Item tanzaniteHelmet;
	public static Item tanzaniteChest;
	public static Item tanzaniteLegs;
	public static Item tanzaniteBoots;
	// Peridot
	public static Item peridotHelmet;
	public static Item peridotChest;
	public static Item peridotLegs;
	public static Item peridotBoots;
	
	// Sapphire
	public static Item sapphireHelmet;
	public static Item sapphireChest;
	public static Item sapphireLegs;
	public static Item sapphireBoots;
	
	// Ruby
	public static Item rubyHelmet;
	public static Item rubyChest;
	public static Item rubyLegs;
	public static Item rubyBoots;
	
	// Emerald
	public static Item emeraldHelmet;
	public static Item emeraldChest;
	public static Item emeraldLegs;
	public static Item emeraldBoots;
	
	// Amethyst
	public static Item amethystHelmet;
	public static Item amethystChest;
	public static Item amethystLegs;
	public static Item amethystBoots;
	
	// Jet
	public static Item jetHelmet;
	public static Item jetChest;
	public static Item jetLegs;
	public static Item jetBoots;
	
	
	//TestTool
	/*public static Item testTool;*/
	
	//Dual Tools
	public static Item topazDual;
	public static Item malachiteDual;
	public static Item quartzDual;
	public static Item amberDual;
	public static Item tanzaniteDual;
	public static Item diamondDual;
	public static Item peridotDual;
	public static Item sapphireDual;
	public static Item rubyDual;
	public static Item emeraldDual;
	public static Item amethystDual;
	public static Item jetDual;
	
	//AOE Pick
	public static Item topazAOEPick;
	public static Item malachiteAOEPick;
	public static Item quartzAOEPick;
	public static Item amberAOEPick;
	public static Item tanzaniteAOEPick;
	public static Item diamondAOEPick;
	public static Item peridotAOEPick;
	public static Item sapphireAOEPick;
	public static Item rubyAOEPick;
	public static Item emeraldAOEPick;
	public static Item amethystAOEPick;
	public static Item jetAOEPick;
	
	
	//AOE Shovel
	public static Item topazAOEShovel;
	public static Item malachiteAOEShovel;
	public static Item quartzAOEShovel;
	public static Item amberAOEShovel;
	public static Item tanzaniteAOEShovel;
	public static Item diamondAOEShovel;
	public static Item peridotAOEShovel;
	public static Item sapphireAOEShovel;
	public static Item rubyAOEShovel;
	public static Item emeraldAOEShovel;
	public static Item amethystAOEShovel;
	public static Item jetAOEShovel;
	
	//AOE Axe
	public static Item topazAOEAxe;
	public static Item malachiteAOEAxe;
	public static Item quartzAOEAxe;
	public static Item amberAOEAxe;
	public static Item tanzaniteAOEAxe;
	public static Item diamondAOEAxe;
	public static Item peridotAOEAxe;
	public static Item sapphireAOEAxe;
	public static Item rubyAOEAxe;
	public static Item emeraldAOEAxe;
	public static Item amethystAOEAxe;
	public static Item jetAOEAxe;
	
	//AOE Pick & Shovel / Dual
	public static Item topazAOEDual;
	public static Item malachiteAOEDual;
	public static Item quartzAOEDual;
	public static Item amberAOEDual;
	public static Item tanzaniteAOEDual;
	public static Item diamondAOEDual;
	public static Item peridotAOEDual;
	public static Item sapphireAOEDual;
	public static Item rubyAOEDual;
	public static Item emeraldAOEDual;
	public static Item amethystAOEDual;
	public static Item jetAOEDual;
	
	
	// Material Tool Single Purpose

	public static Item.ToolMaterial gemTOPAZ = EnumHelper.addToolMaterial("gemTOPAZ", 2, 170, 5F, 1.5F, 16);
	public static Item.ToolMaterial gemMALACHITE = EnumHelper.addToolMaterial("gemMALACHITE", 2, 210, 5.5F, 1.75F, 15);
	public static Item.ToolMaterial gemQUARTZ = EnumHelper.addToolMaterial("gemQUARTZ", 2, 265, 6.5F, 2.25F, 14);
	public static Item.ToolMaterial gemAMBER = EnumHelper.addToolMaterial("gemAMBER", 2, 625, 7F, 2.5F, 12);
	public static Item.ToolMaterial gemTANZANITE = EnumHelper.addToolMaterial("gemTANZANITE", 2, 1075, 7.5F, 2.75F, 12);
	public static Item.ToolMaterial gemDIAMOND = EnumHelper.addToolMaterial("gemDIMAOND", 3, 1563, 8F, 3F, 10);
	public static Item.ToolMaterial gemPERIDOT = EnumHelper.addToolMaterial("gemPERIDOT", 3, 1874, 10F, 5F, 12);
	public static Item.ToolMaterial gemSAPPHIRE = EnumHelper.addToolMaterial("gemSAPPHIRE", 3, 2249, 10F, 8F, 13);
	public static Item.ToolMaterial gemRUBY = EnumHelper.addToolMaterial("gemRUBY", 3, 2699, 14F, 11F, 14);
	public static Item.ToolMaterial gemEMERALD = EnumHelper.addToolMaterial("gemEMERALD", 3, 4049, 16F, 15F, 16);
	public static Item.ToolMaterial gemAMETHYST = EnumHelper.addToolMaterial("gemAMETHYST", 4, 6073, 20F, 20F, 20);
	public static Item.ToolMaterial gemJET = EnumHelper.addToolMaterial("gemJET", 50, 9110, 25F, 25F, 25);

	// Dual Tool Material

	public static Item.ToolMaterial gemTOPAZDual = EnumHelper.addToolMaterial("dualTOPAZ", 2, 340, 5F, 1.5F, 16);
	public static Item.ToolMaterial gemMALACHITEDual = EnumHelper.addToolMaterial("dualMALACHITE", 2, 420, 5.5F, 1.75F, 15);
	public static Item.ToolMaterial gemQUARTZDual = EnumHelper.addToolMaterial("dualQUARTZ", 2, 530, 6.5F, 2.25F, 14);
	public static Item.ToolMaterial gemAMBERDual = EnumHelper.addToolMaterial("dualAMBER", 2, 1250, 7F, 2.5F, 12);
	public static Item.ToolMaterial gemTANZANITEDual = EnumHelper.addToolMaterial("dualTANZANITE", 2, 2150, 7.5F, 2.75F, 12);
	public static Item.ToolMaterial gemDIAMONDDual = EnumHelper.addToolMaterial("gemDIMAOND", 3, 3216, 8F, 3F, 10);
	public static Item.ToolMaterial gemPERIDOTDual = EnumHelper.addToolMaterial("dualPERIDOT", 3, 3748, 10F, 5F, 12);
	public static Item.ToolMaterial gemSAPPHIREDual = EnumHelper.addToolMaterial("dualSAPPHIRE", 3, 4498, 10F, 8F, 13);
	public static Item.ToolMaterial gemRUBYDual = EnumHelper.addToolMaterial("dualRUBY", 3, 5398, 14F, 11F, 14);
	public static Item.ToolMaterial gemEMERALDDual = EnumHelper.addToolMaterial("dualEMERALD", 3, 8098, 16F, 15F, 16);
	public static Item.ToolMaterial gemAMETHYSTDual = EnumHelper.addToolMaterial("dualAMETHYST", 4, 12146, 20F, 20F, 20);
	public static Item.ToolMaterial gemJETDual = EnumHelper.addToolMaterial("dualJET", 50, 18220, 25F, 25F, 25);
	
	//AOE Tool Material
	public static Item.ToolMaterial gemAOETOPAZ = EnumHelper.addToolMaterial("gemAOETOPAZ", 2, 1530, 3F, 1.5F, 16);
	public static Item.ToolMaterial gemAOEMALACHITE = EnumHelper.addToolMaterial("gemAOEMALACHITE", 2, 1890, 3.5F, 1.75F, 15);
	public static Item.ToolMaterial gemAOEQUARTZ = EnumHelper.addToolMaterial("gemAOEQUARTZ", 2, 2385, 4.5F, 2.25F, 14);
	public static Item.ToolMaterial gemAOEAMBER = EnumHelper.addToolMaterial("gemAOEAMBER", 2, 5625, 5F, 2.5F, 12);
	public static Item.ToolMaterial gemAOETANZANITE = EnumHelper.addToolMaterial("gemAOETANZANITE", 2, 9675, 5.5F, 2.75F, 12);
	public static Item.ToolMaterial gemAOEDIAMOND = EnumHelper.addToolMaterial("gemAOEDIMAOND", 3, 12730, 6F, 3F, 10);
	public static Item.ToolMaterial gemAOEPERIDOT = EnumHelper.addToolMaterial("gemAOEPERIDOT", 3, 15276, 8F, 5F, 12);
	public static Item.ToolMaterial gemAOESAPPHIRE = EnumHelper.addToolMaterial("gemAOESAPPHIRE", 3, 17822, 8F, 8F, 13);
	public static Item.ToolMaterial gemAOERUBY = EnumHelper.addToolMaterial("gemAOERUBY", 3, 19095, 12F, 9F, 14);
	public static Item.ToolMaterial gemAOEEMERALD = EnumHelper.addToolMaterial("gemAOEEMERALD", 3, 20368, 12F, 15F, 16);
	public static Item.ToolMaterial gemAOEAMETHYST = EnumHelper.addToolMaterial("gemAOEAMETHYST", 4, 22914, 15F, 20F, 20);
	public static Item.ToolMaterial gemAOEJET = EnumHelper.addToolMaterial("gemAOEJET", 50, 25460, 20F, 25F, 25);
	
	//AOE Dual Tool Material
	public static Item.ToolMaterial gemAOEDUALTOPAZ = EnumHelper.addToolMaterial("gemAOEDUALTOPAZ", 2, 3060, 3F, 1.5F, 16);
	public static Item.ToolMaterial gemAOEDUALMALACHITE = EnumHelper.addToolMaterial("gemAOEDUALMALACHITE", 2, 3780, 3.5F, 1.75F, 15);
	public static Item.ToolMaterial gemAOEDUALQUARTZ = EnumHelper.addToolMaterial("gemAOEDUALQUARTZ", 2, 4770, 4.5F, 2.25F, 14);
	public static Item.ToolMaterial gemAOEDUALAMBER = EnumHelper.addToolMaterial("gemAOEDUALAMBER", 2, 11250, 5F, 2.5F, 12);
	public static Item.ToolMaterial gemAOEDUALTANZANITE = EnumHelper.addToolMaterial("gemAOEDUALTANZANITE", 2, 13080, 5.5F, 2.75F, 12);
	public static Item.ToolMaterial gemAOEDUALDIAMOND = EnumHelper.addToolMaterial("gemAOEDUALDIMAOND", 3, 16350, 6F, 3F, 10);
	public static Item.ToolMaterial gemAOEDUALPERIDOT = EnumHelper.addToolMaterial("gemAOEDUALPERIDOT", 3, 19620, 8F, 5F, 12);
	public static Item.ToolMaterial gemAOEDUALSAPPHIRE = EnumHelper.addToolMaterial("gemAOEDUALSAPPHIRE", 3, 22890, 8F, 8F, 13);
	public static Item.ToolMaterial gemAOEDUALRUBY = EnumHelper.addToolMaterial("gemAOEDUALRUBY", 3, 24525, 12F, 9F, 14);
	public static Item.ToolMaterial gemAOEDUALEMERALD = EnumHelper.addToolMaterial("gemAOEDUALEMERALD", 3, 26160, 12F, 15F, 16);
	public static Item.ToolMaterial gemAOEDUALAMETHYST = EnumHelper.addToolMaterial("gemAOEDUALAMETHYST", 4, 29430, 15F, 20F, 20);
	public static Item.ToolMaterial gemAOEDUALJET = EnumHelper.addToolMaterial("gemAOEDUALJET", 50, 32700, 20F, 25F, 25);
	
	
	//Simply testing tools
	public static Item.ToolMaterial testToolMat = EnumHelper.addToolMaterial("testToolMat", 10, 99999, 50F, 1.5F, 125);

	// Armor Material

	public static ArmorMaterial gemTOPAZarmor = EnumHelper.addArmorMaterial("gemTOPAZarmor", 10,
			new int[] {2, 4, 3, 1 }, 16);
	public static ArmorMaterial gemMALACHITEarmor = EnumHelper.addArmorMaterial("gemMALACHITEarmor", 13,
			new int[] {2, 5, 4, 1 }, 15);
	public static ArmorMaterial gemQUARTZarmor = EnumHelper.addArmorMaterial("gemQUARTZarmor", 15,
			new int[] {2, 6, 5, 2 }, 14);
	public static ArmorMaterial gemAMBERarmor = EnumHelper.addArmorMaterial("gemAMBERarmor", 20,
			new int[] {3, 6, 6, 2 }, 12);
	public static ArmorMaterial gemTANZANITEarmor = EnumHelper.addArmorMaterial("gemTANZANITEarmor", 28,
			new int[] {3, 7, 6, 3}, 12);
	public static ArmorMaterial gemPERIDOTarmor = EnumHelper.addArmorMaterial("gemPERIDOTarmor", 35,
			new int[] {3, 9, 7, 3}, 12);
	public static ArmorMaterial gemSAPPHIREarmor = EnumHelper.addArmorMaterial("gemSAPPHIREarmor", 45,
			new int[] {4, 9, 8, 4}, 13);
	public static ArmorMaterial gemRUBYarmor = EnumHelper.addArmorMaterial("gemRUBYarmor", 55,
			new int[] {5, 9, 8, 5}, 14);
	public static ArmorMaterial gemEMERALDarmor = EnumHelper.addArmorMaterial("gemEMERALDarmor", 66,
			new int[] {5, 10, 9, 5}, 16);
	public static ArmorMaterial gemAMETHYSTarmor = EnumHelper.addArmorMaterial("gemAMETHYSTarmor", 99,
			new int[] {6, 11, 10, 6}, 20);
	public static ArmorMaterial gemJETarmor = EnumHelper.addArmorMaterial("gemJETarmor", 150,
			new int[] {7, 14, 12, 7}, 25);
	

	public static void LoadItems() {
		
	
		

		// Gems
		Gemstones = new ItemGemstones();
		GameRegistry.registerItem(Gemstones, "allGemstones");

		// Tools Section

	/*	testTool = new ItemToolTest(testToolMat);
		RegisterHelper.registerItem(testTool);*/
		
		// Repair
		gemPutty = new ItemGemPutty();
		GameRegistry.registerItem(gemPutty, "gemPutty");
		gemPuttyCompact = new ItemGemPuttyCompact();
		GameRegistry.registerItem(gemPuttyCompact, "gemPuttyCompact");
		
		
		
		
		// Topaz
		topazPickaxe = new ItemGTFOPickaxe(gemTOPAZ, "topaz");
		RegisterHelper.registerItem(topazPickaxe);
		topazAxe = new ItemGTFOAxe(gemTOPAZ, "topaz");
		RegisterHelper.registerItem(topazAxe);
		topazShovel = new ItemGTFOShovel(gemTOPAZ, "topaz");
		RegisterHelper.registerItem(topazShovel);
		topazHoe = new ItemGTFOHoe(gemTOPAZ, "topaz");
		RegisterHelper.registerItem(topazHoe);
		topazSword = new ItemGTFOSword(gemTOPAZ, "topaz");
		RegisterHelper.registerItem(topazSword);		
		topazDual = new ItemDualTool(gemTOPAZDual, "topaz");
		RegisterHelper.registerItem(topazDual);
		
		// Topaz AOE
		topazAOEPick = new ItemGTFOAOEPick(gemAOETOPAZ, "topaz");
		RegisterHelper.registerItem(topazAOEPick);
		topazAOEShovel = new ItemGTFOAOEShovel(gemAOETOPAZ, "topaz");
		RegisterHelper.registerItem(topazAOEShovel);
		topazAOEAxe = new ItemGTFOAOEAxe(gemAOETOPAZ, "topaz");
		RegisterHelper.registerItem(topazAOEAxe);
		topazAOEDual = new ItemGTFOAOEDual(gemAOEDUALTOPAZ, "topaz");
		RegisterHelper.registerItem(topazAOEDual);
		

		// Malachite
		malachitePickaxe = new ItemGTFOPickaxe(gemMALACHITE, "malachite");
		RegisterHelper.registerItem(malachitePickaxe);
		malachiteAxe = new ItemGTFOAxe(gemMALACHITE, "malachite");
		RegisterHelper.registerItem(malachiteAxe);
		malachiteShovel = new ItemGTFOShovel(gemMALACHITE, "malachite");
		RegisterHelper.registerItem(malachiteShovel);
		malachiteHoe = new ItemGTFOHoe(gemMALACHITE, "malachite");
		RegisterHelper.registerItem(malachiteHoe);
		malachiteSword = new ItemGTFOSword(gemMALACHITE, "malachite");
		RegisterHelper.registerItem(malachiteSword);
		malachiteDual = new ItemDualTool(gemMALACHITEDual, "malachite");
		RegisterHelper.registerItem(malachiteDual);
		
		// Malachite AOE
		malachiteAOEPick = new ItemGTFOAOEPick(gemAOEMALACHITE, "malachite");
		RegisterHelper.registerItem(malachiteAOEPick);
		malachiteAOEShovel = new ItemGTFOAOEShovel(gemAOEMALACHITE, "malachite");
		RegisterHelper.registerItem(malachiteAOEShovel);
		malachiteAOEAxe = new ItemGTFOAOEAxe(gemAOEMALACHITE, "malachite");
		RegisterHelper.registerItem(malachiteAOEAxe);
		malachiteAOEDual = new ItemGTFOAOEDual(gemAOEDUALMALACHITE, "malachite");
		RegisterHelper.registerItem(malachiteAOEDual);

		// Quartz
		quartzPickaxe = new ItemGTFOPickaxe(gemQUARTZ, "quartz");
		RegisterHelper.registerItem(quartzPickaxe);
		quartzAxe = new ItemGTFOAxe(gemQUARTZ, "quartz");
		RegisterHelper.registerItem(quartzAxe);
		quartzShovel = new ItemGTFOShovel(gemQUARTZ, "quartz");
		RegisterHelper.registerItem(quartzShovel);
		quartzHoe = new ItemGTFOHoe(gemQUARTZ, "quartz");
		RegisterHelper.registerItem(quartzHoe);
		quartzSword = new ItemGTFOSword(gemQUARTZ, "quartz");
		RegisterHelper.registerItem(quartzSword);
		quartzDual = new ItemDualTool(gemQUARTZDual, "quartz");
		RegisterHelper.registerItem(quartzDual);
		
		// Quartz AOE
		quartzAOEPick = new ItemGTFOAOEPick(gemAOEQUARTZ, "quartz");
		RegisterHelper.registerItem(quartzAOEPick);
		quartzAOEShovel = new ItemGTFOAOEShovel(gemAOEQUARTZ, "quartz");
		RegisterHelper.registerItem(quartzAOEShovel);
		quartzAOEAxe = new ItemGTFOAOEAxe(gemAOEQUARTZ, "quartz");
		RegisterHelper.registerItem(quartzAOEAxe);
		quartzAOEDual = new ItemGTFOAOEDual(gemAOEDUALQUARTZ, "quartz");
		RegisterHelper.registerItem(quartzAOEDual);

		// Amber
		amberPickaxe = new ItemGTFOPickaxe(gemAMBER, "amber");
		RegisterHelper.registerItem(amberPickaxe);
		amberAxe = new ItemGTFOAxe(gemAMBER, "amber");
		RegisterHelper.registerItem(amberAxe);
		amberShovel = new ItemGTFOShovel(gemAMBER, "amber");
		RegisterHelper.registerItem(amberShovel);
		amberHoe = new ItemGTFOHoe(gemAMBER, "amber");
		RegisterHelper.registerItem(amberHoe);
		amberSword = new ItemGTFOSword(gemAMBER, "amber");
		RegisterHelper.registerItem(amberSword);
		amberDual = new ItemDualTool(gemAMBERDual, "amber");
		RegisterHelper.registerItem(amberDual);
		
		// Amber AOE
		amberAOEPick = new ItemGTFOAOEPick(gemAOEAMBER, "amber");
		RegisterHelper.registerItem(amberAOEPick);
		amberAOEShovel = new ItemGTFOAOEShovel(gemAOEAMBER, "amber");
		RegisterHelper.registerItem(amberAOEShovel);
		amberAOEAxe = new ItemGTFOAOEAxe(gemAOEAMBER, "amber");
		RegisterHelper.registerItem(amberAOEAxe);
		amberAOEDual = new ItemGTFOAOEDual(gemAOEDUALAMBER, "amber");
		RegisterHelper.registerItem(amberAOEDual);

		// Tanzanite
		tanzanitePickaxe = new ItemGTFOPickaxe(gemTANZANITE, "tanzanite");
		RegisterHelper.registerItem(tanzanitePickaxe);
		tanzaniteAxe = new ItemGTFOAxe(gemTANZANITE, "tanzanite");
		RegisterHelper.registerItem(tanzaniteAxe);
		tanzaniteShovel = new ItemGTFOShovel(gemTANZANITE, "tanzanite");
		RegisterHelper.registerItem(tanzaniteShovel);
		tanzaniteHoe = new ItemGTFOHoe(gemTANZANITE, "tanzanite");
		RegisterHelper.registerItem(tanzaniteHoe);
		tanzaniteSword = new ItemGTFOSword(gemTANZANITE, "tanzanite");
		RegisterHelper.registerItem(tanzaniteSword);
		tanzaniteDual = new ItemDualTool(gemTANZANITEDual, "tanzanite");
		RegisterHelper.registerItem(tanzaniteDual);
		
		// Tanzanite AOE
		tanzaniteAOEPick = new ItemGTFOAOEPick(gemAOETANZANITE, "tanzanite");
		RegisterHelper.registerItem(tanzaniteAOEPick);
		tanzaniteAOEShovel = new ItemGTFOAOEShovel(gemAOETANZANITE, "tanzanite");
		RegisterHelper.registerItem(tanzaniteAOEShovel);
		tanzaniteAOEAxe = new ItemGTFOAOEAxe(gemAOETANZANITE, "tanzanite");
		RegisterHelper.registerItem(tanzaniteAOEAxe);
		tanzaniteAOEDual = new ItemGTFOAOEDual(gemAOEDUALTANZANITE, "tanzanite");
		RegisterHelper.registerItem(tanzaniteAOEDual);
		
		// Diamond
		diamondDual = new ItemDualTool(gemDIAMONDDual, "diamond");
		RegisterHelper.registerItem(diamondDual);
		// Diamond AOE
		diamondAOEPick = new ItemGTFOAOEPick(gemAOEDIAMOND, "diamond");
		RegisterHelper.registerItem(diamondAOEPick);
		diamondAOEShovel = new ItemGTFOAOEShovel(gemAOEDIAMOND, "diamond");
		RegisterHelper.registerItem(diamondAOEShovel);
		diamondAOEAxe = new ItemGTFOAOEAxe(gemAOEDIAMOND, "diamond");
		RegisterHelper.registerItem(diamondAOEAxe);
		diamondAOEDual = new ItemGTFOAOEDual(gemAOEDUALDIAMOND, "diamond");
		RegisterHelper.registerItem(diamondAOEDual);

		// Peridot
		peridotPickaxe = new ItemGTFOPickaxe(gemPERIDOT, "peridot");
		RegisterHelper.registerItem(peridotPickaxe);
		peridotAxe = new ItemGTFOAxe(gemPERIDOT, "peridot");
		RegisterHelper.registerItem(peridotAxe);
		peridotShovel = new ItemGTFOShovel(gemPERIDOT, "peridot");
		RegisterHelper.registerItem(peridotShovel);
		peridotHoe = new ItemGTFOHoe(gemPERIDOT, "peridot");
		RegisterHelper.registerItem(peridotHoe);
		peridotSword = new ItemGTFOSword(gemPERIDOT, "peridot");
		RegisterHelper.registerItem(peridotSword);
		peridotDual = new ItemDualTool(gemPERIDOTDual, "peridot");
		RegisterHelper.registerItem(peridotDual);
		
		// Peridot AOE
		peridotAOEPick = new ItemGTFOAOEPick(gemAOEPERIDOT, "peridot");
		RegisterHelper.registerItem(peridotAOEPick);
		peridotAOEShovel = new ItemGTFOAOEShovel(gemAOEPERIDOT, "peridot");
		RegisterHelper.registerItem(peridotAOEShovel);
		peridotAOEAxe = new ItemGTFOAOEAxe(gemAOEPERIDOT, "peridot");
		RegisterHelper.registerItem(peridotAOEAxe);
		peridotAOEDual = new ItemGTFOAOEDual(gemAOEDUALPERIDOT, "peridot");
		RegisterHelper.registerItem(peridotAOEDual);

		// Sapphire
		sapphirePickaxe = new ItemGTFOPickaxe(gemSAPPHIRE, "sapphire");
		RegisterHelper.registerItem(sapphirePickaxe);
		sapphireAxe = new ItemGTFOAxe(gemSAPPHIRE, "sapphire");
		RegisterHelper.registerItem(sapphireAxe);
		sapphireShovel = new ItemGTFOShovel(gemSAPPHIRE, "sapphire");
		RegisterHelper.registerItem(sapphireShovel);
		sapphireHoe = new ItemGTFOHoe(gemSAPPHIRE, "sapphire");
		RegisterHelper.registerItem(sapphireHoe);
		sapphireSword = new ItemGTFOSword(gemSAPPHIRE, "sapphire");
		RegisterHelper.registerItem(sapphireSword);
		sapphireDual = new ItemDualTool(gemSAPPHIREDual, "sapphire");
		RegisterHelper.registerItem(sapphireDual);
		
		// Sapphire AOE
		sapphireAOEPick = new ItemGTFOAOEPick(gemAOESAPPHIRE, "sapphire");
		RegisterHelper.registerItem(sapphireAOEPick);
		sapphireAOEShovel = new ItemGTFOAOEShovel(gemAOESAPPHIRE, "sapphire");
		RegisterHelper.registerItem(sapphireAOEShovel);
		sapphireAOEAxe = new ItemGTFOAOEAxe(gemAOESAPPHIRE, "sapphire");
		RegisterHelper.registerItem(sapphireAOEAxe);
		sapphireAOEDual = new ItemGTFOAOEDual(gemAOEDUALSAPPHIRE, "sapphire");
		RegisterHelper.registerItem(sapphireAOEDual);

		// Ruby
		rubyPickaxe = new ItemGTFOPickaxe(gemRUBY, "ruby");
		RegisterHelper.registerItem(rubyPickaxe);
		rubyAxe = new ItemGTFOAxe(gemRUBY, "ruby");
		RegisterHelper.registerItem(rubyAxe);
		rubyShovel = new ItemGTFOShovel(gemRUBY, "ruby");
		RegisterHelper.registerItem(rubyShovel);
		rubyHoe = new ItemGTFOHoe(gemRUBY, "ruby");
		RegisterHelper.registerItem(rubyHoe);
		rubySword = new ItemGTFOSword(gemRUBY, "ruby");
		RegisterHelper.registerItem(rubySword);
		rubyDual = new ItemDualTool(gemRUBYDual, "ruby");
		RegisterHelper.registerItem(rubyDual);
		
		// Ruby AOE
		rubyAOEPick = new ItemGTFOAOEPick(gemAOERUBY, "ruby");
		RegisterHelper.registerItem(rubyAOEPick);
		rubyAOEShovel = new ItemGTFOAOEShovel(gemAOERUBY, "ruby");
		RegisterHelper.registerItem(rubyAOEShovel);
		rubyAOEAxe = new ItemGTFOAOEAxe(gemAOERUBY, "ruby");
		RegisterHelper.registerItem(rubyAOEAxe);
		rubyAOEDual = new ItemGTFOAOEDual(gemAOEDUALRUBY, "ruby");
		RegisterHelper.registerItem(rubyAOEDual);

		// Emerald
		emeraldPickaxe = new ItemGTFOPickaxe(gemEMERALD, "emerald");
		RegisterHelper.registerItem(emeraldPickaxe);
		emeraldAxe = new ItemGTFOAxe(gemEMERALD, "emerald");
		RegisterHelper.registerItem(emeraldAxe);
		emeraldShovel = new ItemGTFOShovel(gemEMERALD, "emerald");
		RegisterHelper.registerItem(emeraldShovel);
		emeraldHoe = new ItemGTFOHoe(gemEMERALD, "emerald");
		RegisterHelper.registerItem(emeraldHoe);
		emeraldSword = new ItemGTFOSword(gemEMERALD, "emerald");
		RegisterHelper.registerItem(emeraldSword);
		emeraldDual = new ItemDualTool(gemEMERALDDual, "emerald");
		RegisterHelper.registerItem(emeraldDual);
		
		// Emerald AOE
		emeraldAOEPick = new ItemGTFOAOEPick(gemAOEEMERALD, "emerald");
		RegisterHelper.registerItem(emeraldAOEPick);
		emeraldAOEShovel = new ItemGTFOAOEShovel(gemAOEEMERALD, "emerald");
		RegisterHelper.registerItem(emeraldAOEShovel);
		emeraldAOEAxe = new ItemGTFOAOEAxe(gemAOEEMERALD, "emerald");
		RegisterHelper.registerItem(emeraldAOEAxe);
		emeraldAOEDual = new ItemGTFOAOEDual(gemAOEDUALEMERALD, "emerald");
		RegisterHelper.registerItem(emeraldAOEDual);

		// Amethyst
		amethystPickaxe = new ItemGTFOPickaxe(gemAMETHYST, "amethyst");
		RegisterHelper.registerItem(amethystPickaxe);
		amethystAxe = new ItemGTFOAxe(gemAMETHYST, "amethyst");
		RegisterHelper.registerItem(amethystAxe);
		amethystShovel = new ItemGTFOShovel(gemAMETHYST, "amethyst");
		RegisterHelper.registerItem(amethystShovel);
		amethystHoe = new ItemGTFOHoe(gemAMETHYST, "amethyst");
		RegisterHelper.registerItem(amethystHoe);
		amethystSword = new ItemGTFOSword(gemAMETHYST, "amethyst");
		RegisterHelper.registerItem(amethystSword);
		amethystDual = new ItemDualTool(gemAMETHYSTDual, "amethyst");
		RegisterHelper.registerItem(amethystDual);
		
		// Amethyst AOE
		amethystAOEPick = new ItemGTFOAOEPick(gemAOEAMETHYST, "amethyst");
		RegisterHelper.registerItem(amethystAOEPick);
		amethystAOEShovel = new ItemGTFOAOEShovel(gemAOEAMETHYST, "amethyst");
		RegisterHelper.registerItem(amethystAOEShovel);
		amethystAOEAxe = new ItemGTFOAOEAxe(gemAOEAMETHYST, "amethyst");
		RegisterHelper.registerItem(amethystAOEAxe);
		amethystAOEDual = new ItemGTFOAOEDual(gemAOEDUALAMETHYST, "amethyst");
		RegisterHelper.registerItem(amethystAOEDual);

		// Jet
		jetPickaxe = new ItemGTFOPickaxe(gemJET, "jet");
		RegisterHelper.registerItem(jetPickaxe);
		jetAxe = new ItemGTFOAxe(gemJET, "jet");
		RegisterHelper.registerItem(jetAxe);
		jetShovel = new ItemGTFOShovel(gemJET, "jet");
		RegisterHelper.registerItem(jetShovel);
		jetHoe = new ItemGTFOHoe(gemJET, "jet");
		RegisterHelper.registerItem(jetHoe);
		jetSword = new ItemGTFOSword(gemJET, "jet");
		RegisterHelper.registerItem(jetSword);
		jetDual = new ItemDualTool(gemJETDual, "jet");
		RegisterHelper.registerItem(jetDual);
		
		// Jet AOE
		jetAOEPick = new ItemGTFOAOEPick(gemAOEJET, "jet");
		RegisterHelper.registerItem(jetAOEPick);
		jetAOEShovel = new ItemGTFOAOEShovel(gemAOEJET, "jet");
		RegisterHelper.registerItem(jetAOEShovel);
		jetAOEAxe = new ItemGTFOAOEAxe(gemAOEJET, "jet");
		RegisterHelper.registerItem(jetAOEAxe);
		jetAOEDual = new ItemGTFOAOEDual(gemAOEDUALJET, "jet");
		RegisterHelper.registerItem(jetAOEDual);
		

		// Armor Section

		// Topaz
		topazHelmet = new ItemAllGemArmorTextures(gemTOPAZarmor, 0, 0).setUnlocalizedName(Reference.MODID + "_" + "topazHelmet")
				.setTextureName(Reference.MODID + ":" + "topazHelmet");
		RegisterHelper.registerItem(topazHelmet);
		topazChest = new ItemAllGemArmorTextures(gemTOPAZarmor, 0, 1).setUnlocalizedName(Reference.MODID + "_" + "topazChest")
				.setTextureName(Reference.MODID + ":" + "topazChest");
		RegisterHelper.registerItem(topazChest);
		topazLegs = new ItemAllGemArmorTextures(gemTOPAZarmor, 0, 2).setUnlocalizedName(Reference.MODID + "_" + "topazLegs")
				.setTextureName(Reference.MODID + ":" + "topazLegs");
		RegisterHelper.registerItem(topazLegs);
		topazBoots = new ItemAllGemArmorTextures(gemTOPAZarmor, 0, 3).setUnlocalizedName(Reference.MODID + "_" + "topazBoots")
				.setTextureName(Reference.MODID + ":" + "topazBoots");
		RegisterHelper.registerItem(topazBoots);

		// Malachite
		malachiteHelmet = new ItemAllGemArmorTextures(gemMALACHITEarmor, 0, 0).setUnlocalizedName(Reference.MODID + "_" + "malachiteHelmet")
				.setTextureName(Reference.MODID + ":" + "malachiteHelmet");
		RegisterHelper.registerItem(malachiteHelmet);
		malachiteChest = new ItemAllGemArmorTextures(gemMALACHITEarmor, 0, 1).setUnlocalizedName(Reference.MODID + "_" + "malachiteChest")
				.setTextureName(Reference.MODID + ":" + "malachiteChest");
		RegisterHelper.registerItem(malachiteChest);
		malachiteLegs = new ItemAllGemArmorTextures(gemMALACHITEarmor, 0, 2).setUnlocalizedName(Reference.MODID + "_" + "malachiteLegs")
				.setTextureName(Reference.MODID + ":" + "malachiteLegs");
		RegisterHelper.registerItem(malachiteLegs);
		malachiteBoots = new ItemAllGemArmorTextures(gemMALACHITEarmor, 0, 3).setUnlocalizedName(Reference.MODID + "_" + "malachiteBoots")
				.setTextureName(Reference.MODID + ":" + "malachiteBoots");
		RegisterHelper.registerItem(malachiteBoots);

		// Quartz
		quartzHelmet = new ItemAllGemArmorTextures(gemQUARTZarmor, 0, 0).setUnlocalizedName(Reference.MODID + "_" + "quartzHelmet")
				.setTextureName(Reference.MODID + ":" + "quartzHelmet");
		RegisterHelper.registerItem(quartzHelmet);
		quartzChest = new ItemAllGemArmorTextures(gemQUARTZarmor, 0, 1).setUnlocalizedName(Reference.MODID + "_" + "quartzChest")
				.setTextureName(Reference.MODID + ":" + "quartzChest");
		RegisterHelper.registerItem(quartzChest);
		quartzLegs = new ItemAllGemArmorTextures(gemQUARTZarmor, 0, 2).setUnlocalizedName(Reference.MODID + "_" + "quartzLegs")
				.setTextureName(Reference.MODID + ":" + "quartzLegs");
		RegisterHelper.registerItem(quartzLegs);
		quartzBoots = new ItemAllGemArmorTextures(gemQUARTZarmor, 0, 3).setUnlocalizedName(Reference.MODID + "_" + "quartzBoots")
				.setTextureName(Reference.MODID + ":" + "quartzBoots");
		RegisterHelper.registerItem(quartzBoots);
		
		// Amber
		amberHelmet = new ItemAllGemArmorTextures(gemAMBERarmor, 0, 0).setUnlocalizedName(Reference.MODID + "_" + "amberHelmet")
				.setTextureName(Reference.MODID + ":" + "amberHelmet");
		RegisterHelper.registerItem(amberHelmet);
		amberChest = new ItemAllGemArmorTextures(gemAMBERarmor, 0, 1).setUnlocalizedName(Reference.MODID + "_" + "amberChest")
				.setTextureName(Reference.MODID + ":" + "amberChest");
		RegisterHelper.registerItem(amberChest);
		amberLegs = new ItemAllGemArmorTextures(gemAMBERarmor, 0, 2).setUnlocalizedName(Reference.MODID + "_" + "amberLegs")
				.setTextureName(Reference.MODID + ":" + "amberLegs");
		RegisterHelper.registerItem(amberLegs);
		amberBoots = new ItemAllGemArmorTextures(gemAMBERarmor, 0, 3).setUnlocalizedName(Reference.MODID + "_" + "amberBoots")
				.setTextureName(Reference.MODID + ":" + "amberBoots");
		RegisterHelper.registerItem(amberBoots);
		
		// Tanzanite
		tanzaniteHelmet = new ItemAllGemArmorTextures(gemTANZANITEarmor, 0, 0).setUnlocalizedName(Reference.MODID + "_" + "tanzaniteHelmet")
				.setTextureName(Reference.MODID + ":" + "tanzaniteHelmet");
		RegisterHelper.registerItem(tanzaniteHelmet);
		tanzaniteChest = new ItemAllGemArmorTextures(gemTANZANITEarmor, 0, 1).setUnlocalizedName(Reference.MODID + "_" + "tanzaniteChest")
				.setTextureName(Reference.MODID + ":" + "tanzaniteChest");
		RegisterHelper.registerItem(tanzaniteChest);
		tanzaniteLegs = new ItemAllGemArmorTextures(gemTANZANITEarmor, 0, 2).setUnlocalizedName(Reference.MODID + "_" + "tanzaniteLegs")
				.setTextureName(Reference.MODID + ":" + "tanzaniteLegs");
		RegisterHelper.registerItem(tanzaniteLegs);
		tanzaniteBoots = new ItemAllGemArmorTextures(gemTANZANITEarmor, 0, 3).setUnlocalizedName(Reference.MODID + "_" + "tanzaniteBoots")
				.setTextureName(Reference.MODID + ":" + "tanzaniteBoots");
		RegisterHelper.registerItem(tanzaniteBoots);
		
		// Peridot
		peridotHelmet = new ItemAllGemArmorTextures(gemPERIDOTarmor, 0, 0).setUnlocalizedName(Reference.MODID + "_" + "peridotHelmet")
				.setTextureName(Reference.MODID + ":" + "peridotHelmet");
		RegisterHelper.registerItem(peridotHelmet);
		peridotChest = new ItemAllGemArmorTextures(gemPERIDOTarmor, 0, 1).setUnlocalizedName(Reference.MODID + "_" + "peridotChest")
				.setTextureName(Reference.MODID + ":" + "peridotChest");
		RegisterHelper.registerItem(peridotChest);
		peridotLegs = new ItemAllGemArmorTextures(gemPERIDOTarmor, 0, 2).setUnlocalizedName(Reference.MODID + "_" + "peridotLegs")
				.setTextureName(Reference.MODID + ":" + "peridotLegs");
		RegisterHelper.registerItem(peridotLegs);
		peridotBoots = new ItemAllGemArmorTextures(gemPERIDOTarmor, 0, 3).setUnlocalizedName(Reference.MODID + "_" + "peridotBoots")
				.setTextureName(Reference.MODID + ":" + "peridotBoots");
		RegisterHelper.registerItem(peridotBoots);
		
		// Sapphire
		sapphireHelmet = new ItemAllGemArmorTextures(gemSAPPHIREarmor, 0, 0).setUnlocalizedName(Reference.MODID + "_" + "sapphireHelmet")
				.setTextureName(Reference.MODID + ":" + "sapphireHelmet");
		RegisterHelper.registerItem(sapphireHelmet);
		sapphireChest = new ItemAllGemArmorTextures(gemSAPPHIREarmor, 0, 1).setUnlocalizedName(Reference.MODID + "_" + "sapphireChest")
				.setTextureName(Reference.MODID + ":" + "sapphireChest");
		RegisterHelper.registerItem(sapphireChest);
		sapphireLegs = new ItemAllGemArmorTextures(gemSAPPHIREarmor, 0, 2).setUnlocalizedName(Reference.MODID + "_" + "sapphireLegs")
				.setTextureName(Reference.MODID + ":" + "sapphireLegs");
		RegisterHelper.registerItem(sapphireLegs);
		sapphireBoots = new ItemAllGemArmorTextures(gemSAPPHIREarmor, 0, 3).setUnlocalizedName(Reference.MODID + "_" + "sapphireBoots")
				.setTextureName(Reference.MODID + ":" + "sapphireBoots");
		RegisterHelper.registerItem(sapphireBoots);
		
		// Ruby
		rubyHelmet = new ItemAllGemArmorTextures(gemRUBYarmor, 0, 0).setUnlocalizedName(Reference.MODID + "_" + "rubyHelmet")
				.setTextureName(Reference.MODID + ":" + "rubyHelmet");
		RegisterHelper.registerItem(rubyHelmet);
		rubyChest = new ItemAllGemArmorTextures(gemRUBYarmor, 0, 1).setUnlocalizedName(Reference.MODID + "_" + "rubyChest")
				.setTextureName(Reference.MODID + ":" + "rubyChest");
		RegisterHelper.registerItem(rubyChest);
		rubyLegs = new ItemAllGemArmorTextures(gemRUBYarmor, 0, 2).setUnlocalizedName(Reference.MODID + "_" + "rubyLegs")
				.setTextureName(Reference.MODID + ":" + "rubyLegs");
		RegisterHelper.registerItem(rubyLegs);
		rubyBoots = new ItemAllGemArmorTextures(gemRUBYarmor, 0, 3).setUnlocalizedName(Reference.MODID + "_" + "rubyBoots")
				.setTextureName(Reference.MODID + ":" + "rubyBoots");
		RegisterHelper.registerItem(rubyBoots);
		
		// Emerald
		emeraldHelmet = new ItemAllGemArmorTextures(gemEMERALDarmor, 0, 0).setUnlocalizedName(Reference.MODID + "_" + "emeraldHelmet")
				.setTextureName(Reference.MODID + ":" + "emeraldHelmet");
		RegisterHelper.registerItem(emeraldHelmet);
		emeraldChest = new ItemAllGemArmorTextures(gemEMERALDarmor, 0, 1).setUnlocalizedName(Reference.MODID + "_" + "emeraldChest")
				.setTextureName(Reference.MODID + ":" + "emeraldChest");
		RegisterHelper.registerItem(emeraldChest);
		emeraldLegs = new ItemAllGemArmorTextures(gemEMERALDarmor, 0, 2).setUnlocalizedName(Reference.MODID + "_" + "emeraldLegs")
				.setTextureName(Reference.MODID + ":" + "emeraldLegs");
		RegisterHelper.registerItem(emeraldLegs);
		emeraldBoots = new ItemAllGemArmorTextures(gemEMERALDarmor, 0, 3).setUnlocalizedName(Reference.MODID + "_" + "emeraldBoots")
				.setTextureName(Reference.MODID + ":" + "emeraldBoots");
		RegisterHelper.registerItem(emeraldBoots);
		
		// Amethyst
		amethystHelmet = new ItemAllGemArmorTextures(gemAMETHYSTarmor, 0, 0).setUnlocalizedName(Reference.MODID + "_" + "amethystHelmet")
				.setTextureName(Reference.MODID + ":" + "amethystHelmet");
		RegisterHelper.registerItem(amethystHelmet);
		amethystChest = new ItemAllGemArmorTextures(gemAMETHYSTarmor, 0, 1).setUnlocalizedName(Reference.MODID + "_" + "amethystChest")
				.setTextureName(Reference.MODID + ":" + "amethystChest");
		RegisterHelper.registerItem(amethystChest);
		amethystLegs = new ItemAllGemArmorTextures(gemAMETHYSTarmor, 0, 2).setUnlocalizedName(Reference.MODID + "_" + "amethystLegs")
				.setTextureName(Reference.MODID + ":" + "amethystLegs");
		RegisterHelper.registerItem(amethystLegs);
		amethystBoots = new ItemAllGemArmorTextures(gemAMETHYSTarmor, 0, 3).setUnlocalizedName(Reference.MODID + "_" + "amethystBoots")
				.setTextureName(Reference.MODID + ":" + "amethystBoots");
		RegisterHelper.registerItem(amethystBoots);
		
		// Jet
		jetHelmet = new ItemAllGemArmorTextures(gemJETarmor, 0, 0).setUnlocalizedName(Reference.MODID + "_" + "jetHelmet")
				.setTextureName(Reference.MODID + ":" + "jetHelmet");
		RegisterHelper.registerItem(jetHelmet);
		jetChest = new ItemAllGemArmorTextures(gemJETarmor, 0, 1).setUnlocalizedName(Reference.MODID + "_" + "jetChest")
				.setTextureName(Reference.MODID + ":" + "jetChest");
		RegisterHelper.registerItem(jetChest);
		jetLegs = new ItemAllGemArmorTextures(gemJETarmor, 0, 2).setUnlocalizedName(Reference.MODID + "_" + "jetLegs")
				.setTextureName(Reference.MODID + ":" + "jetLegs");
		RegisterHelper.registerItem(jetLegs);
		jetBoots = new ItemAllGemArmorTextures(gemJETarmor, 0, 3).setUnlocalizedName(Reference.MODID + "_" + "jetBoots")
				.setTextureName(Reference.MODID + ":" + "jetBoots");
		RegisterHelper.registerItem(jetBoots);
	}

}
