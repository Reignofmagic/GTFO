package com.ReignOfMagic.gtfo.init;

import com.ReignOfMagic.gtfo.item.ItemGTFO;
import com.ReignOfMagic.gtfo.item.ItemGemCitrine;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Chris on 8/9/2015.
 */
public class ModItems
{
    public static final ItemGTFO gemCitrine = new ItemGemCitrine();

    public static void init()
    {
        GameRegistry.registerItem(gemCitrine, "Citrine");
    }

}
