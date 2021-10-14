package org.namspace.clean.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.namspace.clean.Clean;

public class WeatherListener implements Listener {

    @EventHandler
    public void onWeatherChange(WeatherChangeEvent e) {
        if(Clean.pl.goodweatherenabled)
            e.setCancelled(true);
        else
            return;
    }

}
