package plugin.plugin;

import commands.Location;
import commands.TeleportHome;
import commands.TeleportVehicle;
import handlers.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;
import tasks.RandomPEScheduled;

import java.util.Random;

public final class Plugin extends JavaPlugin {

    @Override
           public void onEnable()
    {
            Bukkit.getLogger().info("Bury a friend");
            Random time = new Random() ;
            BukkitTask task = new RandomPEScheduled().runTaskTimer(this, 0L, time.nextInt(400, 1200)) ;
            /**getCommand("location").setExecutor(new Location()) ;
            getCommand("tpvehicle").setExecutor(new TeleportVehicle());
            getCommand("teleporthome").setExecutor(new TeleportHome());
            new RandomPEFlowers(this) ;
            new Creeper_Exp(this) ;**/

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Try to wake up");
    }
}
