package ru.xzeldon.chromablocks.model;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.client.model.ModelProviderException;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import ru.xzeldon.chromablocks.ChromaBlocks;
import ru.xzeldon.chromablocks.model.custom.*;

@Environment(EnvType.CLIENT)
public class ChromaBlockModelProvider implements ModelResourceProvider {
    public static final Identifier CHROMA_MODEL_GREEN = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_green");
    public static final Identifier CHROMA_MODEL_GREEN_DIM = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_green_dim");
    public static final Identifier CHROMA_MODEL_GREEN_ITEM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_green");
    public static final Identifier CHROMA_MODEL_GREEN_ITEM_DIM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_green_dim");

    public static final Identifier CHROMA_MODEL_BLACK = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_black");
    public static final Identifier CHROMA_MODEL_BLACK_DIM = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_black_dim");
    public static final Identifier CHROMA_MODEL_BLACK_ITEM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_black");
    public static final Identifier CHROMA_MODEL_BLACK_ITEM_DIM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_black_dim");

    public static final Identifier CHROMA_MODEL_BLUE = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_blue");
    public static final Identifier CHROMA_MODEL_BLUE_DIM = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_blue_dim");
    public static final Identifier CHROMA_MODEL_BLUE_ITEM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_blue");
    public static final Identifier CHROMA_MODEL_BLUE_ITEM_DIM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_blue_dim");

    public static final Identifier CHROMA_MODEL_CYAN = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_cyan");
    public static final Identifier CHROMA_MODEL_CYAN_DIM = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_cyan_dim");
    public static final Identifier CHROMA_MODEL_CYAN_ITEM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_cyan");
    public static final Identifier CHROMA_MODEL_CYAN_ITEM_DIM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_cyan_dim");

    public static final Identifier CHROMA_MODEL_PURPLE = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_purple");
    public static final Identifier CHROMA_MODEL_PURPLE_DIM = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_purple_dim");
    public static final Identifier CHROMA_MODEL_PURPLE_ITEM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_purple");
    public static final Identifier CHROMA_MODEL_PURPLE_ITEM_DIM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_purple_dim");

    public static final Identifier CHROMA_MODEL_RED = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_red");
    public static final Identifier CHROMA_MODEL_RED_DIM = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_red_dim");
    public static final Identifier CHROMA_MODEL_RED_ITEM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_red");
    public static final Identifier CHROMA_MODEL_RED_ITEM_DIM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_red_dim");

    public static final Identifier CHROMA_MODEL_WHITE = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_white");
    public static final Identifier CHROMA_MODEL_WHITE_DIM = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_white_dim");
    public static final Identifier CHROMA_MODEL_WHITE_ITEM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_white");
    public static final Identifier CHROMA_MODEL_WHITE_ITEM_DIM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_white_dim");

    public static final Identifier CHROMA_MODEL_YELLOW = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_yellow");
    public static final Identifier CHROMA_MODEL_YELLOW_DIM = new Identifier(ChromaBlocks.MOD_ID + ":block/chroma_yellow_dim");
    public static final Identifier CHROMA_MODEL_YELLOW_ITEM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_yellow");
    public static final Identifier CHROMA_MODEL_YELLOW_ITEM_DIM = new Identifier(ChromaBlocks.MOD_ID + ":item/chroma_yellow_dim");


    @Override
    public @Nullable UnbakedModel loadModelResource(Identifier resourceId, ModelProviderContext context) throws ModelProviderException {
        if (
                resourceId.equals(CHROMA_MODEL_GREEN) ||
                resourceId.equals(CHROMA_MODEL_GREEN_DIM) ||
                resourceId.equals(CHROMA_MODEL_GREEN_ITEM) ||
                resourceId.equals(CHROMA_MODEL_GREEN_ITEM_DIM)
        ) {
            return new GreenChromaBlockModel();
        } else if (
                resourceId.equals(CHROMA_MODEL_BLACK) ||
                resourceId.equals(CHROMA_MODEL_BLACK_DIM) ||
                resourceId.equals(CHROMA_MODEL_BLACK_ITEM) ||
                resourceId.equals(CHROMA_MODEL_BLACK_ITEM_DIM)
        ) {
            return new BlackChromaBlockModel();
        } else if (
                resourceId.equals(CHROMA_MODEL_BLUE) ||
                resourceId.equals(CHROMA_MODEL_BLUE_DIM) ||
                resourceId.equals(CHROMA_MODEL_BLUE_ITEM) ||
                resourceId.equals(CHROMA_MODEL_BLUE_ITEM_DIM)
        ) {
            return new BlueChromaBlockModel();
        } else if (
                resourceId.equals(CHROMA_MODEL_CYAN) ||
                resourceId.equals(CHROMA_MODEL_CYAN_DIM) ||
                resourceId.equals(CHROMA_MODEL_CYAN_ITEM) ||
                resourceId.equals(CHROMA_MODEL_CYAN_ITEM_DIM)
        ) {
            return new CyanChromaBlockModel();
        } else if (
                resourceId.equals(CHROMA_MODEL_PURPLE) ||
                resourceId.equals(CHROMA_MODEL_PURPLE_DIM) ||
                resourceId.equals(CHROMA_MODEL_PURPLE_ITEM) ||
                resourceId.equals(CHROMA_MODEL_PURPLE_ITEM_DIM)
        ) {
            return new PurpleChromaBlockModel();
        } else if (
                resourceId.equals(CHROMA_MODEL_RED) ||
                resourceId.equals(CHROMA_MODEL_RED_DIM) ||
                resourceId.equals(CHROMA_MODEL_RED_ITEM) ||
                resourceId.equals(CHROMA_MODEL_RED_ITEM_DIM)
        ) {
            return new RedChromaBlockModel();
        } else if (
                resourceId.equals(CHROMA_MODEL_WHITE) ||
                resourceId.equals(CHROMA_MODEL_WHITE_DIM) ||
                resourceId.equals(CHROMA_MODEL_WHITE_ITEM) ||
                resourceId.equals(CHROMA_MODEL_WHITE_ITEM_DIM)
        ) {
            return new WhiteChromaBlockModel();
        } else if (
                resourceId.equals(CHROMA_MODEL_YELLOW) ||
                resourceId.equals(CHROMA_MODEL_YELLOW_DIM) ||
                resourceId.equals(CHROMA_MODEL_YELLOW_ITEM) ||
                resourceId.equals(CHROMA_MODEL_YELLOW_ITEM_DIM)
        ) {
            return new YellowChromaBlockModel();
        } else {
            return null;
        }
    }
}
