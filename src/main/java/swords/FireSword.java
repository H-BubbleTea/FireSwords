package swords;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

@Data
public abstract class FireSword {

    private ItemStack swordBody;
    private final String name;
    private final ArrayList<EnchantmentModel> enchantmentArrayList;

    public FireSword(String name, ArrayList<EnchantmentModel> enchantmentArrayList) {
        this.name = name;
        this.enchantmentArrayList = enchantmentArrayList;
        this.createSwordBody();
    }

    abstract void interactOnGivenDamage();

    private void createSwordBody() {
        ItemStack swordBody = new ItemStack(Material.DIAMOND_SWORD);
        this.setSwordBody(swordBody);
        this.applyEnchants();
    }

    private void applyEnchants() {
        this.enchantmentArrayList.forEach(enchantment -> getSwordBody().addEnchantment(enchantment.getEnchantment(), enchantment.getLevel()));
    }
}
