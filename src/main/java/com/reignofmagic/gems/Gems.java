package com.reignofmagic.gems;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;

import com.reignofmagic.gems.blocks.BlockOreCitrine;

import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.helper.RegisterHelper;
import com.reignofmagic.gems.items.ItemGemCitrine;
import com.reignofmagic.gems.items.ItemCitrineAxe;
import com.reignofmagic.gems.items.ItemCitrineHoe;
import com.reignofmagic.gems.items.ItemCitrinePickaxe;
import com.reignofmagic.gems.items.ItemCitrineShovel;
import com.reignofmagic.gems.items.ItemCitrineSword;
;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class Gems
{
   
   //Ores
   public static Block oreCitrine; 
   
   //Gems
   public static Item gemCitrine;
   
   //Tools
   public static Item citrinePickaxe;
   
   public static Item citrineAxe;
   
   public static Item citrineHoe;
   
   public static Item citrineShovel;
   
   public static Item citrineSword;
   
   
   
   //Materials Single Purpose
   
   public static Item.ToolMaterial gemCITRINE = EnumHelper.addToolMaterial("gemCITRINE", 2, 175, 5F, 1.5F, 16);
   public static Item.ToolMaterial gemTOPAZ = EnumHelper.addToolMaterial("gemTOPAZ", 2, 225, 5.5F, 2F, 14);
   public static Item.ToolMaterial gemQUARTZ = EnumHelper.addToolMaterial("gemQUARTZ", 2, 250, 6F, 2.5F, 12);
   public static Item.ToolMaterial gemOPAL = EnumHelper.addToolMaterial("gemOPAL", 2, 900, 7F, 2.75F, 12);
   public static Item.ToolMaterial gemDIAMOND = EnumHelper.addToolMaterial("gemDIMAOND", 3, 1563, 8F, 3F, 10);
   public static Item.ToolMaterial gemSAPPHIRE = EnumHelper.addToolMaterial("gemSAPPHIRE", 3, 1860, 9F, 4F, 12);
   public static Item.ToolMaterial gemRUBY = EnumHelper.addToolMaterial("gemRUBY", 3, 2190, 10F, 5F, 14);
   public static Item.ToolMaterial gemEMERALD = EnumHelper.addToolMaterial("gemEMERALD", 3, 3310, 11F, 7F, 16);
   public static Item.ToolMaterial gemAMYTHEST = EnumHelper.addToolMaterial("gemAMYTHEST", 3, 5120, 12F, 9F, 20);
   public static Item.ToolMaterial gemJET = EnumHelper.addToolMaterial("gemJET", 3, 8686, 15F, 11F, 25);
   
   //Multiple Tool Materials
   public static Item.ToolMaterial gemCITRINEPoel = EnumHelper.addToolMaterial("gemCITRINEPoel", 2, 675, 50F, 1.5F, 16);
   
   
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	
    	//Ores
    	oreCitrine = new BlockOreCitrine();
    	RegisterHelper.registerBlock(oreCitrine);
    	
    	
    	//Gems
    	gemCitrine = new ItemGemCitrine();
    	RegisterHelper.registerItem(gemCitrine);
    	
    	
    	//Tools
    	citrinePickaxe = new ItemCitrinePickaxe(gemCITRINE);
    	RegisterHelper.registerItem(citrinePickaxe);
    	
    	citrineAxe = new ItemCitrineAxe(gemCITRINE);
    	RegisterHelper.registerItem(citrineAxe);
    	
    	citrineShovel = new ItemCitrineShovel(gemCITRINE);
    	RegisterHelper.registerItem(citrineShovel);
    	
    	citrineHoe = new ItemCitrineHoe(gemCITRINE);
    	RegisterHelper.registerItem(citrineHoe);
    	
    	citrineSword = new ItemCitrineSword(gemCITRINE);
    	RegisterHelper.registerItem(citrineSword);
    	
    	
    	//Recipe
    	
           GameRegistry.addRecipe(new ItemStack(citrinePickaxe),
                    "XXX",
                    " P ",
                    " S ",
                    'X',gemCitrine, 'P', Items.stone_pickaxe, 'S', Items.stick
            );
    	
    	
    	
    }
    
    
    public void init(FMLInitializationEvent event)
    {
    
    }
    
    public void init(FMLPostInitializationEvent event)
    {
		
    }
    
    
}
