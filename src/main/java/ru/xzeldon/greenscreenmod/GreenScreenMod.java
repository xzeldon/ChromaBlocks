package ru.xzeldon.greenscreenmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.xzeldon.greenscreenmod.block.ModBlocks;

public class GreenScreenMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "greenscreenmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("greenscreenmod");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}
