package com.reignofmagic.gems.blocks;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.helper.Reference;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;

public class GemLights extends BlockTorch {

	public GemLights() {
		super();
		setBlockName(Reference.MODID + "_torch_" + "basic");
		setCreativeTab(Gems.GTFOtab);
		this.setLightLevel(1F);
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}


}
