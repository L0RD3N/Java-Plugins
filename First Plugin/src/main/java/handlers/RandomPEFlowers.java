package handlers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import plugin.plugin.Plugin;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomPEFlowers implements Listener
{

        public RandomPEFlowers (Plugin events3) {Bukkit.getPluginManager().registerEvents(this, events3);}

        @EventHandler
        public void SteppingOnFlowers(BlockBreakEvent event)
        {

            Block block = event.getBlock() ;
            ArrayList <Material> Flowers = new ArrayList<>(100)  ;
            Flowers.add(Material.DANDELION) ;
            Flowers.add(Material.POPPY) ;
            Flowers.add(Material.BLUE_ORCHID) ;
            Flowers.add(Material.ALLIUM) ;
            Flowers.add(Material.AZURE_BLUET) ;
            Flowers.add(Material.RED_TULIP) ;
            Flowers.add(Material.ORANGE_TULIP) ;
            Flowers.add(Material.WHITE_TULIP) ;
            Flowers.add(Material.PINK_TULIP) ;
            Flowers.add(Material.OXEYE_DAISY) ;
            Flowers.add(Material.LILY_OF_THE_VALLEY) ;
            Flowers.add(Material.SUNFLOWER) ;
            Flowers.add(Material.LILAC) ;
            Flowers.add(Material.ROSE_BUSH) ;
            Flowers.add(Material.PEONY) ;


            int randompotioneffect = ThreadLocalRandom.current().nextInt(PotionEffectType.values().length) ;

            if (Flowers.contains(block.getType()))
            {

                Player player = event.getPlayer();
                player.addPotionEffect(new PotionEffect(PotionEffectType.values()[randompotioneffect], 200, 1)) ;

            }

        }

}
