package commands;

import main.FireSwords;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.ItemMeta;
import org.checkerframework.checker.units.qual.A;
import org.jetbrains.annotations.NotNull;
import swords.DragonSword;
import swords.swordBase.FireSwordConfig;

import java.util.*;

public class GetSwordCommand implements CommandExecutor {

    private final FireSwords plugin;

    public GetSwordCommand(FireSwords fireSwords) {
        this.plugin = fireSwords;
    }

    @Override
    public boolean onCommand(@NotNull  CommandSender commandSender, @NotNull  Command command, @NotNull  String s, String[] strings) {

        if (commandSender instanceof Player player) {

            Map<Enchantment,Integer> enchantmentIntegerMap = new HashMap<>();
            enchantmentIntegerMap.put(Enchantment.KNOCKBACK, 2);

            ArrayList<String> lore = new ArrayList<>();
            lore.add(UUID.randomUUID().toString());

            DragonSword dragonSword = new DragonSword(this.plugin,
                    new FireSwordConfig("Elo", 1, lore, enchantmentIntegerMap
            ));

            player.getInventory().addItem(dragonSword);
            return true;
        }

        commandSender.sendMessage(command.getUsage());
        return true;
    }
}
