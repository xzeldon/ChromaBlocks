package ru.xzeldon.greenscreenmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.xzeldon.greenscreenmod.block.GreenScreenBlocks;

public class GreenScreenMod implements ModInitializer {
	public static final String MOD_ID = "greenscreenmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("greenscreenmod");

	@Override
	public void onInitialize() {
		GreenScreenBlocks.registerBlocks();
	}
}
