package com.reignofmagic.gems.items;

import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.helper.RegisterHelper;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	// Gems
	public static Item Gemstones;

	// Tools Section

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

	// Quartz

	// Amber

	// Tanzanite

	// Peridot

	// Sapphire

	// Ruby

	// Emerald

	// Amethyst

	// Jet

	// Material Tool Single Purpose

	public static Item.ToolMaterial gemTOPAZ = EnumHelper.addToolMaterial("gemTOPAZ", 2, 170, 5F, 1.5F, 16);
	public static Item.ToolMaterial gemMALACHITE = EnumHelper.addToolMaterial("gemMALACHITE", 2, 210, 5.5F, 1.75F, 15);
	public static Item.ToolMaterial gemQUARTZ = EnumHelper.addToolMaterial("gemQUARTZ", 2, 265, 6.5F, 2.25F, 14);
	public static Item.ToolMaterial gemAMBER = EnumHelper.addToolMaterial("gemAMBER", 2, 625, 7F, 2.5F, 32);
	public static Item.ToolMaterial gemTANZANITE = EnumHelper.addToolMaterial("gemTANZANITE", 2, 1075, 7.5F, 2.75F, 12);
	public static Item.ToolMaterial gemDIAMOND = EnumHelper.addToolMaterial("gemDIMAOND", 3, 1563, 8F, 3F, 10);
	public static Item.ToolMaterial gemPERIDOT = EnumHelper.addToolMaterial("gemPERIDOT", 3, 1874, 10F, 5F, 12);
	public static Item.ToolMaterial gemSAPPHIRE = EnumHelper.addToolMaterial("gemSAPPHIRE", 3, 2249, 10F, 8F, 13);
	public static Item.ToolMaterial gemRUBY = EnumHelper.addToolMaterial("gemRUBY", 3, 2699, 14F, 11F, 14);
	public static Item.ToolMaterial gemEMERALD = EnumHelper.addToolMaterial("gemEMERALD", 3, 4049, 16F, 15F, 16);
	public static Item.ToolMaterial gemAMETHYST = EnumHelper.addToolMaterial("gemAMETHYST", 4, 6073, 20F, 20F, 20);
	public static Item.ToolMaterial gemJET = EnumHelper.addToolMaterial("gemJET", 50, 9110, 25F, 25F, 25);

	// Multiple Tool Material

	public static Item.ToolMaterial gemTOPAZPoel = EnumHelper.addToolMaterial("gemTOPAZPoel", 2, 675, 50F, 1.5F, 16);

	// Armor Material

	public static ArmorMaterial gemTOPAZarmor = EnumHelper.addArmorMaterial("gemTOPAZarmor", 10,
			new int[] { 2, 4, 3, 1 }, 16);

	public static void LoadItems() {

		// Gems
		Gemstones = new ItemGemstones();
		GameRegistry.registerItem(Gemstones, "allGemstones");

		// Tools Section

		// Topaz
		topazPickaxe = new ItemTopazPickaxe(gemTOPAZ);
		RegisterHelper.registerItem(topazPickaxe);
		topazAxe = new ItemTopazAxe(gemTOPAZ);
		RegisterHelper.registerItem(topazAxe);
		topazShovel = new ItemTopazShovel(gemTOPAZ);
		RegisterHelper.registerItem(topazShovel);
		topazHoe = new ItemTopazHoe(gemTOPAZ);
		RegisterHelper.registerItem(topazHoe);
		topazSword = new ItemTopazSword(gemTOPAZ);
		RegisterHelper.registerItem(topazSword);

		// Malachite
		malachitePickaxe = new ItemMalachitePickaxe(gemMALACHITE);
		RegisterHelper.registerItem(malachitePickaxe);
		malachiteAxe = new ItemMalachiteAxe(gemMALACHITE);
		RegisterHelper.registerItem(malachiteAxe);
		malachiteShovel = new ItemMalachiteShovel(gemMALACHITE);
		RegisterHelper.registerItem(malachiteShovel);
		malachiteHoe = new ItemMalachiteHoe(gemMALACHITE);
		RegisterHelper.registerItem(malachiteHoe);
		malachiteSword = new ItemMalachiteSword(gemMALACHITE);
		RegisterHelper.registerItem(malachiteSword);

		// Quartz
		quartzPickaxe = new ItemQuartzPickaxe(gemQUARTZ);
		RegisterHelper.registerItem(quartzPickaxe);
		quartzAxe = new ItemQuartzAxe(gemQUARTZ);
		RegisterHelper.registerItem(quartzAxe);
		quartzShovel = new ItemQuartzShovel(gemQUARTZ);
		RegisterHelper.registerItem(quartzShovel);
		quartzHoe = new ItemQuartzHoe(gemQUARTZ);
		RegisterHelper.registerItem(quartzHoe);
		quartzSword = new ItemQuartzSword(gemQUARTZ);
		RegisterHelper.registerItem(quartzSword);

		// Amber
		amberPickaxe = new ItemAmberPickaxe(gemAMBER);
		RegisterHelper.registerItem(amberPickaxe);
		amberAxe = new ItemAmberAxe(gemAMBER);
		RegisterHelper.registerItem(amberAxe);
		amberShovel = new ItemAmberShovel(gemAMBER);
		RegisterHelper.registerItem(amberShovel);
		amberHoe = new ItemAmberHoe(gemAMBER);
		RegisterHelper.registerItem(amberHoe);
		amberSword = new ItemAmberSword(gemAMBER);
		RegisterHelper.registerItem(amberSword);

		// Tanzanite
		tanzanitePickaxe = new ItemTanzanitePickaxe(gemTANZANITE);
		RegisterHelper.registerItem(tanzanitePickaxe);
		tanzaniteAxe = new ItemTanzaniteAxe(gemTANZANITE);
		RegisterHelper.registerItem(tanzaniteAxe);
		tanzaniteShovel = new ItemTanzaniteShovel(gemTANZANITE);
		RegisterHelper.registerItem(tanzaniteShovel);
		tanzaniteHoe = new ItemTanzaniteHoe(gemTANZANITE);
		RegisterHelper.registerItem(tanzaniteHoe);
		tanzaniteSword = new ItemTanzaniteSword(gemTANZANITE);
		RegisterHelper.registerItem(tanzaniteSword);

		// Peridot
		peridotPickaxe = new ItemPeridotPickaxe(gemPERIDOT);
		RegisterHelper.registerItem(peridotPickaxe);
		peridotAxe = new ItemPeridoteAxe(gemPERIDOT);
		RegisterHelper.registerItem(peridotAxe);
		peridotShovel = new ItemPeridotShovel(gemPERIDOT);
		RegisterHelper.registerItem(peridotShovel);
		peridotHoe = new ItemPeridotHoe(gemPERIDOT);
		RegisterHelper.registerItem(peridotHoe);
		peridotSword = new ItemPeridotSword(gemPERIDOT);
		RegisterHelper.registerItem(peridotSword);

		// Sapphire
		sapphirePickaxe = new ItemSapphirePickaxe(gemSAPPHIRE);
		RegisterHelper.registerItem(sapphirePickaxe);
		sapphireAxe = new ItemSapphireAxe(gemSAPPHIRE);
		RegisterHelper.registerItem(sapphireAxe);
		sapphireShovel = new ItemSapphireShovel(gemSAPPHIRE);
		RegisterHelper.registerItem(sapphireShovel);
		sapphireHoe = new ItemSapphireHoe(gemSAPPHIRE);
		RegisterHelper.registerItem(sapphireHoe);
		sapphireSword = new ItemSapphireSword(gemSAPPHIRE);
		RegisterHelper.registerItem(sapphireSword);

		// Ruby
		rubyPickaxe = new ItemRubyPickaxe(gemRUBY);
		RegisterHelper.registerItem(rubyPickaxe);
		rubyAxe = new ItemRubyAxe(gemRUBY);
		RegisterHelper.registerItem(rubyAxe);
		rubyShovel = new ItemRubyShovel(gemRUBY);
		RegisterHelper.registerItem(rubyShovel);
		rubyHoe = new ItemRubyHoe(gemRUBY);
		RegisterHelper.registerItem(rubyHoe);
		rubySword = new ItemRubySword(gemRUBY);
		RegisterHelper.registerItem(rubySword);

		// Emerald
		emeraldPickaxe = new ItemEmeraldPickaxe(gemEMERALD);
		RegisterHelper.registerItem(emeraldPickaxe);
		emeraldAxe = new ItemEmeraldAxe(gemEMERALD);
		RegisterHelper.registerItem(emeraldAxe);
		emeraldShovel = new ItemEmeraldShovel(gemEMERALD);
		RegisterHelper.registerItem(emeraldShovel);
		emeraldHoe = new ItemEmeraldHoe(gemEMERALD);
		RegisterHelper.registerItem(emeraldHoe);
		emeraldSword = new ItemEmeraldSword(gemEMERALD);
		RegisterHelper.registerItem(emeraldSword);

		// Amethyst
		amethystPickaxe = new ItemAmethystPickaxe(gemAMETHYST);
		RegisterHelper.registerItem(amethystPickaxe);
		amethystAxe = new ItemAmethystAxe(gemAMETHYST);
		RegisterHelper.registerItem(amethystAxe);
		amethystShovel = new ItemAmethystShovel(gemAMETHYST);
		RegisterHelper.registerItem(amethystShovel);
		amethystHoe = new ItemAmethystHoe(gemAMETHYST);
		RegisterHelper.registerItem(amethystHoe);
		amethystSword = new ItemAmethystSword(gemAMETHYST);
		RegisterHelper.registerItem(amethystSword);

		// Jet
		jetPickaxe = new ItemJetPickaxe(gemJET);
		RegisterHelper.registerItem(jetPickaxe);
		jetAxe = new ItemJetAxe(gemJET);
		RegisterHelper.registerItem(jetAxe);
		jetShovel = new ItemJetShovel(gemJET);
		RegisterHelper.registerItem(jetShovel);
		jetHoe = new ItemJetHoe(gemJET);
		RegisterHelper.registerItem(jetHoe);
		jetSword = new ItemJetSword(gemJET);
		RegisterHelper.registerItem(jetSword);

		// Armor Section

		// Topaz
		topazHelmet = new ItemTopazArmor(gemTOPAZarmor, 0, 0).setUnlocalizedName(Reference.MODID + "_" + "topazHelmet")
				.setTextureName(Reference.MODID + ":" + "topazHelmet");
		RegisterHelper.registerItem(topazHelmet);
		topazChest = new ItemTopazArmor(gemTOPAZarmor, 0, 1).setUnlocalizedName(Reference.MODID + "_" + "topazChest")
				.setTextureName(Reference.MODID + ":" + "topazChest");
		RegisterHelper.registerItem(topazChest);
		topazLegs = new ItemTopazArmor(gemTOPAZarmor, 0, 2).setUnlocalizedName(Reference.MODID + "_" + "topazLegs")
				.setTextureName(Reference.MODID + ":" + "topazLegs");
		RegisterHelper.registerItem(topazLegs);
		topazBoots = new ItemTopazArmor(gemTOPAZarmor, 0, 3).setUnlocalizedName(Reference.MODID + "_" + "topazBoots")
				.setTextureName(Reference.MODID + ":" + "topazBoots");
		;
		RegisterHelper.registerItem(topazBoots);

		// Malachite

		// Quartz

		// Amber

		// Tanzanite

		// Peridot

		// Sapphire

		// Ruby

		// Emerald

		// Amethyst

		// Jet

	}

}
