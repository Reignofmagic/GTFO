package com.ReignOfMagic.gtfo.item;


import com.ReignOfMagic.gtfo.reference.Reference;

import net.minecraft.item.ItemPickaxe;

public class CitrinePickaxe extends ItemPickaxe
{

    public CitrinePickaxe(String unlocalizedName, ToolMaterial material) {
        super(material);
    //public CitrinePickaxe(ToolMaterial material, String name)


        setUnlocalizedName(Reference.MOD_ID + "_" + "citrinePickaxe");
        setTextureName(Reference.MOD_ID + ":" + "citrinePickaxe");
        setMaxStackSize(1);

    }
}