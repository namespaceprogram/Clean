package org.namspace.clean.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.namspace.clean.Clean;

public class DisableAlwaysDay implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {
            Player p = (Player) sender;

            if(p.hasPermission("clean.disableAlwaysDay")) {

                Clean.pl.keepdayenabled = false;

            }
        }

        return true;
    }
}
