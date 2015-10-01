package com.reignofmagic.gems;

import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.init.Dictionary;
import com.reignofmagic.gems.init.GTFOtab;
import com.reignofmagic.gems.init.ModBlocks;
import com.reignofmagic.gems.init.ModItems;
import com.reignofmagic.gems.init.ModRecipes;
import com.reignofmagic.gems.init.onAnvilUpdate;
import com.reignofmagic.gems.world.ReignWorldGen;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.player.AnvilRepairEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)

public class Gems {
	public static CreativeTabs GTFOtab = new GTFOtab(CreativeTabs.getNextID(), "GTFOtab");
	ReignWorldGen handler = new ReignWorldGen();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ModBlocks.loadBlocks();
		ModItems.LoadItems();
		Dictionary.oreDictionary();
		GameRegistry.registerWorldGenerator(handler, 0);
		MinecraftForge.EVENT_BUS.register(new onAnvilUpdate());

	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		ModRecipes.loadRecipes();
		
	}
@EventHandler
public void init(AnvilUpdateEvent event){
	
}
	@EventHandler
	public void init(FMLPostInitializationEvent event) {
	
		
	}	
}