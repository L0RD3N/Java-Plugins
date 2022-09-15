package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Location implements CommandExecutor {
            @Override
            public boolean onCommand (CommandSender sender, Command command, String label, String [] args)
            {

                if (sender instanceof Player)
                {

                        Player player = (Player) sender ;

                        org.bukkit.Location loc = player.getLocation() ;
                        int x = (int) loc.getX() ;
                        int y = (int) loc.getY() ;
                        int z = (int) loc.getZ() ;

                        if (args.length == 0)
                        {
                            Bukkit.broadcastMessage(player.getDisplayName() + " is at: " + x + " " + y + " " + z+ " !") ;
                        }

                        else if (args.length == 1)
                        {

                            switch (args[0])
                            {
                                case "endportal":
                                case "end":
                                case "end portal":
                                    Bukkit.broadcastMessage("End portal is at: " + "186 6 -4813" + " !");
                                    break;
                                case "nether portal":
                                case "nether":
                                    Bukkit.broadcastMessage("Nether portal is at: " + "18 33 -550" + " !");
                                    break;
                                case "nether fortress":
                                case "fort":
                                case "fortress":
                                    Bukkit.broadcastMessage("Nether fortress is at: " + "-99 49 -277" + " !");
                                    break;

                                case "home":
                                case "house":
                                    Bukkit.broadcastMessage("Home is at:" + "50 64 -4337" + " !") ;

                            }

                        }

                }

                return true  ;

            }
}
