package com.reignofmagic.gems;

import com.reignofmagic.gems.blocks.ModBlocks;
import com.reignofmagic.gems.handler.Dictionary;
import com.reignofmagic.gems.handler.GTFOtab;
import com.reignofmagic.gems.handler.ModRecipes;
import com.reignofmagic.gems.handler.ReignEventHandler;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.items.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)

public class Gems {
	public static CreativeTabs GTFOtab = new GTFOtab(CreativeTabs.getNextID(), "GTFOtab");
	ReignEventHandler handler = new ReignEventHandler();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		ModBlocks.loadBlocks();
		ModItems.LoadItems();
		Dictionary.oreDictionary();
		GameRegistry.registerWorldGenerator(handler, 0);

	}
@EventHandler
	public void init(FMLInitializationEvent event) {

ModRecipes.loadRecipes();
	}
@EventHandler
	public void init(FMLPostInitializationEvent event) {
	
		
		}
	
	}

