package me.Sadown.Guns;

import org.bukkit.World;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class SnowballHit implements Listener
{
    @EventHandler
    public void onSnowBallHit(ProjectileHitEvent e)
    {
        if(e.getEntity() instanceof Snowball)
        {
            if(Main.ids.contains(e.getEntity().getUniqueId()))
            {
                Main.ids.remove(e.getEntity().getUniqueId());
                World w = e.getEntity().getWorld();
                w.createExplosion(e.getEntity().getLocation(),6, true);
            }
        }
    }
}
