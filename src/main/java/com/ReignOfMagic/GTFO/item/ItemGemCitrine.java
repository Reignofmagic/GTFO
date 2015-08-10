package com.ReignOfMagic.gtfo.item;



        import com.ReignOfMagic.gtfo.GTFO;
        import com.ReignOfMagic.gtfo.reference.Reference;
        import cpw.mods.fml.relauncher.Side;
        import cpw.mods.fml.relauncher.SideOnly;
        import net.minecraft.client.renderer.texture.IIconRegister;
        import net.minecraft.creativetab.CreativeTabs;
        import net.minecraft.item.Item;
        import net.minecraft.util.IIcon;

public class ItemGemCitrine extends Item {
    public ItemGemCitrine() {
        setUnlocalizedName(Reference.MOD_ID + "_" + "gemCitrine");
        // setTextureName(Reference.MOD_ID + ":" + "gemCitrine");
        setCreativeTab(CreativeTabs.tabMisc);

    }

}



/*
public class ItemGemCitrine extends ItemGTFO
{
    public ItemGemCitrine()
    {
        super();
        this.setUnlocalizedName("gemCitrine");





    }




}
*/
