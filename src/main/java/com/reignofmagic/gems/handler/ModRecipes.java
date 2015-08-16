package com.reignofmagic.gems.handler;

import com.reignofmagic.gems.items.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {

	public static void LoadRecipes() 
	{
		//Citrine Tools 
		GameRegistry.addRecipe(new ItemStack(ModItems.topazPickaxe),
                  "XXX",
                  " P ",
                  " S ",
                  'X',new ItemStack(ModItems.PreDiamondgemstones, 0), 'P', Items.stone_pickaxe, 'S', Items.stick
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.topazAxe),
                  "XX ",
                  "XP ",
                  " S ",
                  'X',new ItemStack(ModItems.PreDiamondgemstones, 0), 'P', Items.stone_axe, 'S', Items.stick
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.topazHoe),
                  "XX ",
                  " P ",
                  " S ",
                  'X',new ItemStack(ModItems.PreDiamondgemstones, 0), 'P', Items.stone_hoe, 'S', Items.stick
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.topazSword),
                  " X ",
                  " X ",
                  " P ",
                  'X',new ItemStack(ModItems.PreDiamondgemstones, 0), 'P', Items.stone_sword
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.topazShovel),
                  " X ",
                  " P ",
                  " S ",
                  'X',new ItemStack(ModItems.PreDiamondgemstones, 0), 'P', Items.stone_shovel, 'S', Items.stick
          );
		  
		  //Citrine Armor
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.topazHelmet),
                  "XXX",
                  "X X",
                  'X',new ItemStack(ModItems.PreDiamondgemstones, 0)
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.topazChest),
                  "X X",
                  "XXX",
                  "XXX",
                  'X',new ItemStack(ModItems.PreDiamondgemstones, 0)
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.topazLegs),
                  "XXX",
                  "X X",
                  "X X",
                  'X',new ItemStack(ModItems.PreDiamondgemstones, 0)
          );
		  
		  GameRegistry.addRecipe(new ItemStack(ModItems.topazBoots),
                  "X X",
                  "X X",
                  'X',new ItemStack(ModItems.PreDiamondgemstones, 0)
          );
		  
		
		//Malachite Tools
		  GameRegistry.addRecipe(new ItemStack(ModItems.malachitePickaxe),
                  "XXX",
                  " P ",
                  " S ",
                  'X',new ItemStack(ModItems.PreDiamondgemstones, 1), 'P', Items.stone_pickaxe, 'S', Items.stick
		
				   );
		
	}
	

}
