package ru.xzeldon.greenscreenmod.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.client.model.ModelProviderException;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import ru.xzeldon.greenscreenmod.GreenScreenMod;

@Environment(EnvType.CLIENT)
public class GreenScreenModelProvider implements ModelResourceProvider {
    public static final Identifier GREEN_SCREEN_MODEL = new Identifier("greenscreenmod:block/green_screen_block");
    public static final Identifier GREEN_SCREEN_MODEL_DIM = new Identifier("greenscreenmod:block/green_screen_block_dim");
    public static final Identifier GREEN_SCREEN_MODEL_ITEM = new Identifier("greenscreenmod:item/green_screen_block");
    public static final Identifier GREEN_SCREEN_MODEL_ITEM_DIM = new Identifier("greenscreenmod:item/green_screen_block_dim");


    @Override
    public @Nullable UnbakedModel loadModelResource(Identifier resourceId, ModelProviderContext context) throws ModelProviderException {
        if (
                resourceId.equals(GREEN_SCREEN_MODEL) ||
                resourceId.equals(GREEN_SCREEN_MODEL_ITEM) ||
                resourceId.equals(GREEN_SCREEN_MODEL_DIM) ||
                resourceId.equals(GREEN_SCREEN_MODEL_ITEM_DIM)
        ) {
            return new GreenScreenBlockModel();
        } else {
            return null;
        }
    }
}
