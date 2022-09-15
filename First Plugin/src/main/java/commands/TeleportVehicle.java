package commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;

import java.util.ArrayList;

public class TeleportVehicle implements CommandExecutor
{

    public boolean onCommand (CommandSender sender, Command command, String label, String [] args)
    {

            if (sender instanceof Player)
            {
                Player player = (Player) sender ;

                if (args.length == 0 || args.length == 2)
                {
                    player.sendMessage(ChatColor.RED + "Not enough arguments provided.");
                }

                else if (args.length == 1)
                {

                    Player target = Bukkit.getPlayer(args[0]) ;
                    Vehicle vehicle = (Vehicle) player.getVehicle();
                    assert vehicle != null;
                    if (vehicle.getType() == EntityType.HORSE)
                    {

                        assert target != null;
                        player.teleport(target) ;
                        vehicle.teleport(player) ;

                    }

                    else if (vehicle.getType() == EntityType.BOAT)
                    {
                        assert target != null;
                        player.teleport(target) ;
                        vehicle.eject() ;
                        ArrayList <Entity> Entities = new ArrayList<>(100) ;
                        Entities.addAll(vehicle.getNearbyEntities(3, 0, 3)) ;
                        for (Entity entity : Entities)
                            entity.teleport(target) ;

                        vehicle.teleport(target) ;

                    }

                }

                else if (args.length == 3)
                {

                    int Xdestination = Integer.parseInt(args[0]) ;
                    int Ydestination = Integer.parseInt(args[1]) ;
                    int Zdestination = Integer.parseInt(args[2]) ;
                    Location destination = new org.bukkit.Location(player.getWorld(), Xdestination, Ydestination, Zdestination) ;
                    Vehicle vehicle = (Vehicle) player.getVehicle();

                    assert vehicle != null ;

                    if (vehicle.getType() == EntityType.HORSE)
                    {

                            player.teleport(destination) ;
                            vehicle.teleport(player) ;

                    }

                    else if (vehicle.getType() == EntityType.BOAT)
                    {
                        player.teleport(destination) ;
                        vehicle.eject() ;
                        ArrayList <Entity> Entities = new ArrayList<>(100) ;
                        Entities.addAll(vehicle.getNearbyEntities(10, 0, 10)) ;
                        for (Entity entity : Entities) {

                            entity.teleport(destination);

                        }
                        vehicle.teleport(destination) ;

                    }

                }

            }

            return true ;

    }

}
