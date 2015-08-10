package com.ReignOfMagic.gtfo.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


public class GTFOCrafting {

    public static void init()
    {
        //Citrine Pickaxe
        GameRegistry.addRecipe(new ItemStack(ModItems.citrinePickaxe),
                "XXX",
                " P ",
                " S ",
                'X',ModItems.gemCitrine, 'P', Items.stone_pickaxe, 'S', Items.stick
        );
        //Citrine Axe


        //Citrine Shovel


        //Citrine Sword


        //Citrine Chestplate


        //Citrine Legs


        //Citrine Boots


        //Citrine Helmet
    }
}
