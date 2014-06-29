package com.atomicMan.LetsModReboot.configuration;

import net.minecraftforge.common.config.Configuration;
import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        //create the configuration object from the given configuration file
        boolean configValue = false;

        try
        {
            //Load the configuration file
            configuration.load();

            //Read in properties from the configuration file
            configValue = configuration.get("ForgeCraft", "configValue", true, "This is an example config file").getBoolean(true);
        }
        catch (Exception e)
        {
            //Log the configuration file
        }
        finally
        {
            //Save the configuration file
            configuration.save();
        }

        System.out.println(configValue);
    }
}
