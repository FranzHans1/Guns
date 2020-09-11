package me.Sadown.Guns;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main extends JavaPlugin
{
    public static List<UUID> ids = new ArrayList<UUID>();
    LeftClick leftClick;
    SnowballHit snowBall;
    public void onEnable()
    {
        leftClick = new LeftClick();
        snowBall = new SnowballHit();
        this.getCommand("SuperGun").setExecutor(new SuperGun());
        this.getServer().getPluginManager().registerEvents(this.leftClick,this);
        this.getServer().getPluginManager().registerEvents(this.snowBall, this);
    }

    public void onDisable()
    {

    }
}
