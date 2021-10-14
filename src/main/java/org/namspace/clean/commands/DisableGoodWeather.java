package org.namspace.clean.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.namspace.clean.Clean;
import org.namspace.clean.listener.WeatherListener;

public class DisableGoodWeather implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player p = (Player) sender;

            if(p.hasPermission("clean.disableWeather")) {

                Clean.pl.goodweatherenabled = false;

            }

        }

        return true;
    }

}
