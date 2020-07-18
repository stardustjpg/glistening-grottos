package com.stardust.glistening_grottos.client;

import com.stardust.glistening_grottos.core.GlisteningGrottos;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = GlisteningGrottos.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegister {

    @SubscribeEvent
    public static void registerClient(FMLClientSetupEvent event) {
        registerEntityRenderers(event.getMinecraftSupplier());
        registerBlockRenderTypes();
    }

    public static void registerEntityRenderers(Supplier<Minecraft> minecraft) {

    }

    public static void registerBlockRenderTypes() {

    }
}
