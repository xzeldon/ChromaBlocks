package ru.xzeldon.greenscreenmod.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class GreenScreenBlock extends Block {
    public GreenScreenBlock() {
        super(FabricBlockSettings.of(Material.METAL)
            .breakInstantly()
        );
    }

    @Override
    public float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
        return 1;
    }
}
