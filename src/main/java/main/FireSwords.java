package main;

import initializers.CommandsManager;
import initializers.ListenersManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class FireSwords extends JavaPlugin {

    static private FireSwords fireSwords;

    @Getter
    private ListenersManager listenersManager;
    @Getter
    private CommandsManager commandsManager;

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        fireSwords = this;
        super.onEnable();
        this.iniServerHandlers();
    }

    private void iniServerHandlers() {
        this.listenersManager = new ListenersManager(fireSwords, getServer());
        this.commandsManager = new CommandsManager(fireSwords);
    }
}
