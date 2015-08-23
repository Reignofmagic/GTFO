package com.reignofmagic.gems.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemgemPostDiamond extends ItemBlock{

	public static final String[] names = {"Peridot", "Sapphire", "Ruby", "Amethyst", "Jet"};

    public ItemgemPostDiamond(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return getUnlocalizedName() + "" + names[stack.getItemDamage() % names.length];
    }

    @Override
    public int getMetadata(int meta) {
        return meta;
    }
    
}
