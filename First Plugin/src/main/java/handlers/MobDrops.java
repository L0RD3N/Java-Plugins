package handlers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import plugin.plugin.Plugin;

import java.util.Random;
import java.util.random.RandomGenerator;

public class MobDrops implements Listener {

    public MobDrops (Plugin events2)
    {

        Bukkit.getPluginManager().registerEvents(this, events2);

    }

    @EventHandler
    public void onDeath (EntityDeathEvent event)
    {

        LivingEntity entity = event.getEntity() ;
        
        if (entity instanceof Zombie)
        {
            event.getDrops().clear() ;
            event.setDroppedExp(0) ;
           Random drop = new Random() ;
            entity.getLocation().getWorld().dropItem(entity.getLocation(), new ItemStack(Material.REDSTONE, drop.nextInt(1, 64))) ;

        }

    }

}
