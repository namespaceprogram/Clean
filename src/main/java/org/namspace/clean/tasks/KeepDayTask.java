package org.namspace.clean.tasks;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;
import org.namspace.clean.Clean;

public class KeepDayTask extends BukkitRunnable {



    @Override
    public void run() {
        if(Clean.pl.keepdayenabled) {
            String world = Clean.pl.getConfig().getString("world-name");

            if (Bukkit.getServer().getWorld(world) != null)
                Bukkit.getServer().getWorld(world).setTime(0l);
            else
                System.out.println("[Clean]: Unknown world name! Please make your the world is set to the correct name in the config.yml.");
        } else {
            return;
        }
    }
}
