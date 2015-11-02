package com.reignofmagic.gems.render.item;

import com.reignofmagic.gems.tile_entity.TileEntityTestChest;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderertestchest implements IItemRenderer {
	
	private ModelChest chestModel;
	

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityTestChest(),0.0D,0.0D,0.0D,0.0F);
		
		// TODO Auto-generated method stub

	}

}
