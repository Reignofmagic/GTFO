package com.reignofmagic.gems.blocks;

import java.util.List;
import java.util.Random;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
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

public class gemPreDiamond extends Block{
	
	String name = "LowGem";
	
	@SideOnly(Side.CLIENT)
	public IIcon[] icons = new IIcon[3];
	
	
	public gemPreDiamond()
	{
		super(Material.rock);
		setBlockName(Reference.MODID + ".ore");
		setStepSound(soundTypeStone);
		setHardness(4F);
		setResistance(5F);
		setCreativeTab(Gems.GTFOtab);
		setHarvestLevel("pickaxe", 2);
	}	
	
	@Override
	@SideOnly(Side.CLIENT)
	  public void registerBlockIcons(IIconRegister iconRegister) {
	
		
        this.icons[0] = iconRegister.registerIcon(Reference.MODID + ":" + "oreMalachite");
        this.icons[1] = iconRegister.registerIcon(Reference.MODID + ":" + "oreAmber");
        this.icons[2] = iconRegister.registerIcon(Reference.MODID + ":" + "oreTanzanite");
        
	}
	@Override
    @SideOnly(Side.CLIENT)
    	public IIcon getIcon(int side, int meta) {
        return this.icons[meta];
    }
		
		
		@SuppressWarnings({"unchecked", "rawtypes"})
		@SideOnly(Side.CLIENT)
		@Override
				public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List)
				{
			for (int var4 = 0; var4 < 3; ++var4)
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