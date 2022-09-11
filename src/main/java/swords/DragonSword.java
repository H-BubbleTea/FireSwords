package swords;

import org.bukkit.enchantments.Enchantment;

import java.util.ArrayList;

public class DragonSword extends FireSword {

    public DragonSword(String name, ArrayList<Enchantment> enchantmentArrayList) {
        super(name, enchantmentArrayList);
    }

    @Override
    void interactWithMobsOnGivenDamage() { }

}