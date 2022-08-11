package ru.xzeldon.chromablocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import ru.xzeldon.chromablocks.model.ChromaBlockModelProvider;

public class ChromaBlocksClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelLoadingRegistry.INSTANCE.registerResourceProvider(rm -> new ChromaBlockModelProvider());
    }
}
