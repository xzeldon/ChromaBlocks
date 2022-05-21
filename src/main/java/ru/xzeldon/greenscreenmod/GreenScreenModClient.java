package ru.xzeldon.greenscreenmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.ModelLoadingRegistry;
import ru.xzeldon.greenscreenmod.model.GreenScreenModelProvider;

public class GreenScreenModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelLoadingRegistry.INSTANCE.registerResourceProvider(rm -> new GreenScreenModelProvider());
    }
}
