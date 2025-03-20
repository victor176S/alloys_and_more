package com.alexans.alloysandmore;

import net.fabricmc.api.ModInitializer;

//hola

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//adios
//mipae

public class AlloysAndMore implements ModInitializer {
	public static final String MOD_ID = "alloys_and_more";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}