package main;

import initializers.CommandsManager;
import initializers.ListenersManager;
import lombok.Getter;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;
import swords.swordBase.SwordListener;

public final class FireSwords extends JavaPlugin {

    static private FireSwords fireSwords;
    @Getter
    private ListenersManager listenersManager;
    @Getter
    private CommandsManager commandsManager;
    @Getter
    private SwordListener swordListener;

    @Override
    public void onDisable() {
        super.onDisable();
        HandlerList.unregisterAll(this.swordListener);
    }

    @Override
    public void onEnable() {
        fireSwords = this;
        super.onEnable();
        this.iniServerHandlers();
    }

    private void iniServerHandlers() {
        this.swordListener = new SwordListener(fireSwords);
        this.listenersManager = new ListenersManager(fireSwords, getServer());
        this.commandsManager = new CommandsManager(fireSwords);
    }
}
