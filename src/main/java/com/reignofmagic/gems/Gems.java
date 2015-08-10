package com.reignofmagic.gems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import com.reignofmagic.gems.blocks.BlockOreCitrine;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.helper.RegisterHelper;
;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class Gems
{
   public static Block oreCitrine; 
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	oreCitrine = new BlockOreCitrine();
    	RegisterHelper.registerBlock(oreCitrine);
    }
    
    
    public void init(FMLInitializationEvent event)
    {
		
    }
    
    public void init(FMLPostInitializationEvent event)
    {
		
    }
    
    
}
