package com.ReignOfMagic.gtfo.init;

import com.ReignOfMagic.gtfo.block.BlockOreCitrine;
import cpw.mods.fml.common.registry.GameRegistry;


public class ModBlocks
{
    public static final BlockOreCitrine oreCitrine = new BlockOreCitrine();

    public static void init()
    {
        GameRegistry.registerBlock(oreCitrine, "oreCitrine");
    }

}
