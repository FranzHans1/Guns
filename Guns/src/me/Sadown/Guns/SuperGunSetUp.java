package me.Sadown.Guns;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SuperGunSetUp
{
    public static ItemStack giveGun()
    {
        ItemStack Gun = new ItemStack(Material.ACACIA_FENCE);
        ItemMeta meta = Gun.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setDisplayName(ChatColor.BLUE + "" + ChatColor.BOLD + "SuperGun");
        List<String> lore = new ArrayList<String>();
        lore.add("   ");
        lore.add(ChatColor.YELLOW + "Destroy your enemies!");
        meta.setLore(lore);
        Gun.setItemMeta(meta);
        return Gun;
    }
}
