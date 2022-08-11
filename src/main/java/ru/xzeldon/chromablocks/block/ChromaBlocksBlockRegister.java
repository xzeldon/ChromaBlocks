package ru.xzeldon.chromablocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.xzeldon.chromablocks.ChromaBlocks;
import ru.xzeldon.chromablocks.item.ChromaBlocksItemsGroup;

public class ChromaBlocksBlockRegister {
    public static final Block CHROMA_GREEN = registerBlock("chroma_green",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
                    .luminance(15)
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_GREEN_DIM = registerBlock("chroma_green_dim",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_BLACK = registerBlock("chroma_black",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
                    .luminance(15)
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_BLACK_DIM = registerBlock("chroma_black_dim",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_BLUE = registerBlock("chroma_blue",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
                    .luminance(15)
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_BLUE_DIM = registerBlock("chroma_blue_dim",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_CYAN = registerBlock("chroma_cyan",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
                    .luminance(15)
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_CYAN_DIM = registerBlock("chroma_cyan_dim",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_PURPLE = registerBlock("chroma_purple",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
                    .luminance(15)
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_PURPLE_DIM = registerBlock("chroma_purple_dim",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_RED = registerBlock("chroma_red",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
                    .luminance(15)
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_RED_DIM = registerBlock("chroma_red_dim",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_WHITE = registerBlock("chroma_white",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
                    .luminance(15)
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_WHITE_DIM = registerBlock("chroma_white_dim",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_YELLOW = registerBlock("chroma_yellow",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
                    .luminance(15)
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    public static final Block CHROMA_YELLOW_DIM = registerBlock("chroma_yellow_dim",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .breakInstantly()
            ), ChromaBlocksItemsGroup.GREENSCREEN);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ChromaBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ChromaBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerBlocks() {
        ChromaBlocks.LOGGER.info("Registering ModBlocks for " + ChromaBlocks.MOD_ID);
    }
}
