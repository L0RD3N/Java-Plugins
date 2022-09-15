package commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Vehicle;

public class TeleportHome implements CommandExecutor {
    @Override
    public boolean onCommand (CommandSender sender, Command command, String label, String [] args)
    {

        if (sender instanceof Player)
        {

            Player player = (Player) sender ;

            int x = 50 ;
            int y = 64 ;
            int z = -4337 ;

            Location home = new org.bukkit.Location(player.getWorld(), x, y, z) ;
            if(player.isInsideVehicle())
            {

                Vehicle vehicle = (Vehicle) player.getVehicle() ;
                player.teleport(home) ;
                assert vehicle != null;
                vehicle.teleport(player) ;

            }

            else
                player.teleport(home) ;

        }

        return true;
    }
}
