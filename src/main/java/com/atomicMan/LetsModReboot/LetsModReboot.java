package com.atomicMan.LetsModReboot;

import com.atomicMan.LetsModReboot.proxy.IProxy;
import com.atomicMan.LetsModReboot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid= Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class LetsModReboot
{
    @Mod.Instance(Reference.MOD_ID)
    public static  LetsModReboot instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS )
    public static IProxy proxy;

    @Mod.EventHandler//Pre-Initialization
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler//Initialization
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler//Post-Initialization
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
