package org.namspace.clean.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;
import org.namspace.clean.Clean;
import org.namspace.clean.tasks.KeepDayTask;

public class EnableAlwaysDay implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player) {

            Player p = (Player) sender;

            if(p.hasPermission("clean.enableAlwaysDay")) {
                BukkitTask keepDayTask = new KeepDayTask().runTaskTimer(Clean.pl, 0l, 100l);
                Clean.pl.keepdayenabled = true;
            }

        }

        return true;
    }
}
