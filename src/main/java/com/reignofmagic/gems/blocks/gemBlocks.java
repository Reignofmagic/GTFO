package com.reignofmagic.gems.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class GemBlocks extends Block {

	String name = "allGemBlocks";

	Random random = new Random();
	@SideOnly(Side.CLIENT)
	public IIcon[] icons = new IIcon[9];

	public GemBlocks() {
		super(Material.rock);
		setBlockName(Reference.MODID + ".block");
		setStepSound(soundTypeStone);
		setHardness(6F);
		setResistance(7F);
		setCreativeTab(Gems.GTFOtab);
		setHarvestLevel("pickaxe", 2);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {

		this.icons[0] = iconRegister.registerIcon(Reference.MODID + ":" + "blockTopaz");
		this.icons[1] = iconRegister.registerIcon(Reference.MODID + ":" + "blockMalachite");
		this.icons[2] = iconRegister.registerIcon(Reference.MODID + ":" + "blockAmber");
		this.icons[3] = iconRegister.registerIcon(Reference.MODID + ":" + "blockTanzanite");
		this.icons[4] = iconRegister.registerIcon(Reference.MODID + ":" + "blockPeridot");
		this.icons[5] = iconRegister.registerIcon(Reference.MODID + ":" + "blockSapphire");
		this.icons[6] = iconRegister.registerIcon(Reference.MODID + ":" + "blockRuby");
		this.icons[7] = iconRegister.registerIcon(Reference.MODID + ":" + "blockAmethyst");
		this.icons[8] = iconRegister.registerIcon(Reference.MODID + ":" + "blockJet");

	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return this.icons[meta];
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int var4 = 0; var4 < 9; ++var4) {
			par3List.add(new ItemStack(par1, 1, var4));
		}
	}


	public int quantityDroppedWithBonus(int fortune, Random random) {
		if (fortune > 0) {
			int bonus = random.nextInt(fortune + 4) - 1;

			if (bonus < 0)
				bonus = 0;

			return quantityDropped(random) * (bonus + 1);
		} else {
			return 1;
		}
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> ret = new ArrayList<ItemStack>();

		int count = quantityDropped(metadata, fortune, world.rand);
		for (int i = 0; i < count; i++) {
			Item item = getItemDropped(metadata, world.rand, fortune);

			if (item != null)

				ret.add(new ItemStack(item, 1, damageDropped(metadata)));
		}

		return ret;
	}

	@Override
	public int damageDropped(int meta) {
	    return meta;
	}
	
	/*@Override public Item getItemDropped(int metadata, Random rand, int fortune)
	{
		return ModItems.Gemstones;
	}*/

}