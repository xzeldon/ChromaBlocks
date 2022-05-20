package ru.xzeldon.greenscreenmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import ru.xzeldon.greenscreenmod.GreenScreenMod;
import net.minecraft.block.AbstractGlassBlock;

public class ModBlocks {
    public static final Block GREEN_SCREEN_BLOCK = registerBlock("green_screen_block", new GreenScreenBlock(), ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(GreenScreenMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(GreenScreenMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        GreenScreenMod.LOGGER.info("Registering ModBlocks for " + GreenScreenMod.MOD_ID);
    }
}
