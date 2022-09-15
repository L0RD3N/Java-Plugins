/**package commands;

import handlers.EatingTeleport;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.io.Console;

public class ActivatePlugin implements CommandExecutor {

    @Override

    public boolean onCommand (CommandSender sender, Command command, String label, String args[])
    {

        if (sender instanceof Player || sender instanceof ConsoleCommandSender)
        {
            new EatingTeleport(this) ;



        }
        return true ;

    }

}**/
