package com.reignofmagic.gems.items;

import java.util.List;
import java.util.Random;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.helper.RegisterHelper;
import com.reignofmagic.gems.items.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

public class ItemGemstones extends Item{
	
	String[] names = {"gemTopaz", "gemMalachite", "gemAmber", "gemTanzanite"};
	
	IIcon[] icons = new IIcon[names.length];
	
	
	public ItemGemstones()
	{
		super();
		
		//defaults to this if i remove lines 49-58, which is not helpful due to using 1 texture for 3 different gems
		setTextureName(Reference.MODID + ":" + "gem");
		
		setUnlocalizedName(Reference.MODID);
		
		setCreativeTab(Gems.GTFOtab);
		
		setHasSubtypes(true);
	}	
	
	 @Override
	    public String getUnlocalizedName(ItemStack stack) 
	 {
		 return getUnlocalizedName() + "." + names[stack.getItemDamage() % names.length];
	    }
	 @Override
	    public int getMetadata(int meta) {
	        return meta;
	 }
	 
	 
	 //Texture Override
	 @SideOnly(Side.CLIENT)
	    public IIcon getIconFromDamage(int meta) {
	        return icons[meta];
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerIcons(IIconRegister register) {
	        for (int i = 0; i < names.length; i++)
	            icons[i] = register.registerIcon(Reference.MODID + ":" + "gem" + i);
	    }


	/* @SideOnly(Side.CLIENT)
	 
	 //Is not pulling the correct texture, unless I have named it incorrectly
		public void registerIcons(IIconRegister iconRegister){
		    this.icons[0] = iconRegister.registerIcon(Reference.MODID + ":" + "gemMalachite");
	        this.icons[1] = iconRegister.registerIcon(Reference.MODID + ":" + "gemAmber");
	        this.icons[2] = iconRegister.registerIcon(Reference.MODID + ":" + "gemTanzanite");
			}
	 */
	 
	@SuppressWarnings({"unchecked", "rawtypes"})
	@SideOnly(Side.CLIENT)
	@Override
				public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List)
				{
			for (int var4 = 0; var4 < 4; ++var4)
			{
				par3List.add(new ItemStack(par1, 1, var4));
			}
				}
}


		

	/*
		 @Override
		 public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
		    {
		        return BlocksItems.Mineral;
		    }
			
			public int damageDropped(int par1, Random par2Random, int par3){

				return 0;
			}

}
*/

















/*package com.reignofmagic.gems.items;

import java.util.List;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.handler.GTFOtab;
import com.reignofmagic.gems.helper.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PreDiamondGemstones extends Item{
	String[] gem = {"Malachite", "Amber", "Tanzanite"};

    public PreDiamondGemstones() {
        super();

        setUnlocalizedName(Reference.MODID + ".gem");
        setTextureName(Reference.MODID + ":" + "gem");
        setCreativeTab(Gems.GTFOtab);
        setHasSubtypes(true);
    }

    @Override
    public String getUnlocalizedName(ItemStack stack) {
        return getUnlocalizedName() + "." + gem[stack.getItemDamage() % gem.length];
    }
   
    @SuppressWarnings("unchecked")
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs tabs, List list) {
        for (int i = 0; i < gem.length; i++)
            list.add(new ItemStack(this, 1, i));
    }
  
	@SuppressWarnings({"unchecked", "rawtypes"})
	@SideOnly(Side.CLIENT)
	@Override
			public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List)
			{
		for (int var4 = 0; var4 < 3; ++var4)
		{
			par3List.add(new ItemStack(par1, 1, var4));
		}
			}
}


*/