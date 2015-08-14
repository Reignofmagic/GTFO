package com.reignofmagic.gems.handler;

import com.reignofmagic.gems.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {

	public static void LoadRecipes() 
	{
		//Citrine Tools 
		GameRegistry.addRecipe(new ItemStack(ModItems.citrinePickaxe),
                  "XXX",
                  " P ",
                  " S ",
                  'X',ModItems.gemCitrine, 'P', Items.stone_pickaxe, 'S', Items.stick
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.citrineAxe),
                  "XX ",
                  "XP ",
                  " S ",
                  'X',ModItems.gemCitrine, 'P', Items.stone_axe, 'S', Items.stick
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.citrineHoe),
                  "XX ",
                  " P ",
                  " S ",
                  'X',ModItems.gemCitrine, 'P', Items.stone_hoe, 'S', Items.stick
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.citrineSword),
                  " X ",
                  " X ",
                  " P ",
                  'X',ModItems.gemCitrine, 'P', Items.stone_sword
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.citrineShovel),
                  " X ",
                  " P ",
                  " S ",
                  'X',ModItems.gemCitrine, 'P', Items.stone_shovel, 'S', Items.stick
          );
		  
		  //Citrine Armor
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.citrineHelmet),
                  "XXX",
                  "X X",
                  'X',ModItems.gemCitrine
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.citrineChest),
                  "X X",
                  "XXX",
                  "XXX",
                  'X',ModItems.gemCitrine
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.citrineLegs),
                  "XXX",
                  "X X",
                  "X X",
                  'X',ModItems.gemCitrine
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.citrineBoots),
                  "X X",
                  "X X",
                  'X',ModItems.gemCitrine
          );
		  
		
		
		
		  
		
	}
	

}
