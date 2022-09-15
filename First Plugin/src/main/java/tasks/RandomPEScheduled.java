package tasks;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomPEScheduled extends BukkitRunnable {

    @Override

    public void run()
    {

        System.out.println("Potion effect applied!");

        int RandomPotionEffect = ThreadLocalRandom.current().nextInt(PotionEffectType.values().length) ;
        boolean IsDmgEffect = false ;
        Random amplifier = new Random() ;

        if (RandomPotionEffect == 7)
        {IsDmgEffect = true ;}

        for (Player player : Bukkit.getOnlinePlayers())
        {

            if (IsDmgEffect)
                player.addPotionEffect(new PotionEffect(PotionEffectType.values()[RandomPotionEffect], 100, 1)) ;

            else
                player.addPotionEffect(new PotionEffect(PotionEffectType.values()[RandomPotionEffect], 250, amplifier.nextInt(1, 20) )) ;

        }

    }

}
