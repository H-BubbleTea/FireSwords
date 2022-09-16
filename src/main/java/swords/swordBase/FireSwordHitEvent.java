package swords.swordBase;

import lombok.Getter;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class FireSwordHitEvent extends Event {

    @Getter
    private final Entity hittenEntity;
    @Getter
    private final Entity damagerEntity;
    private static final HandlerList handlerList = new HandlerList();

    public FireSwordHitEvent(Entity hittenEntity, Entity damagerEntity) {
        this.hittenEntity = hittenEntity;
        this.damagerEntity= damagerEntity;
    }

    public Player getDamagerAsPlayer() {
        return (Player) damagerEntity;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlerList;
    }
}
