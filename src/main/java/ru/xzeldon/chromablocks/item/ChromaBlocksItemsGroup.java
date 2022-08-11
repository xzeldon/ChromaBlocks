package ru.xzeldon.chromablocks.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import ru.xzeldon.chromablocks.ChromaBlocks;
import ru.xzeldon.chromablocks.block.ChromaBlocksBlockRegister;

public class ChromaBlocksItemsGroup {
    public static final ItemGroup GREENSCREEN = FabricItemGroupBuilder.build(new Identifier(ChromaBlocks.MOD_ID, "chroma_blocks"),
            ()-> new ItemStack(ChromaBlocksBlockRegister.CHROMA_GREEN));
}
