package com.stardust.glistening_grottos.core;

import com.stardust.glistening_grottos.client.ClientRegister;
import com.stardust.glistening_grottos.registers.GGBlocks;
import com.stardust.glistening_grottos.registers.GGItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(GlisteningGrottos.MODID)
public class GlisteningGrottos {

    // MODID
    public static final String MODID = "glistening_grottos";
    // Logger
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    // Mod instance
    public static GlisteningGrottos INSTANCE;


    public GlisteningGrottos() {
        INSTANCE = this;

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverStarting);

        GGItems.ITEMS.register(eventBus);
        GGBlocks.BLOCKS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void serverStarting(FMLServerAboutToStartEvent event) {

    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }
}
