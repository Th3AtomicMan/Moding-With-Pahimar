package com.atomicMan.LetsModReboot;

import com.atomicMan.LetsModReboot.handler.ConfigurationHandler;
import com.atomicMan.LetsModReboot.proxy.IProxy;
import com.atomicMan.LetsModReboot.reference.Reference;
import com.atomicMan.LetsModReboot.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid= Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)

public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static  LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS )
    public static IProxy proxy;

    @Mod.EventHandler//Pre-Initialization
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialization Complete");
    }

    @Mod.EventHandler//Initialization
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete");
    }

    @Mod.EventHandler//Post-Initialization
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete");
    }
}
