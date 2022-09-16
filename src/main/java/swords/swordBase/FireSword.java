package swords.swordBase;

import lombok.Getter;
import main.FireSwords;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class FireSword extends ItemStack {
    @Getter
    private final NamespacedKey itemKey;
    @Getter
    private final FireSwordConfig fireSwordConfig;

    protected final FireSwords fireSwords;

    public FireSword(FireSwords fireSwords, FireSwordConfig fireSwordConfig) {
        super(Material.DIAMOND_SWORD, fireSwordConfig.amount());
        this.itemKey = new NamespacedKey(fireSwords, FireSwordKeys.FIRE_SWORD_KEY);
        this.fireSwords = fireSwords;
        this.fireSwordConfig = fireSwordConfig;
        this.setupSwordBase();
        this.addSwordEssentials();
    }

    public abstract void interactOnGivenDamage(FireSwordHitEvent event);

    private void setupSwordBase() {
        ItemMeta itemMeta = this.getItemMeta();
        assert itemMeta != null;
        this.setItemMeta(this.setupSwordMeta(itemMeta));
    }

    private ItemMeta setupSwordMeta(ItemMeta itemMeta) {
        itemMeta.getPersistentDataContainer().set(this.itemKey, FireSwordKeys.FIRE_SWORD_DATA_TYPE, FireSwordKeys.FIRE_SWORD_SECRET_VALUE);
        itemMeta.setDisplayName(this.getFireSwordConfig().name());
        itemMeta.setLore(this.getFireSwordConfig().lore());
        return itemMeta;
    }

    private void addSwordEssentials() {
        this.addEnchantments(this.getFireSwordConfig().enchantments());
    }
}
