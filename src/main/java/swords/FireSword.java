package swords;

import org.bukkit.enchantments.Enchantment;

import java.util.ArrayList;

public abstract class FireSword {

    private final String name;
    private final ArrayList<Enchantment> enchantmentArrayList;

    public FireSword(String name, ArrayList<Enchantment> enchantmentArrayList) {
        this.name = name;
        this.enchantmentArrayList = enchantmentArrayList;
    }

    abstract void interactWithMobsOnGivenDamage();

    public ArrayList<Enchantment> getEnchantmentArrayList() {
        return enchantmentArrayList;
    }

    public String getName() {
        return name;
    }
}
