package handlers ;

import maria.plugin_maria.Plugin_Maria;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import java.util.Random;

public class EatingTeleport implements Listener {

    public EatingTeleport (Plugin_Maria events1) {
        Bukkit.getPluginManager().registerEvents(this, events1);
    }

    @EventHandler
    public void onPlayerEat (PlayerItemConsumeEvent playerItemConsumeEvent)
    {

        Player player = playerItemConsumeEvent.getPlayer();
        Random random = new Random() ;
        double destinationX = random.nextDouble(5000);
        double destinationY = random.nextDouble(64, 256) ;
        double destinationZ = random.nextDouble(5000);

        Location destination = new org.bukkit.Location(player.getWorld(), destinationX, destinationY, destinationZ) ;
        for(Player player1 : Bukkit.getServer().getOnlinePlayers()) {
            player1.teleport(destination);
        }


    }

}
