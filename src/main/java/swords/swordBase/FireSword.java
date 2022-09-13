package swords.swordBase;

import lombok.Data;
import main.FireSwords;
import org.bukkit.Material;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

@Data
public abstract class FireSword {

    private ItemStack swordBody;
    private final String name;
    private final ArrayList<EnchantmentModel> enchantmentArrayList;
    private final FireSwords fireSwords;

    public FireSword(FireSwords fireSwords, String name, ArrayList<EnchantmentModel> enchantmentArrayList) {
        this.fireSwords = fireSwords;
        this.name = name;
        this.enchantmentArrayList = enchantmentArrayList;
        this.createSwordBody();
    }

    public abstract void interactOnGivenDamage(EntityDamageByEntityEvent event);

    private void createSwordBody() {
        ItemStack swordBody = new ItemStack(Material.DIAMOND_SWORD);
        this.setSwordBody(swordBody);
        this.applyEnchants();
    }

    private void applyEnchants() {
        this.enchantmentArrayList.forEach(enchantment -> getSwordBody().addEnchantment(enchantment.getEnchantment(), enchantment.getLevel()));
    }
}
