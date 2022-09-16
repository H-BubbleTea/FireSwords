package main;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import initializers.CommandsManager;
import initializers.ListenersManager;
import initializers.ProtocolibPacketListenersManager;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class FireSwords extends JavaPlugin {

    static private FireSwords fireSwords;
    @Getter
    private ListenersManager listenersManager;
    @Getter
    private CommandsManager commandsManager;
    @Getter
    private ProtocolibPacketListenersManager protocolibPacketListenersManager;
    @Getter
    private ProtocolManager protocolManager;
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
        this.protocolManager = ProtocolLibrary.getProtocolManager();
        this.protocolibPacketListenersManager = new ProtocolibPacketListenersManager(fireSwords);
        this.listenersManager = new ListenersManager(fireSwords, getServer());
        this.commandsManager = new CommandsManager(fireSwords);

    }
}
