package com.alexans.alloysandmore;

import net.fabricmc.api.ModInitializer;

import com.alexans.alloysandmore.block.ModBlocks;
import com.alexans.alloysandmore.item.ModItemGroups;
import com.alexans.alloysandmore.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AlloysAndMore implements ModInitializer {
	public static final String MOD_ID = "alloys_and_more";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}