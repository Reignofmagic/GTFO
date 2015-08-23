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
	//                    0             1              2           3                4              5           6          7              8
	String[] names = {"gemTopaz", "gemMalachite", "gemAmber", "gemTanzanite", "gemPeridot", "gemSapphire", "gemRuby", "gemAmethyst", "gemJet"};
	
	IIcon[] icons = new IIcon[names.length];
	
	
	public ItemGemstones()
	{
		super();
		setUnlocalizedName(Reference.MODID);
		setCreativeTab(Gems.GTFOtab);
		setHasSubtypes(true);
	}	
	
	 @Override
	    public String getUnlocalizedName(ItemStack stack) 
	 {
		 return getUnlocalizedName() + "_" + names[stack.getItemDamage() % names.length];
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



	 
	@SuppressWarnings({"unchecked", "rawtypes"})
	@SideOnly(Side.CLIENT)
	@Override
				public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List par3List)
				{
			for (int var4 = 0; var4 < 9; ++var4)
			{
				par3List.add(new ItemStack(par1, 1, var4));
			}
				}
}


		














