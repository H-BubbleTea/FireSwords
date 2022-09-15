package swords;

import main.FireSwords;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import swords.swordBase.FireSword;
import swords.swordBase.FireSwordConfig;


public class DragonSword extends FireSword {

    public DragonSword(FireSwords fireSwords, FireSwordConfig fireSwordConfig) {
        super(fireSwords, fireSwordConfig);
   }

    @Override
    public void interactOnGivenDamage(EntityDamageByEntityEvent event) {
        event.getDamager().sendMessage("Elo");
    }
}
