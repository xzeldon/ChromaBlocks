package ru.xzeldon.chromablocks;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.xzeldon.chromablocks.block.ChromaBlocksBlockRegister;

public class ChromaBlocks implements ModInitializer {
	public static final String MOD_ID = "chromablocks";
	public static final Logger LOGGER = LoggerFactory.getLogger("chromablocks");

	@Override
	public void onInitialize() {
		ChromaBlocksBlockRegister.registerBlocks();
	}
}
