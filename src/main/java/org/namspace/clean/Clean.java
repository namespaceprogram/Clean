package org.namspace.clean;

import org.bukkit.plugin.java.JavaPlugin;

public final class Clean extends JavaPlugin {

    public static Clean pl;
    public boolean goodweatherenabled = false;
    public boolean keepdayenabled = false;

    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();
        pl = this;

    }

}
