package initializers;

import lombok.Getter;
import main.FireSwords;
import org.bukkit.Server;
import swords.listeners.FireSwordListener;

public class ListenersManager {

    @Getter
    private FireSwordListener fireSwordListener;

    private final FireSwords fireSwords;

    private final Server server;

    public ListenersManager(FireSwords fireSwords, Server server) {
        this.fireSwords = fireSwords;
        this.server = server;
        this.initListeners();
        this.registerListeners();
    }

    private void initListeners() {
        this.fireSwordListener = new FireSwordListener(this.fireSwords);
    }

    private void registerListeners() {
        this.server.getPluginManager().registerEvents(this.fireSwordListener, this.fireSwords);
    }
}
