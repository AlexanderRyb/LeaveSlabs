package net.acumenCascade.leaveslab;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class leaveslab implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("leave_slab");

    public static final Block AZALEA_LEAVES_SLAB = new SlabBlock(FabricBlockSettings.of(Material.METAL).nonOpaque().strength(0.05f).requiresTool().sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_LEAVES_SLAB = new SlabBlock(FabricBlockSettings.of(Material.LEAVES).strength(0.05f).requiresTool().nonOpaque().sounds(BlockSoundGroup.FLOWERING_AZALEA));
    public static final Block ACACIA_LEAVES_SLAB = new SlabBlock(FabricBlockSettings.of(Material.LEAVES).strength(0.05f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GRASS));
    public static final Block BIRCH_LEAVES_SLAB = new SlabBlock(FabricBlockSettings.of(Material.LEAVES).strength(0.05f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GRASS));
    public static final Block DARK_OAK_LEAVES_SLAB = new SlabBlock(FabricBlockSettings.of(Material.LEAVES).strength(0.05f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GRASS));
    public static final Block JUNGLE_LEAVES_SLAB = new SlabBlock(FabricBlockSettings.of(Material.LEAVES).strength(0.05f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GRASS));
    public static final Block MANGROVE_LEAVES_SLAB = new SlabBlock(FabricBlockSettings.of(Material.LEAVES).strength(0.05f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GRASS));
    public static final Block OAK_LEAVES_SLAB = new SlabBlock(FabricBlockSettings.of(Material.LEAVES).strength(0.05f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GRASS));
    public static final Block SPRUCE_LEAVES_SLAB = new SlabBlock(FabricBlockSettings.of(Material.LEAVES).strength(0.05f).requiresTool().nonOpaque().sounds(BlockSoundGroup.GRASS));


    @Override
    public void onInitialize() {




        Registry.register(Registry.BLOCK, new Identifier("leave_slab", "azalea_leaves_slab"), AZALEA_LEAVES_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("leave_slab", "flowering_azalea_leaves_slab"), FLOWERING_AZALEA_LEAVES_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("leave_slab", "acacia_leaves_slab"), ACACIA_LEAVES_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("leave_slab", "birch_leaves_slab"), BIRCH_LEAVES_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("leave_slab", "dark_oak_leaves_slab"), DARK_OAK_LEAVES_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("leave_slab", "jungle_leaves_slab"), JUNGLE_LEAVES_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("leave_slab", "mangrove_leaves_slab"), MANGROVE_LEAVES_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("leave_slab", "oak_leaves_slab"), OAK_LEAVES_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("leave_slab", "spruce_leaves_slab"), SPRUCE_LEAVES_SLAB);

        Registry.register(Registry.ITEM, new Identifier("leave_slab", "azalea_leaves_slab"), new BlockItem(AZALEA_LEAVES_SLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("leave_slab", "flowering_azalea_leaves_slab"), new BlockItem(FLOWERING_AZALEA_LEAVES_SLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("leave_slab", "acacia_leaves_slab"), new BlockItem(ACACIA_LEAVES_SLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("leave_slab", "birch_leaves_slab"), new BlockItem(BIRCH_LEAVES_SLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("leave_slab", "dark_oak_leaves_slab"), new BlockItem(DARK_OAK_LEAVES_SLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("leave_slab", "jungle_leaves_slab"), new BlockItem(JUNGLE_LEAVES_SLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("leave_slab", "mangrove_leaves_slab"), new BlockItem(MANGROVE_LEAVES_SLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("leave_slab", "oak_leaves_slab"), new BlockItem(OAK_LEAVES_SLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("leave_slab", "spruce_leaves_slab"), new BlockItem(SPRUCE_LEAVES_SLAB, new FabricItemSettings().group(ItemGroup.DECORATIONS)));


        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 4764952, ACACIA_LEAVES_SLAB);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 8431445, BIRCH_LEAVES_SLAB);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 4764952, DARK_OAK_LEAVES_SLAB);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 4764952, JUNGLE_LEAVES_SLAB);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 4764952, MANGROVE_LEAVES_SLAB);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 4764952,OAK_LEAVES_SLAB);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 6396257, SPRUCE_LEAVES_SLAB);




        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            return BiomeColors.getFoliageColor(world, pos);
        }, leaveslab.OAK_LEAVES_SLAB);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            return BiomeColors.getFoliageColor(world, pos);

        }, leaveslab.DARK_OAK_LEAVES_SLAB);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            return 6396257;
        }, leaveslab.SPRUCE_LEAVES_SLAB);

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            return  BiomeColors.getFoliageColor(world, pos);

        }, leaveslab.MANGROVE_LEAVES_SLAB);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            return  BiomeColors.getFoliageColor(world, pos);
        }, leaveslab.JUNGLE_LEAVES_SLAB);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            return BiomeColors.getFoliageColor(world, pos);
        }, leaveslab.JUNGLE_LEAVES_SLAB);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            return  8431445;

        }, leaveslab.BIRCH_LEAVES_SLAB);
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            return BiomeColors.getFoliageColor(world, pos);
        }, leaveslab.ACACIA_LEAVES_SLAB);




    }}
//
