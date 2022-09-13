package swords.swordBase;

import lombok.Data;
import main.FireSwords;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

@Data
public abstract class FireSword implements Listener {

    private ItemStack swordBody;
    private final String name;
    private final ArrayList<EnchantmentModel> enchantmentArrayList;
    private final FireSwords fireSwords;

    public FireSword(FireSwords fireSwords, String name, ArrayList<EnchantmentModel> enchantmentArrayList) {
        this.fireSwords = fireSwords;
        this.fireSwords.getServer().getPluginManager().registerEvents(this, this.fireSwords);
        this.name = name;
        this.enchantmentArrayList = enchantmentArrayList;
        this.createSwordBody();
    }

    public abstract void interactOnGivenDamage(EntityDamageByEntityEvent event);

    @EventHandler
    public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent event) {
        this.interactOnGivenDamage(event);
    }

    private void createSwordBody() {
        ItemStack swordBody = new ItemStack(Material.DIAMOND_SWORD);
        this.setSwordBody(swordBody);
        this.applyEnchants();
    }

    private void applyEnchants() {
        this.enchantmentArrayList.forEach(enchantment -> getSwordBody().addEnchantment(enchantment.getEnchantment(), enchantment.getLevel()));
    }
}
