package maria.plugin_maria;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;
import tasks.RandomPEScheduled;

public final class Plugin_Maria extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Server is open!");
        BukkitTask task = new RandomPEScheduled().runTaskTimer(this, 0L, 200L) ;
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Server is closed!");
    }
}
