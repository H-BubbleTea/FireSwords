package initializers.packetListeners;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.ListenerPriority;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import main.FireSwords;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import swords.swordBase.FireSwordHitEvent;
import swords.swordBase.FireSwordKeys;

public class OnItemHitAnEntityPacketListener {
    private final FireSwords fireSwords;

    public OnItemHitAnEntityPacketListener(FireSwords fireSwords) {
        this.fireSwords = fireSwords;
        this.init();
    }

    private void init() {
        this.fireSwords.getProtocolManager().addPacketListener(new PacketAdapter(
                this.fireSwords,
                ListenerPriority.HIGHEST,
                PacketType.Play.Client.USE_ENTITY
        ) {
            @Override
            public void onPacketReceiving(PacketEvent event) {
                ItemMeta itemMeta = event.getPlayer().getInventory().getItemInMainHand().getItemMeta();
                PersistentDataContainer container;
                if (itemMeta != null) {
                    container = itemMeta.getPersistentDataContainer();
                    if (container.has(new NamespacedKey(fireSwords, FireSwordKeys.FIRE_SWORD_KEY), FireSwordKeys.FIRE_SWORD_DATA_TYPE)) {
                        event.getPlayer().sendMessage("Fire Sword");
                        Bukkit.getScheduler().runTask(plugin, () -> Bukkit.getPluginManager().callEvent(new FireSwordHitEvent(event.getPlayer(), event.getPlayer())));
                    }
                }
            }
        });
    }
}
