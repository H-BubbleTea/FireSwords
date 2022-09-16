package swords.swordBase;

import main.FireSwords;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class FireSwordHitListener implements Listener {

    private FireSwords fireSwords;

    public FireSwordHitListener(FireSwords fireSwords) {
        this.fireSwords = fireSwords;
    }

    @EventHandler
    public void onFireSwordHit(FireSwordHitEvent event) {

    }
}
