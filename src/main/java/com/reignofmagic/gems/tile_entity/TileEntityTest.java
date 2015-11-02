package com.reignofmagic.gems.tile_entity;

import com.reignofmagic.gems.helper.Reference;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityTest {

	public static void loadEntities(){
		registerTileEntities();
	}
	
	private static void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityTestChest.class, Reference.MODID);
	}
	
}
