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
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;

public class leaveslab implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("leave_slab");
    public static final Block AZALEA_LEAVES_SLAB = Registry.register(Registries.BLOCK,Identifier.of("leave_slab", "azalea_leaves_slab"),new SlabBlock(AbstractBlock.Settings.copy(Blocks.AZALEA_LEAVES).nonOpaque().sounds(BlockSoundGroup.AZALEA_LEAVES).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("leave_slab", "azalea_leaves_slab")))));
    public static final Block FLOWERING_AZALEA_LEAVES_SLAB = Registry.register(Registries.BLOCK,Identifier.of("leave_slab", "flowering_azalea_leaves_slab"),new SlabBlock(AbstractBlock.Settings.copy(Blocks.FLOWERING_AZALEA_LEAVES).nonOpaque().strength(0.2f).sounds(BlockSoundGroup.AZALEA_LEAVES).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("leave_slab", "flowering_azalea_leaves_slab")))));
    public static final Block ACACIA_LEAVES_SLAB = Registry.register(Registries.BLOCK,Identifier.of("leave_slab", "acacia_leaves_slab"),new SlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LEAVES).nonOpaque().strength(0.2f).sounds(BlockSoundGroup.AZALEA_LEAVES).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("leave_slab", "acacia_leaves_slab")))));
    public static final Block BIRCH_LEAVES_SLAB = Registry.register(Registries.BLOCK,Identifier.of("leave_slab", "birch_leaves_slab"),new SlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LEAVES).nonOpaque().strength(0.2f).sounds(BlockSoundGroup.AZALEA_LEAVES).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("leave_slab", "birch_leaves_slab")))));
    public static final Block DARK_OAK_LEAVES_SLAB = Registry.register(Registries.BLOCK,Identifier.of("leave_slab", "dark_oak_leaves_slab"),new SlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LEAVES).nonOpaque().strength(0.2f).sounds(BlockSoundGroup.AZALEA_LEAVES).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("leave_slab", "dark_oak_leaves_slab")))));
    public static final Block JUNGLE_LEAVES_SLAB = Registry.register(Registries.BLOCK,Identifier.of("leave_slab", "jungle_leaves_slab"),new SlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_LEAVES).nonOpaque().strength(0.2f).sounds(BlockSoundGroup.AZALEA_LEAVES).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("leave_slab", "jungle_leaves_slab")))));
    public static final Block MANGROVE_LEAVES_SLAB = Registry.register(Registries.BLOCK,Identifier.of("leave_slab", "mangrove_leaves_slab"),new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LEAVES).nonOpaque().strength(0.2f).sounds(BlockSoundGroup.AZALEA_LEAVES).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("leave_slab", "mangrove_leaves_slab")))));
    public static final Block OAK_LEAVES_SLAB = Registry.register(Registries.BLOCK,Identifier.of("leave_slab", "oak_leaves_slab"),new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).nonOpaque().strength(0.2f).sounds(BlockSoundGroup.AZALEA_LEAVES).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("leave_slab", "oak_leaves_slab")))));
    public static final Block SPRUCE_LEAVES_SLAB = Registry.register(Registries.BLOCK,Identifier.of("leave_slab", "spruce_leaves_slab"),new SlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_LEAVES).nonOpaque().strength(0.2f).sounds(BlockSoundGroup.AZALEA_LEAVES).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("leave_slab", "spruce_leaves_slab")))));
    public static final Block CHERRY_LEAVES_SLAB = Registry.register(Registries.BLOCK,Identifier.of("leave_slab", "cherry_leaves_slab"),new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LEAVES).nonOpaque().strength(0.2f).sounds(BlockSoundGroup.AZALEA_LEAVES).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("leave_slab", "cherry_leaves_slab")))));
    public static final Block PALE_OAK_LEAVES_SLAB = Registry.register(Registries.BLOCK,Identifier.of("leave_slab", "pale_oak_leaves_slab"),new SlabBlock(AbstractBlock.Settings.copy(Blocks.PALE_OAK_LEAVES).nonOpaque().strength(0.2f).sounds(BlockSoundGroup.AZALEA_LEAVES).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of("leave_slab", "pale_oak_leaves_slab")))));

 



    @Override
    public void onInitialize() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.add(AZALEA_LEAVES_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.add(FLOWERING_AZALEA_LEAVES_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.add(ACACIA_LEAVES_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.add(BIRCH_LEAVES_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.add(DARK_OAK_LEAVES_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.add(JUNGLE_LEAVES_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.add(MANGROVE_LEAVES_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.add(OAK_LEAVES_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.add(SPRUCE_LEAVES_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.add(CHERRY_LEAVES_SLAB);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {entries.add(PALE_OAK_LEAVES_SLAB);});
        Registry.register(Registries.ITEM,Identifier.of("leave_slab", "azalea_leaves_slab"),new BlockItem(AZALEA_LEAVES_SLAB, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("leave_slab", "azalea_leaves_slab")))));
        Registry.register(Registries.ITEM,Identifier.of("leave_slab", "flowering_azalea_leaves_slab"),new BlockItem(FLOWERING_AZALEA_LEAVES_SLAB, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("leave_slab", "flowering_azalea_leaves_slab")))));
        Registry.register(Registries.ITEM,Identifier.of("leave_slab", "acacia_leaves_slab"),new BlockItem(ACACIA_LEAVES_SLAB, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("leave_slab", "acacia_leaves_slab")))));
        Registry.register(Registries.ITEM,Identifier.of("leave_slab", "birch_leaves_slab"),new BlockItem(BIRCH_LEAVES_SLAB, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("leave_slab", "birch_leaves_slab")))));
        Registry.register(Registries.ITEM,Identifier.of("leave_slab", "dark_oak_leaves_slab"),new BlockItem(DARK_OAK_LEAVES_SLAB, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("leave_slab", "dark_oak_leaves_slab")))));
        Registry.register(Registries.ITEM,Identifier.of("leave_slab", "jungle_leaves_slab"),new BlockItem(JUNGLE_LEAVES_SLAB, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("leave_slab", "jungle_leaves_slab")))));
        Registry.register(Registries.ITEM,Identifier.of("leave_slab", "mangrove_leaves_slab"),new BlockItem(MANGROVE_LEAVES_SLAB, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("leave_slab", "mangrove_leaves_slab")))));
        Registry.register(Registries.ITEM,Identifier.of("leave_slab", "oak_leaves_slab"),new BlockItem(OAK_LEAVES_SLAB, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("leave_slab", "oak_leaves_slab")))));
        Registry.register(Registries.ITEM,Identifier.of("leave_slab", "spruce_leaves_slab"),new BlockItem(SPRUCE_LEAVES_SLAB, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("leave_slab", "spruce_leaves_slab")))));
        Registry.register(Registries.ITEM,Identifier.of("leave_slab", "cherry_leaves_slab"),new BlockItem(CHERRY_LEAVES_SLAB, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("leave_slab", "cherry_leaves_slab")))));
        Registry.register(Registries.ITEM,Identifier.of("leave_slab", "pale_oak_leaves_slab"),new BlockItem(PALE_OAK_LEAVES_SLAB, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of("leave_slab", "pale_oak_leaves_slab")))));



    }
}
