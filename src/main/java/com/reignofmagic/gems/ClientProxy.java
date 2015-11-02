package com.reignofmagic.gems;

import com.reignofmagic.gems.init.ModBlocks;
import com.reignofmagic.gems.render.chesttestRenderer;
import com.reignofmagic.gems.render.item.ItemRenderertestchest;
import com.reignofmagic.gems.tile_entity.TileEntityTestChest;

import cpw.mods.fml.client.registry.ClientRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTestChest.class, new chesttestRenderer());
	
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.chesttest), new ItemRenderertestchest());
	}


}
