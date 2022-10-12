package net.acumenCascade.leaveslab;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class leaveslabClient implements ClientModInitializer {




    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.FLOWERING_AZALEA_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.AZALEA_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.ACACIA_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.BIRCH_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.DARK_OAK_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.JUNGLE_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.MANGROVE_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.OAK_LEAVES_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(leaveslab.SPRUCE_LEAVES_SLAB, RenderLayer.getCutout());





    }
}
