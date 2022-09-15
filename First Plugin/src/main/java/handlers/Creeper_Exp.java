package handlers;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.entity.Creature;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import plugin.plugin.Plugin;

public class Creeper_Exp implements Listener
{

    public Creeper_Exp (Plugin events2)
    {

        Bukkit.getPluginManager().registerEvents(this, events2);

    }

    @EventHandler
    public void onCreeperExp (EntityExplodeEvent event)
    {

        Creature creeper = (Creature) event.getEntity() ;
        Particle.DustTransition dustTransition = new Particle.DustTransition(Color.AQUA, Color.RED, 10F) ;

        if (creeper.getType() == EntityType.CREEPER)
        {
            creeper.getLocation().getWorld().spawnParticle(Particle.DUST_COLOR_TRANSITION, creeper.getLocation(), 5, dustTransition) ;
            event.setYield(5.0F);
        }

    }

}
