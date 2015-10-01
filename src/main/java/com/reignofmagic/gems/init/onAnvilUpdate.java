package com.reignofmagic.gems.init;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.AnvilUpdateEvent;


// HUGE thanks to lfja, Hlaaftana and OreCruncher of the FTB Forums for help with this.
// Many Many thanks to OreCruncher for providing his code as a source for me to work with, and pretty much just copy over to here
// With a few Minor changes here and there. 


public final class onAnvilUpdate {

	public static int getItemDamage(final ItemStack stack) {
		assert stack != null;
		return Items.diamond.getDamage(stack);}
	
	public static boolean isRepairable(final ItemStack stack) {
		final Item item = stack.getItem();
		return item != null ? item.isRepairable() : false;
	}
	public static void setItemName(final ItemStack stack, final String name) {
		if (stack != null)
			stack.setStackDisplayName(name);
	}
	
	private static final int RENAME_COST = 5;
	private static final int[] EXPERIENCE_COST = { 20 };
	private static final int[] REPAIR_AMOUNT_ = { 9110 };


	private boolean isValidRepairItem(final ItemStack stack) {

		if (stack != null) {
			return stack.getItem() == ModItems.gemPutty;
		}

		return false;
	}
	
	private boolean canBeRepaired(final ItemStack stack) {
		return isRepairable(stack) && stack.isItemDamaged();
	}

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = false)
	public void onAnvilChange(final AnvilUpdateEvent event) {

		final ItemStack itemToRepair = event.left;
		final ItemStack repairMaterial = event.right;

		if (itemToRepair == null || repairMaterial == null || !isValidRepairItem(repairMaterial))
			return;

		// Make a copy of the item and figure out any rename
		// cost. Items can be renamed even if they are not
		// normally repaired in an anvil.
		event.output = itemToRepair.copy();
		if (!event.name.isEmpty()) {
			event.cost = RENAME_COST;
			event.materialCost = 1;
			setItemName(event.output, event.name);
			
		}

		// Figure out a repair cost if the item is damaged
		if (canBeRepaired(itemToRepair)) {

			int repairAmount = 0;

			if (repairMaterial.getItem() == ModItems.gemPutty)
				repairAmount = 9110;
			else
				repairAmount = 9110;

			// Figure out the quantity needed to fully repair the item
			final int itemDamage = getItemDamage(itemToRepair);
			int howManyUnits = itemDamage / repairAmount;
			if (itemDamage % repairAmount != 0)
				howManyUnits++;

			// Cap it
			howManyUnits = Math.min(howManyUnits, repairMaterial.stackSize);
			final int damageRepaired = Math.min(itemDamage, howManyUnits * repairAmount);

			event.cost += EXPERIENCE_COST[getItemDamage(repairMaterial)];
			event.materialCost += howManyUnits;
			event.output.setItemDamage(getItemDamage(event.output) - damageRepaired);
		}
	}

	public onAnvilUpdate() {
	}

	public static void register() {
		MinecraftForge.EVENT_BUS.register(new onAnvilUpdate());
	}
}