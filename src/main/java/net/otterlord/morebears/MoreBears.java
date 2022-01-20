package net.otterlord.morebears;

import net.fabricmc.api.ModInitializer;
import net.otterlord.morebears.block.ModBlocks;
import net.otterlord.morebears.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MoreBears implements ModInitializer {
	public static final String MOD_ID = "morebears";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
