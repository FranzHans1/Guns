package me.Sadown.Guns;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class LeftClick implements Listener
{
    @EventHandler
    public void onLeftClick(PlayerInteractEvent e)
    {
        Player player = e.getPlayer();
        if(!(e.getPlayer().getItemInHand() == null))
        {
            ItemStack Item = new ItemStack(player.getItemInHand());
            if (Item.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.BLUE + "" + ChatColor.BOLD + "SuperGun")) {
                if (e.getAction() == Action.LEFT_CLICK_AIR) {
                    Snowball bullet = e.getPlayer().getWorld().spawn(e.getPlayer().getLocation().add(0, 3, 0), Snowball.class);
                    bullet.setVelocity(e.getPlayer().getLocation().getDirection().multiply(4));
                    Main.ids.add(bullet.getUniqueId());
                }
                if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
                    e.setCancelled(true);
                }
            }
        }
    }

}
