package com.ReignOfMagic.gtfo;

import com.ReignOfMagic.gtfo.handler.ConfigurationHandler;
import com.ReignOfMagic.gtfo.init.GTFOCrafting;
import com.ReignOfMagic.gtfo.init.ModBlocks;
import com.ReignOfMagic.gtfo.init.ModItems;
import com.ReignOfMagic.gtfo.proxy.IProxy;
import com.ReignOfMagic.gtfo.reference.Reference;
import com.ReignOfMagic.gtfo.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class GTFO {

    @Mod.Instance(Reference.MOD_ID)
    public static GTFO instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;



    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());


        ModItems.init();
        ModBlocks.init();

        LogHelper.info("Pre Initialization Complete");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        GTFOCrafting.init();

        LogHelper.info("Initialization Complete");
    }
    @Mod.EventHandler
    public void init (FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
    }
}
