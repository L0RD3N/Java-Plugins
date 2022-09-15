package tasks;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.concurrent.ThreadLocalRandom;

public class RandomPEScheduled extends BukkitRunnable {

    @Override

    public void run()
    {

            System.out.println("Potion effect applied!");

            int RandomPotionEffect = ThreadLocalRandom.current().nextInt(PotionEffectType.values().length) ;

            for (Player player : Bukkit.getOnlinePlayers())
            {

                player.addPotionEffect(new PotionEffect(PotionEffectType.values()[RandomPotionEffect], 200, 1)) ;

            }

    }

}
