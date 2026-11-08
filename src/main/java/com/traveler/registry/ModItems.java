package com.traveler.registry;

import com.traveler.TravelerMod;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TravelerMod.MODID);

    public static final DeferredItem<DeferredSpawnEggItem> DEAD_SKELETON_SPAWN_EGG =
            ITEMS.register("dead_skeleton_spawn_egg", () ->
                    new DeferredSpawnEggItem(ModEntities.DEAD_SKELETON, 0x4B4B3A, 0x8A6A3A, new Item.Properties()));
}
