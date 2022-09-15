package handlers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;
import plugin.plugin.Plugin;

public class ZSpawn implements Listener {
    public ZSpawn (Plugin events1)
    {

        Bukkit.getPluginManager().registerEvents(this, events1);

    }

    @EventHandler
    public void onZombieSpawn (CreatureSpawnEvent event)
    {

        Creature creature = (Creature) event.getEntity();
        ItemStack weapon = new ItemStack(Material.STICK) ;
        weapon.addEnchantment(Enchantment.KNOCKBACK, 2);

        if (creature.getType() == EntityType.ZOMBIE)
        {
            creature.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
            creature.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
            creature.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
            creature.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
            creature.getEquipment().setItemInMainHand(weapon);
            //Bukkit.getLogger().info("Zombie has spawned");

        }

    }


}
