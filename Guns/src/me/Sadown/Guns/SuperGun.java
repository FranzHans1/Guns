package me.Sadown.Guns;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SuperGun implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        if(label.equalsIgnoreCase("Supergun"))
        {
            if(sender instanceof Player)
            {
                Player player = (Player) sender;
                player.getInventory().addItem(SuperGunSetUp.giveGun());
                sender.sendMessage(ChatColor.BLUE + "" + ChatColor.BOLD + "You have been given a Supergun!");
            }
            else
                sender.sendMessage("Console can't have guns!");
        }
        return false;
    }
}
