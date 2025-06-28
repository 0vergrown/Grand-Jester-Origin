package dev.overgrown.grand_jester;

import dev.overgrown.grand_jester.item.ModItems;
import net.minecraft.util.Identifier;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrandJester implements ModInitializer {
	public static final String MOD_ID = "grand_jester";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Helper method to create identifiers using MOD_ID as namespace
	public static Identifier identifier(String path) {
		return new Identifier(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		LOGGER.info("Grand Jester mod initialized!");
	}
}