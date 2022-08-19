package maria.plugin_maria;

import handlers.EatingTeleport;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin_Maria extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("Server is open!");
        new EatingTeleport(this) ;

    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("Server is closed!");
    }
}
