package com.stardust.glistening_grottos.client;

import com.stardust.glistening_grottos.core.GlisteningGrottos;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(value = Dist.CLIENT, modid = GlisteningGrottos.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegister {

    public static void registerEntityRenderers(Supplier<Minecraft> minecraft) {

    }

    public static void registerBlockRenderTypes() {

    }
}
