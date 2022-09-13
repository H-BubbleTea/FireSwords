package swords.listeners;

import main.FireSwords;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class FireSwordListener implements Listener {
    private final FireSwords fireSwords;

    public FireSwordListener(FireSwords fireSwords) {
        this.fireSwords = fireSwords;
    }

    @EventHandler
    public void onEntityDamageByEntityEvent(EntityDamageByEntityEvent event) {

    }
}
