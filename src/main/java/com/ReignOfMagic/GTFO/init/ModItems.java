package com.ReignOfMagic.gtfo.init;

import com.ReignOfMagic.gtfo.item.CitrinePickaxe;
import com.ReignOfMagic.gtfo.item.ItemGemCitrine;
import com.ReignOfMagic.gtfo.item.ItemGemTopaz;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;


public final class ModItems
{
    public static Item.ToolMaterial CITRINE = EnumHelper.addToolMaterial("CITRINE", 2, 175, 5F, 1.5F, 16);
    public static Item.ToolMaterial CITRINEPoel = EnumHelper.addToolMaterial("CITRINEPoel", 2, 675, 50F, 1.5F, 16);
    public static Item.ToolMaterial TOPAZ = EnumHelper.addToolMaterial("TOPAZ", 2, 225, 5.5F, 2F, 14);
    public static Item.ToolMaterial QUARTZ = EnumHelper.addToolMaterial("QUARTZ", 2, 250, 6F, 2.5F, 12);
    public static Item.ToolMaterial OPAL = EnumHelper.addToolMaterial("OPAL", 2, 900, 7F, 2.75F, 12);
    public static Item.ToolMaterial DIAMOND = EnumHelper.addToolMaterial("DIMAOND", 3, 1563, 8F, 3F, 10);
    public static Item.ToolMaterial SAPPHIRE = EnumHelper.addToolMaterial("SAPPHIRE", 3, 1860, 9F, 4F, 12);
    public static Item.ToolMaterial RUBY = EnumHelper.addToolMaterial("RUBY", 3, 2190, 10F, 5F, 14);
    public static Item.ToolMaterial EMERALD = EnumHelper.addToolMaterial("EMERALD", 3, 3310, 11F, 7F, 16);
    public static Item.ToolMaterial AMYTHEST = EnumHelper.addToolMaterial("AMYTHEST", 3, 5120, 12F, 9F, 20);
    public static Item.ToolMaterial JET = EnumHelper.addToolMaterial("JET", 3, 8686, 15F, 11F, 25);

    public static Item citrinePickaxe;

    public static final ItemGemCitrine gemCitrine = new ItemGemCitrine();

    public static void init()
    {
        GameRegistry.registerItem(gemCitrine, "gemCitrine");
        GameRegistry.registerItem(gemTopaz, "gemTopaz");
        GameRegistry.registerItem(citrinePickaxe = new CitrinePickaxe("citrinePickaxe", CITRINE), "citrinePickaxe");


        //GameRegistry.registerItem(citrinePickaxe, "citrinePickaxe");
    }

    public static final ItemGemTopaz gemTopaz = new ItemGemTopaz();



}
