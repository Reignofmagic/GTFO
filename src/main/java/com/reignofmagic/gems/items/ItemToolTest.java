package com.reignofmagic.gems.items;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.reignofmagic.gems.Gems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemToolTest extends ItemPickaxe{

	public ItemToolTest (ToolMaterial material){
		super (material);
		setCreativeTab(Gems.GTFOtab);
		this.setHarvestLevel("pickaxe", 10);
		this.setHarvestLevel("Shovel", 10);
		

	}
	@Override
	public Set<String> getToolClasses(ItemStack stack){
		return ImmutableSet.of("pickaxe", "shovel");
	}
	 @Override
	    public int getHarvestLevel(ItemStack itemStack, String toolClass) {
	        if((toolClass.equals("shovel") || toolClass.equals("pickaxe"))){
	            return super.getHarvestLevel(itemStack, toolClass);
	        }else{
	            return -1;
	        }
	 }
	 
}
