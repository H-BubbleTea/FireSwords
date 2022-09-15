package swords.swordBase;

import lombok.Getter;
import main.FireSwords;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.persistence.PersistentDataType;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SwordListener implements Listener {

    @Getter
    private final Set<FireSword> fireSwordsListeners = new HashSet<>();

    private final FireSwords fireSwords;

    public SwordListener(FireSwords fireSwords) {
        this.fireSwords = fireSwords;
        this.fireSwords.getServer().getPluginManager().registerEvents(this, this.fireSwords);
    }

    public void registerNewSwordListener(FireSword fireSword) {
        this.getFireSwordsListeners().add(fireSword);
    }

    @EventHandler
    private void onEntityDamageByEntityEvent(EntityDamageByEntityEvent event) {
        fireSwordsListeners.forEach(fireSword -> {
            if (event.getDamager() instanceof Player player) {
                if (Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta()).getPersistentDataContainer().has(fireSword.getItemKey(), PersistentDataType.DOUBLE)) {
                    fireSword.interactOnGivenDamage(event);
                }
            }
        });
    }
}
