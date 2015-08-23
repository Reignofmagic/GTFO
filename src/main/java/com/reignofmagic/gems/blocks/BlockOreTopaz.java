package com.reignofmagic.gems.blocks;

import java.util.ArrayList;
import java.util.Random;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;
import com.reignofmagic.gems.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockOreTopaz extends Block{
	Random random = new Random();
	public BlockOreTopaz()
	{
		super(Material.rock);
		setBlockName(Reference.MODID + "_" + "oreTopaz");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(Gems.GTFOtab);
		setStepSound(soundTypeStone);
		setHardness(2.5F);
		setResistance(5F);
		setHarvestLevel("pickaxe", 1);
		
	}
	@Override
    public int getExpDrop(IBlockAccess world, int meta, int fortune) {
        return MathHelper.getRandomIntegerInRange(random, 5, 10);
    }
 
 @Override
 public Item getItemDropped(int damage, Random random, int fortune) {
        return ModItems.Gemstones;
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
}

