package com.reignofmagic.gems.items;

import com.reignofmagic.gems.Gems;
import com.reignofmagic.gems.init.AOEHarvestDual;

import net.minecraft.item.Item.ToolMaterial;

public class ItemToolTest extends AOEHarvestDual {

	public ItemToolTest(ToolMaterial material) {
		super(material, 1, 0);
		setCreativeTab(Gems.GTFOtab);
		/*this.setHarvestLevel("pickaxe", 10);
		this.setHarvestLevel("Shovel", 10);*/


	}
	

	
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
	

}
