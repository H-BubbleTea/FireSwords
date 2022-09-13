package initializers;

import main.FireSwords;
import org.bukkit.Server;


public class ListenersManager {


    private final FireSwords fireSwords;

    private final Server server;

    public ListenersManager(FireSwords fireSwords, Server server) {
        this.fireSwords = fireSwords;
        this.server = server;
        this.initListeners();
        this.registerListeners();
    }

    private void initListeners() {

    }

    private void registerListeners() {

    }
}
