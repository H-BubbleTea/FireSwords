package commands;

import main.FireSwords;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import swords.DragonSword;

import java.util.ArrayList;

public class GetSwordCommand implements CommandExecutor {

    private final FireSwords plugin;

    public GetSwordCommand(FireSwords fireSwords) {
        this.plugin = fireSwords;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player player) {
            DragonSword dragonSword = new DragonSword(this.plugin, "elo", new ArrayList<>());
            player.sendMessage("Nice sword");
            ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
            player.getInventory().addItem(item);
            return true;
        }

        commandSender.sendMessage(command.getUsage());
        return true;
    }
}
