package handlers;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import plugin.plugin.Plugin;

public class EnderPearlTravel implements Listener
{

        public  EnderPearlTravel(Plugin events4) {Bukkit.getPluginManager().registerEvents(this, events4);}

        @EventHandler
        public void onTeleport (ProjectileHitEvent event)
        {

                Projectile projectile = event.getEntity() ;

                if (projectile.getType() == EntityType.ENDER_PEARL)
                        Bukkit.broadcastMessage("E") ;

        }

}
