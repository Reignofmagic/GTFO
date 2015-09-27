package com.reignofmagic.gems.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

@SuppressWarnings("unused")
public class ModRecipes {

	public static void loadRecipes() {
			
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
		GameRegistry.addRecipe(new ItemStack(ModItems.topazDual), " X ", " Y ", " S ", 'X',
				new ItemStack(ModItems.topazShovel), 'Y', new ItemStack(ModItems.topazPickaxe), 'S', Items.stick);
		
		
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
		GameRegistry.addRecipe(new ItemStack(ModItems.malachiteDual), " X ", " Y ", " S ", 'X',
				new ItemStack(ModItems.malachiteShovel), 'Y', new ItemStack(ModItems.malachitePickaxe), 'P', Items.stick);
		
		
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
		GameRegistry.addRecipe(new ItemStack(ModItems.quartzDual), " X ", " Y ", " S ", 'X',
				new ItemStack(ModItems.quartzShovel), 'Y', new ItemStack(ModItems.quartzPickaxe), 'S', Items.stick);
		
		
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
		GameRegistry.addRecipe(new ItemStack(ModItems.amberDual), " X ", " Y ", " S ", 'X',
				new ItemStack(ModItems.amberShovel), 'Y', new ItemStack(ModItems.amberPickaxe), 'S', Items.stick);
		
		
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
		GameRegistry.addRecipe(new ItemStack(ModItems.tanzaniteDual), " X ", " Y ", " S ", 'X',
				new ItemStack(ModItems.tanzaniteShovel), 'Y', new ItemStack(ModItems.tanzanitePickaxe), 'S', Items.stick);
		
		
		//Tanzanite Armor
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzaniteChest), "X X", "XPX", "XXX", 'X',
				"gemTanzanite", 'P', ModItems.amberChest));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzaniteHelmet), "XXX", "XPX", 'X',
				"gemTanzanite", 'P', ModItems.amberHelmet));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzaniteLegs), "XXX", "XPX", "X X", 'X',
				"gemTanzanite", 'P', ModItems.amberLegs));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.tanzaniteBoots), "X X", "XPX", 'X',
				"gemTanzanite", 'P', ModItems.amberBoots));
		
		//Diamond Tools
		GameRegistry.addRecipe(new ItemStack(ModItems.diamondDual), " X ", " Y ", " S ", 'X',
				Items.diamond_shovel, 'Y', Items.diamond_pickaxe, 'S', Items.stick);
		
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
		GameRegistry.addRecipe(new ItemStack(ModItems.peridotDual), " X ", " Y ", " S ", 'X',
				new ItemStack(ModItems.peridotShovel), 'Y', new ItemStack(ModItems.peridotPickaxe), 'S', Items.stick);
		
		
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
		GameRegistry.addRecipe(new ItemStack(ModItems.sapphireDual), " X ", " Y ", " S ", 'X',
				new ItemStack(ModItems.sapphireShovel), 'Y', new ItemStack(ModItems.sapphirePickaxe), 'S', Items.stick);
		
		
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
		GameRegistry.addRecipe(new ItemStack(ModItems.rubyDual), " X ", " Y ", " S ", 'X',
				new ItemStack(ModItems.rubyShovel), 'Y', new ItemStack(ModItems.rubyPickaxe), 'S', Items.stick);
		
		
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
		GameRegistry.addRecipe(new ItemStack(ModItems.emeraldDual), " X ", " Y ", " S ", 'X',
				new ItemStack(ModItems.emeraldShovel), 'Y', new ItemStack(ModItems.emeraldPickaxe), 'S', Items.stick);
		
		
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
		GameRegistry.addRecipe(new ItemStack(ModItems.amethystDual), " X ", " Y ", " S ", 'X',
				new ItemStack(ModItems.amethystShovel), 'Y', new ItemStack(ModItems.amethystPickaxe), 'S', Items.stick);
		
		
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
		GameRegistry.addRecipe(new ItemStack(ModItems.jetDual), " X ", " Y ", " S ", 'X',
				new ItemStack(ModItems.jetShovel), 'Y', new ItemStack(ModItems.jetPickaxe), 'S', Items.stick);
		
		
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

		
		
		//GemPutty
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemPutty, 4), "XXX", "XSX", "XXX", 'X',
				"gemTopaz", 'S', Items.slime_ball));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemPutty, 4), "XXX", "XSX", "XX ", 'X',
				"gemMalachite", 'S', Items.slime_ball));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemPutty, 4), "XXX", "XSX", "X  ", 'X',
				"gemQuartz", 'S', Items.slime_ball));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemPutty, 4), "XXX", "XSX", "X  ", 'X',
				"gemAmber", 'S', Items.slime_ball));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemPutty, 4), "XXX", "XSX", 'X',
				"gemTanzanite", 'S', Items.slime_ball));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemPutty, 4), "XXX", "XS ", 'X',
				"gemDiamond", 'S', Items.slime_ball));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemPutty, 4), "XXX", " S ", 'X',
				"gemPeridot", 'S', Items.slime_ball));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemPutty, 4), "XXX", " S ", 'X',
				"gemSapphire", 'S', Items.slime_ball));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemPutty, 4), "XXX", " S ", 'X',
				"gemRuby", 'S', Items.slime_ball));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemPutty, 4), "XXX", " S ", 'X',
				"gemEmerald", 'S', Items.slime_ball));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemPutty, 4), "XSX", 'X',
				"gemAmethyst", 'S', Items.slime_ball));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.gemPutty, 4),  "XS ", 'X',
				"gemJet", 'S', Items.slime_ball));
		
	}

}
