package com.reignofmagic.gems;

import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.init.Dictionary;
import com.reignofmagic.gems.init.GTFOtab;
import com.reignofmagic.gems.init.ModBlocks;
import com.reignofmagic.gems.init.ModItems;
import com.reignofmagic.gems.init.ModRecipes;
import com.reignofmagic.gems.init.onAnvilUpdatePutty;
import com.reignofmagic.gems.init.onAnvilUpdatePuttyCompact;
import com.reignofmagic.gems.tile_entity.TileEntityTest;
import com.reignofmagic.gems.tile_entity.TileEntityTestChest;
import com.reignofmagic.gems.world.ReignWorldGen;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AnvilUpdateEvent;
import net.minecraftforge.event.entity.player.AnvilRepairEvent;


// Many thanks to all those who have helped me make this mod a reality. 
// People who contributed/helped/have Open sourced mods are fantastic here are their names
// Hlaaftana, ljfa, GoldenApple, OreCruncher, Type1Ninja, Wuppy, Pahimar, XFactor, Boni, SatanicSanta, Tehnut
// TitaniumMissle, Shadowfactsdev, and a few others who I can't remember.  


@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)

public class Gems {
	
	@SidedProxy(clientSide = "com.reignofmagic.gems.ClientProxy", serverSide = "com.reignofmagic.gems.ServerProxy")
	public static ServerProxy proxy;
	
	public static CreativeTabs GTFOtab = new GTFOtab(CreativeTabs.getNextID(), "GTFOtab");
	ReignWorldGen handler = new ReignWorldGen();

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ModBlocks.loadBlocks();
		ModItems.LoadItems();
		Dictionary.oreDictionary();
		GameRegistry.registerWorldGenerator(handler, 0);
		MinecraftForge.EVENT_BUS.register(new onAnvilUpdatePutty());
		MinecraftForge.EVENT_BUS.register(new onAnvilUpdatePuttyCompact());
		TileEntityTest.loadEntities();
		
		proxy.registerRenderThings();
	

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