package handlers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import plugin.plugin.Plugin;

public class TorchHandler implements Listener {
    public TorchHandler(Plugin events) {
        Bukkit.getPluginManager().registerEvents(this, events);
    }

    @EventHandler
    public void onTorchPlace(BlockPlaceEvent event)
    {

        Block block = event.getBlock() ;

        if (block.getType() != Material.TORCH) {
            return ;
        }

        else {
            Player player = event.getPlayer();
            player.damage(10);


        }

        ///Bukkit.getLogger().info("A torch was placed");

    }

}
