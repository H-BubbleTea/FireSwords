package swords;

import main.FireSwords;
import swords.swordBase.FireSword;
import swords.swordBase.FireSwordConfig;
import swords.swordBase.FireSwordHitEvent;

import java.util.logging.Level;


public class DragonSword extends FireSword {

    public DragonSword(FireSwords fireSwords, FireSwordConfig fireSwordConfig) {
        super(fireSwords, fireSwordConfig);
   }

    @Override
    public void interactOnGivenDamage(FireSwordHitEvent event) {
        this.fireSwords.getServer().getLogger().log(Level.INFO, "ELo");
    }
}
