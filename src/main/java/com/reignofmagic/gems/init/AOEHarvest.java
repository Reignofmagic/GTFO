package com.reignofmagic.gems.init;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.reignofmagic.gems.items.ItemToolTest;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import net.minecraftforge.common.ForgeHooks;

public abstract class AOEHarvest extends ItemPickaxe {
	
	
	//For both the digging of dirt and Stone!
/*	@Override
	public Set<String> getToolClasses(ItemStack stack) {
		return ImmutableSet.of("pickaxe", "shovel");
	}

	@Override
	public int getHarvestLevel(ItemStack itemStack, String toolClass) {
		if ((toolClass.equals("shovel") || toolClass.equals("pickaxe"))) {
			return super.getHarvestLevel(itemStack, toolClass);
		} 
			else {
			return -1;
		}
	}*/
	
    public int breakRadius;
    public int breakDepth;

    public AOEHarvest(ToolMaterial material, int breakRadius, int breakDepth) {
        super(material);

        this.breakRadius = breakRadius;
        this.breakDepth = breakDepth;
    }

    public static MovingObjectPosition raytraceFromEntity (World world, Entity player, boolean par3, double range)
    {
        float f = 1.0F;
        float f1 = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * f;
        float f2 = player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw) * f;
        double d0 = player.prevPosX + (player.posX - player.prevPosX) * (double) f;
        double d1 = player.prevPosY + (player.posY - player.prevPosY) * (double) f;
        if (!world.isRemote && player instanceof EntityPlayer)
            d1 += 1.62D;
        double d2 = player.prevPosZ + (player.posZ - player.prevPosZ) * (double) f;
        Vec3 vec3 = Vec3.createVectorHelper(d0, d1, d2);
        float f3 = MathHelper.cos(-f2 * 0.017453292F - (float) Math.PI);
        float f4 = MathHelper.sin(-f2 * 0.017453292F - (float) Math.PI);
        float f5 = -MathHelper.cos(-f1 * 0.017453292F);
        float f6 = MathHelper.sin(-f1 * 0.017453292F);
        float f7 = f4 * f5;
        float f8 = f3 * f5;
        double d3 = range;
        if (player instanceof EntityPlayerMP)
        {
            d3 = ((EntityPlayerMP) player).theItemInWorldManager.getBlockReachDistance();
        }
        Vec3 vec31 = vec3.addVector((double) f7 * d3, (double) f6 * d3, (double) f8 * d3);
        return world.func_147447_a(vec3, vec31, par3, !par3, par3);
    }

    public boolean onBlockStartBreak(ItemStack stack, int x, int y, int z, EntityPlayer player) {
        // only effective materials matter. We don't want to aoe when beraking dirt with a hammer.
        net.minecraft.block.Block block = player.worldObj.getBlock(x,y,z);
        int meta = player.worldObj.getBlockMetadata(x,y,z);
        if(block == null )
            return super.onBlockStartBreak(stack, x,y,z, player);

        MovingObjectPosition mop = raytraceFromEntity(player.worldObj, player, false, 4.5d);
        if(mop == null)
            return super.onBlockStartBreak(stack, x,y,z, player);
        int sideHit = mop.sideHit;
        //int sideHit = Minecraft.getMinecraft().objectMouseOver.sideHit;

        // we successfully destroyed a block. time to do AOE!
        int xRange = breakRadius;
        int yRange = breakRadius;
        int zRange = breakDepth;
        switch (sideHit) {
            case 0:
            case 1:
                yRange = breakDepth;
                zRange = breakRadius;
                break;
            case 2:
            case 3:
                xRange = breakRadius;
                zRange = breakDepth;
                break;
            case 4:
            case 5:
                xRange = breakDepth;
                zRange = breakRadius;
                break;
        }

        for (int xPos = x - xRange; xPos <= x + xRange; xPos++)
            for (int yPos = y - yRange; yPos <= y + yRange; yPos++)
                for (int zPos = z - zRange; zPos <= z + zRange; zPos++) {
                    // don't break the originally already broken block, duh
                    if (xPos == x && yPos == y && zPos == z)
                        continue;

                    if(!super.onBlockStartBreak(stack, xPos, yPos, zPos, player))
                        breakExtraBlock(player.worldObj, xPos, yPos, zPos, sideHit, player, x,y,z);
                }


        return super.onBlockStartBreak(stack, x, y, z, player);
    }
    protected void breakExtraBlock(World world, int x, int y, int z, int sidehit, EntityPlayer playerEntity, int refX, int refY, int refZ) {
        // prevent calling that stuff for air blocks, could lead to unexpected behaviour since it fires events
        if (world.isAirBlock(x, y, z))
            return;

        // what?
        if(!(playerEntity instanceof EntityPlayerMP))
            return;
        EntityPlayerMP player = (EntityPlayerMP) playerEntity;

        // check if the block can be broken, since extra block breaks shouldn't instantly break stuff like obsidian
        // or precious ores you can't harvest while mining stone
        net.minecraft.block.Block block = world.getBlock(x, y, z);
        int meta = world.getBlockMetadata(x, y, z);

        // only effective materials
 

        Block refBlock = world.getBlock(refX, refY, refZ);
        float refStrength = ForgeHooks.blockStrength(refBlock, player, world, refX, refY, refZ);
        float strength = ForgeHooks.blockStrength(block, player, world, x,y,z);
}
  

}
