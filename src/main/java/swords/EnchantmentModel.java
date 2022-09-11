package swords;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bukkit.enchantments.Enchantment;

@AllArgsConstructor
@Data
public class EnchantmentModel {

    private Enchantment enchantment;
    private int level;
}
