package swords;

import main.FireSwords;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import swords.swordBase.EnchantmentModel;
import swords.swordBase.FireSword;

import java.util.ArrayList;

public class DragonSword extends FireSword {

    public DragonSword(FireSwords fireSwords, String name, ArrayList<EnchantmentModel> enchantmentArrayList) {
        super(fireSwords, name, enchantmentArrayList);
    }

    @Override
    public void interactOnGivenDamage(EntityDamageByEntityEvent event) {

    }
}
