package com.traveler.client;

import com.traveler.TravelerMod;
import com.traveler.registry.ModEntities;
import net.minecraft.client.renderer.entity.EntityRenderersEvent;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(modid = TravelerMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.DEAD_SKELETON.get(), TravelerSkeletonRenderer::new);
    }
}
