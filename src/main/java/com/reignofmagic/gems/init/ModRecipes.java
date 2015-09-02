package com.reignofmagic.gems.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

@SuppressWarnings("unused")
public class ModRecipes {

	public static void loadRecipes() {
		// Topaz Tools
		
		
		
/*		GameRegistry.addRecipe(new ItemStack(ModItems.topazPickaxe), "XXX", " P ", " S ", 'X',
				new ItemStack(ModItems.Gemstones, 0), 'P', Items.stone_pickaxe, 'S', Items.stick);

		GameRegistry.addRecipe(new ItemStack(ModItems.topazAxe), "XX ", "XP ", " S ", 'X',
				new ItemStack(ModItems.Gemstones, 0), 'P', Items.stone_axe, 'S', Items.stick);

		GameRegistry.addRecipe(new ItemStack(ModItems.topazHoe), "XX ", " P ", " S ", 'X',
				new ItemStack(ModItems.Gemstones, 0), 'P', Items.stone_hoe, 'S', Items.stick);

		GameRegistry.addRecipe(new ItemStack(ModItems.topazSword), " X ", " X ", " P ", 'X',
				new ItemStack(ModItems.Gemstones, 0), 'P', Items.stone_sword);

		GameRegistry.addRecipe(new ItemStack(ModItems.topazShovel), " X ", " P ", " S ", 'X',
				new ItemStack(ModItems.Gemstones, 0), 'P', Items.stone_shovel, 'S', Items.stick);*/

		// Topaz Armor

		
		
/*		GameRegistry.addRecipe(new ItemStack(ModItems.topazHelmet), "XXX", "X X", 'X',
				new ItemStack(ModItems.Gemstones, 0));

		GameRegistry.addRecipe(new ItemStack(ModItems.topazChest), "X X", "XXX", "XXX", 'X',
				new ItemStack(ModItems.Gemstones, 0));

		GameRegistry.addRecipe(new ItemStack(ModItems.topazLegs), "XXX", "X X", "X X", 'X',
				new ItemStack(ModItems.Gemstones, 0));

		GameRegistry.addRecipe(new ItemStack(ModItems.topazBoots), "X X", "X X", 'X',
				new ItemStack(ModItems.Gemstones, 1, 0));
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.malachiteAxe), "XX ", "XP ", " S ", 'X',
				new ItemStack(ModItems.Gemstones, 1, 1), 'P', Items.stone_axe, 'S', Items.stick);*/
		// Topaz Tools
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.topazPickaxe), "XXX", " P ", " S ", 'X',
				"gemTopaz", 'P', Items.stone_pickaxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.topazAxe), "XX ", "XP ", " S ", 'X',
				"gemTopaz", 'P', Items.stone_axe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.topazShovel), " X ", " P ", " S ", 'X',
				"gemTopaz", 'P', Items.stone_shovel, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.topazHoe), "XX ", " P ", " S ", 'X',
				"gemTopaz", 'P', Items.stone_hoe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.topazSword), " X ", " X ", " P ", 'X',
				"gemTopaz", 'P', Items.stone_sword));
		
		
		//Topaz Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.topazChest), "X X", "X X", "XXX", 'X',
				"gemTopaz"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.topazHelmet), "XXX", "X X", 'X',
				"gemTopaz"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.topazLegs), "XXX", "X X", "X X", 'X',
				"gemTopaz"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.topazBoots), "X X", "X X", 'X',
				"gemTopaz"));
		
		// Malachite Tools
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.malachitePickaxe), "XXX", " P ", " S ", 'X',
				"gemMalachite", 'P', ModItems.topazPickaxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.malachiteAxe), "XX ", "XP ", " S ", 'X',
				"gemMalachite", 'P', ModItems.topazAxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.malachiteShovel), " X ", " P ", " S ", 'X',
				"gemMalachite", 'P', ModItems.topazShovel, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.malachiteHoe), "XX ", " P ", " S ", 'X',
				"gemMalachite", 'P', ModItems.topazHoe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.malachiteSword), " X ", " X ", " P ", 'X',
				"gemMalachite", 'P', ModItems.topazSword));
		
		
		//Malachite Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.malachiteChest), "X X", "XPX", "XXX", 'X',
				"gemMalachite", 'P', ModItems.topazChest));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.malachiteHelmet), "XXX", "XPX", 'X',
				"gemMalachite", 'P', ModItems.topazHelmet));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.malachiteLegs), "XXX", "XPX", "X X", 'X',
				"gemMalachite", 'P', ModItems.topazLegs));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.malachiteBoots), "X X", "XPX", 'X',
				"gemMalachite", 'P', ModItems.topazBoots));
		
		// Quartz Tools
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.quartzPickaxe), "XXX", " P ", " S ", 'X',
				"gemQuartz", 'P', ModItems.malachitePickaxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.quartzAxe), "XX ", "XP ", " S ", 'X',
				"gemQuartz", 'P', ModItems.malachiteAxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.quartzShovel), " X ", " P ", " S ", 'X',
				"gemQuartz", 'P', ModItems.malachiteShovel, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.quartzHoe), "XX ", " P ", " S ", 'X',
				"gemQuartz", 'P', ModItems.malachiteHoe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.quartzSword), " X ", " X ", " P ", 'X',
				"gemQuartz", 'P', ModItems.malachiteSword));
		
		
		//Quartz Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.quartzChest), "X X", "XPX", "XXX", 'X',
				"gemQuartz", 'P', ModItems.malachiteChest));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.quartzHelmet), "XXX", "XPX", 'X',
				"gemQuartz", 'P', ModItems.malachiteHelmet));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.quartzLegs), "XXX", "XPX", "X X", 'X',
				"gemQuartz", 'P', ModItems.malachiteLegs));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.quartzBoots), "X X", "XPX", 'X',
				"gemQuartz", 'P', ModItems.malachiteBoots));

		// Amber Tools
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amberPickaxe), "XXX", " P ", " S ", 'X',
				"gemAmber", 'P', ModItems.quartzPickaxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amberAxe), "XX ", "XP ", " S ", 'X',
				"gemAmber", 'P', ModItems.quartzAxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amberShovel), " X ", " P ", " S ", 'X',
				"gemAmber", 'P', ModItems.quartzShovel, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amberHoe), "XX ", " P ", " S ", 'X',
				"gemAmber", 'P', ModItems.quartzHoe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amberSword), " X ", " X ", " P ", 'X',
				"gemAmber", 'P', ModItems.quartzSword));
		
		
		//Amber Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amberChest), "X X", "XPX", "XXX", 'X',
				"gemAmber", 'P', ModItems.quartzChest));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amberHelmet), "XXX", "XPX", 'X',
				"gemAmber", 'P', ModItems.quartzHelmet));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amberLegs), "XXX", "XPX", "X X", 'X',
				"gemAmber", 'P', ModItems.quartzLegs));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amberBoots), "X X", "XPX", 'X',
				"gemAmber", 'P', ModItems.quartzBoots));
		
		// Tanzanite Tools
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzanitePickaxe), "XXX", " P ", " S ", 'X',
				"gemTanzanite", 'P', ModItems.amberPickaxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzaniteAxe), "XX ", "XP ", " S ", 'X',
				"gemTanzanite", 'P', ModItems.amberAxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzaniteShovel), " X ", " P ", " S ", 'X',
				"gemTanzanite", 'P', ModItems.amberShovel, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzaniteHoe), "XX ", " P ", " S ", 'X',
				"gemTanzanite", 'P', ModItems.amberHoe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzaniteSword), " X ", " X ", " P ", 'X',
				"gemTanzanite", 'P', ModItems.amberSword));
		
		
		//Tanzanite Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzaniteChest), "X X", "XPX", "XXX", 'X',
				"gemTanzanite", 'P', ModItems.amberChest));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzaniteHelmet), "XXX", "XPX", 'X',
				"gemTanzanite", 'P', ModItems.amberHelmet));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzaniteLegs), "XXX", "XPX", "X X", 'X',
				"gemTanzanite", 'P', ModItems.amberLegs));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzaniteBoots), "X X", "XPX", 'X',
				"gemTanzanite", 'P', ModItems.amberBoots));
		
		// Peridot Tools
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.peridotPickaxe), "XXX", " P ", " S ", 'X',
				"gemPeridot", 'P', Items.diamond_pickaxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.peridotAxe), "XX ", "XP ", " S ", 'X',
				"gemPeridot", 'P', Items.diamond_axe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.peridotShovel), " X ", " P ", " S ", 'X',
				"gemPeridot", 'P', Items.diamond_shovel, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.peridotHoe), "XX ", " P ", " S ", 'X',
				"gemPeridot", 'P', Items.diamond_hoe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.peridotSword), " X ", " X ", " P ", 'X',
				"gemPeridot", 'P', Items.diamond_sword));
		
		
		//Peridot Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.peridotChest), "X X", "XPX", "XXX", 'X',
				"gemPeridot", 'P', Items.diamond_chestplate));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.peridotHelmet), "XXX", "XPX", 'X',
				"gemPeridot", 'P', Items.diamond_helmet));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.peridotLegs), "XXX", "XPX", "X X", 'X',
				"gemPeridot", 'P', Items.diamond_leggings));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.peridotBoots), "X X", "XPX", 'X',
				"gemPeridot", 'P', Items.diamond_boots));
	
		// Sapphire Tools
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sapphirePickaxe), "XXX", " P ", " S ", 'X',
				"gemSapphire", 'P', ModItems.peridotPickaxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sapphireAxe), "XX ", "XP ", " S ", 'X',
				"gemSapphire", 'P', ModItems.peridotAxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sapphireShovel), " X ", " P ", " S ", 'X',
				"gemSapphire", 'P', ModItems.peridotShovel, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sapphireHoe), "XX ", " P ", " S ", 'X',
				"gemSapphire", 'P', ModItems.peridotHoe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sapphireSword), " X ", " X ", " P ", 'X',
				"gemSapphire", 'P', ModItems.peridotSword));
		
		
		//Sapphire Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sapphireChest), "X X", "XPX", "XXX", 'X',
				"gemSapphire", 'P', ModItems.peridotChest));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sapphireHelmet), "XXX", "XPX", 'X',
				"gemSapphire", 'P', ModItems.peridotHelmet));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sapphireLegs), "XXX", "XPX", "X X", 'X',
				"gemSapphire", 'P', ModItems.peridotLegs));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.sapphireBoots), "X X", "XPX", 'X',
				"gemSapphire", 'P', ModItems.peridotBoots));
		
		// Ruby Tools
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyPickaxe), "XXX", " P ", " S ", 'X',
				"gemRuby", 'P', ModItems.sapphirePickaxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyAxe), "XX ", "XP ", " S ", 'X',
				"gemRuby", 'P', ModItems.sapphireAxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyShovel), " X ", " P ", " S ", 'X',
				"gemRuby", 'P', ModItems.sapphireShovel, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyHoe), "XX ", " P ", " S ", 'X',
				"gemRuby", 'P', ModItems.sapphireHoe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubySword), " X ", " X ", " P ", 'X',
				"gemRuby", 'P', ModItems.sapphireSword));
		
		
		//Ruby Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyChest), "X X", "XPX", "XXX", 'X',
				"gemRuby", 'P', ModItems.sapphireChest));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyHelmet), "XXX", "XPX", 'X',
				"gemRuby", 'P', ModItems.sapphireHelmet));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyLegs), "XXX", "XPX", "X X", 'X',
				"gemRuby", 'P', ModItems.sapphireLegs));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.rubyBoots), "X X", "XPX", 'X',
				"gemRuby", 'P', ModItems.sapphireBoots));
		
		// Emerald Tools
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldPickaxe), "XXX", " P ", " S ", 'X',
				"gemEmerald", 'P', ModItems.rubyPickaxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldAxe), "XX ", "XP ", " S ", 'X',
				"gemEmerald", 'P', ModItems.rubyAxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldShovel), " X ", " P ", " S ", 'X',
				"gemEmerald", 'P', ModItems.rubyShovel, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHoe), "XX ", " P ", " S ", 'X',
				"gemEmerald", 'P', ModItems.rubyHoe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldSword), " X ", " X ", " P ", 'X',
				"gemEmerald", 'P', ModItems.rubySword));
		
		
		//Emerald Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldChest), "X X", "XPX", "XXX", 'X',
				"gemEmerald", 'P', ModItems.rubyChest));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldHelmet), "XXX", "XPX", 'X',
				"gemEmerald", 'P', ModItems.rubyHelmet));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldLegs), "XXX", "XPX", "X X", 'X',
				"gemEmerald", 'P', ModItems.rubyLegs));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.emeraldBoots), "X X", "XPX", 'X',
				"gemEmerald", 'P', ModItems.rubyBoots));

		// Amethyst Tools
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amethystPickaxe), "XXX", " P ", " S ", 'X',
				"gemAmethyst", 'P', ModItems.emeraldPickaxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amethystAxe), "XX ", "XP ", " S ", 'X',
				"gemAmethyst", 'P', ModItems.emeraldAxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amethystShovel), " X ", " P ", " S ", 'X',
				"gemAmethyst", 'P', ModItems.emeraldShovel, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amethystHoe), "XX ", " P ", " S ", 'X',
				"gemAmethyst", 'P', ModItems.emeraldHoe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amethystSword), " X ", " X ", " P ", 'X',
				"gemAmethyst", 'P', ModItems.emeraldSword));
		
		
		//Amethyst Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amethystChest), "X X", "XPX", "XXX", 'X',
				"gemAmethyst", 'P', ModItems.emeraldChest));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amethystHelmet), "XXX", "XPX", 'X',
				"gemAmethyst", 'P', ModItems.emeraldHelmet));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amethystLegs), "XXX", "XPX", "X X", 'X',
				"gemAmethyst", 'P', ModItems.emeraldLegs));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.amethystBoots), "X X", "XPX", 'X',
				"gemAmethyst", 'P', ModItems.emeraldBoots));
		
		// Jet Tools
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.jetPickaxe), "XXX", " P ", " S ", 'X',
				"gemJet", 'P', ModItems.amethystPickaxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.jetAxe), "XX ", "XP ", " S ", 'X',
				"gemJet", 'P', ModItems.amethystAxe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.jetShovel), " X ", " P ", " S ", 'X',
				"gemJet", 'P', ModItems.amethystShovel, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.jetHoe), "XX ", " P ", " S ", 'X',
				"gemJet", 'P', ModItems.amethystHoe, 'S', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.jetSword), " X ", " X ", " P ", 'X',
				"gemJet", 'P', ModItems.amethystSword));
		
		
		//Jet Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.jetChest), "X X", "XPX", "XXX", 'X',
				"gemJet", 'P', ModItems.amethystChest));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.jetHelmet), "XXX", "XPX", 'X',
				"gemJet", 'P', ModItems.amethystHelmet));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.jetLegs), "XXX", "XPX", "X X", 'X',
				"gemJet", 'P', ModItems.amethystLegs));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.jetBoots), "X X", "XPX", 'X',
				"gemJet", 'P', ModItems.amethystBoots));
		
		//Gems to GemBlocks
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.gemBlocks, 1, 0), "XXX", "XXX", "XXX", 'X',
				"gemTopaz"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.gemBlocks, 1, 1), "XXX", "XXX", "XXX", 'X',
				"gemMalachite"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.gemBlocks, 1, 2), "XXX", "XXX", "XXX", 'X',
				"gemAmber"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.gemBlocks, 1, 3), "XXX", "XXX", "XXX", 'X',
				"gemTanzanite"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.gemBlocks, 1, 4), "XXX", "XXX", "XXX", 'X',
				"gemPeridot"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.gemBlocks, 1, 5), "XXX", "XXX", "XXX", 'X',
				"gemSapphire"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.gemBlocks, 1, 6), "XXX", "XXX", "XXX", 'X',
				"gemRuby"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.gemBlocks, 1, 7), "XXX", "XXX", "XXX", 'X',
				"gemAmethyst"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.gemBlocks, 1, 8), "XXX", "XXX", "XXX", 'X',
				"gemJet"));
		
		//GemBlocks to Gems
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.Gemstones, 9, 0), "X", 'X', "blockTopaz"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.Gemstones, 9, 1), "X", 'X', "blockMalachite"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.Gemstones, 9, 2), "X", 'X', "blockAmber"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.Gemstones, 9, 3), "X", 'X', "blockTanzanite"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.Gemstones, 9, 4), "X", 'X', "blockPeridot"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.Gemstones, 9, 5), "X", 'X', "blockSapphire"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.Gemstones, 9, 6), "X", 'X', "blockRuby"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.Gemstones, 9, 7), "X", 'X', "blockAmethyst"));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.Gemstones, 9, 8), "X", 'X', "blockJet"));
		
		//GemBlocks to Compressed GemBlocks

		
		
	}

}
