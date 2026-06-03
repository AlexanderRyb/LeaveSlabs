package net.acumenCascade.leaveslab;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class leaveslab implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("leave_slab");

    public static final Block AZALEA_LEAVES_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.AZALEA_LEAVES).nonOpaque().strength(0.05f).requiresTool().sounds(BlockSoundGroup.AZALEA_LEAVES));
    public static final Block FLOWERING_AZALEA_LEAVES_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.FLOWERING_AZALEA_LEAVES).nonOpaque().strength(0.05f).requiresTool().sounds(BlockSoundGroup.FLOWERING_AZALEA));
    public static final Block ACACIA_LEAVES_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LEAVES).nonOpaque().strength(0.05f).requiresTool().sounds(BlockSoundGroup.GRASS));
    public static final Block BIRCH_LEAVES_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LEAVES).nonOpaque().strength(0.05f).requiresTool().sounds(BlockSoundGroup.GRASS));
    public static final Block DARK_OAK_LEAVES_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LEAVES).nonOpaque().strength(0.05f).requiresTool().sounds(BlockSoundGroup.GRASS));
    public static final Block JUNGLE_LEAVES_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_LEAVES).nonOpaque().strength(0.05f).requiresTool().sounds(BlockSoundGroup.GRASS));
    public static final Block MANGROVE_LEAVES_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LEAVES).nonOpaque().strength(0.05f).requiresTool().sounds(BlockSoundGroup.GRASS));
    public static final Block OAK_LEAVES_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque().strength(0.05f).requiresTool().sounds(BlockSoundGroup.GRASS));
    public static final Block SPRUCE_LEAVES_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_LEAVES).nonOpaque().strength(0.05f).requiresTool().sounds(BlockSoundGroup.GRASS));
    public static final Block CHERRY_LEAVES_SLAB = new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES).nonOpaque().strength(0.05f).requiresTool().sounds(BlockSoundGroup.CHERRY_LEAVES));


    @Override
    public void onInitialize() {



ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
    entries.add(OAK_LEAVES_SLAB);
    entries.add(SPRUCE_LEAVES_SLAB);
    entries.add(BIRCH_LEAVES_SLAB);
    entries.add(JUNGLE_LEAVES_SLAB);
    entries.add(ACACIA_LEAVES_SLAB);
    entries.add(DARK_OAK_LEAVES_SLAB);
    entries.add(MANGROVE_LEAVES_SLAB);
    entries.add(CHERRY_LEAVES_SLAB);
    entries.add(AZALEA_LEAVES_SLAB);
    entries.add(FLOWERING_AZALEA_LEAVES_SLAB);
});
        Registry.register(Registries.BLOCK, new Identifier("leave_slab", "azalea_leaves_slab"), AZALEA_LEAVES_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("leave_slab", "flowering_azalea_leaves_slab"), FLOWERING_AZALEA_LEAVES_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("leave_slab", "acacia_leaves_slab"), ACACIA_LEAVES_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("leave_slab", "birch_leaves_slab"), BIRCH_LEAVES_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("leave_slab", "dark_oak_leaves_slab"), DARK_OAK_LEAVES_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("leave_slab", "jungle_leaves_slab"), JUNGLE_LEAVES_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("leave_slab", "mangrove_leaves_slab"), MANGROVE_LEAVES_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("leave_slab", "oak_leaves_slab"), OAK_LEAVES_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("leave_slab", "spruce_leaves_slab"), SPRUCE_LEAVES_SLAB);
        Registry.register(Registries.BLOCK, new Identifier("leave_slab", "cherry_leaves_slab"), CHERRY_LEAVES_SLAB);

        Registry.register(Registries.ITEM, new Identifier("leave_slab", "azalea_leaves_slab"), new BlockItem(AZALEA_LEAVES_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("leave_slab", "flowering_azalea_leaves_slab"), new BlockItem(FLOWERING_AZALEA_LEAVES_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("leave_slab", "acacia_leaves_slab"), new BlockItem(ACACIA_LEAVES_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("leave_slab", "birch_leaves_slab"), new BlockItem(BIRCH_LEAVES_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("leave_slab", "dark_oak_leaves_slab"), new BlockItem(DARK_OAK_LEAVES_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("leave_slab", "jungle_leaves_slab"), new BlockItem(JUNGLE_LEAVES_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("leave_slab", "mangrove_leaves_slab"), new BlockItem(MANGROVE_LEAVES_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("leave_slab", "oak_leaves_slab"), new BlockItem(OAK_LEAVES_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("leave_slab", "spruce_leaves_slab"), new BlockItem(SPRUCE_LEAVES_SLAB, new Item.Settings()));
        Registry.register(Registries.ITEM, new Identifier("leave_slab", "cherry_leaves_slab"), new BlockItem(CHERRY_LEAVES_SLAB, new Item.Settings()));


    }}
//
