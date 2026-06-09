package net.acumenCascade.leaveslab;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.world.biome.FoliageColors;

public class leaveslabClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.AZALEA_LEAVES_SLAB, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.FLOWERING_AZALEA_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.ACACIA_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.BIRCH_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.DARK_OAK_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.JUNGLE_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.MANGROVE_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.OAK_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.SPRUCE_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.CHERRY_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.FLOWERING_AZALEA_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.PALE_OAK_LEAVES_SLAB, RenderLayer.getCutout());


ColorProviderRegistry.BLOCK.register(
    (state, world, pos, tintIndex) -> world != null && pos != null 
        ? BiomeColors.getFoliageColor(world, pos) 
        : FoliageColors.getColor(0.5, 1.0),
    leaveslab.OAK_LEAVES_SLAB,
    leaveslab.ACACIA_LEAVES_SLAB,
    leaveslab.JUNGLE_LEAVES_SLAB,
    leaveslab.DARK_OAK_LEAVES_SLAB,
    leaveslab.MANGROVE_LEAVES_SLAB,
    leaveslab.BIRCH_LEAVES_SLAB,
    leaveslab.SPRUCE_LEAVES_SLAB

);
    
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> 0xFFB7C4, leaveslab.CHERRY_LEAVES_SLAB);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> BiomeColors.getFoliageColor(world, pos),
                leaveslab.ACACIA_LEAVES_SLAB,
                leaveslab.OAK_LEAVES_SLAB,
                leaveslab.DARK_OAK_LEAVES_SLAB,
                leaveslab.JUNGLE_LEAVES_SLAB,
                leaveslab.MANGROVE_LEAVES_SLAB);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> 8431445, leaveslab.BIRCH_LEAVES_SLAB);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> 6396257, leaveslab.SPRUCE_LEAVES_SLAB);


    }
}
