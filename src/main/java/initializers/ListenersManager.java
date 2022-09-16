package initializers;

import lombok.Getter;
import main.FireSwords;
import org.bukkit.Server;
import swords.swordBase.FireSwordHitListener;


public class ListenersManager {

    private final FireSwords fireSwords;
    private final Server server;
    @Getter
    private FireSwordHitListener fireSwordHitListener;

    public ListenersManager(FireSwords fireSwords, Server server) {
        this.fireSwords = fireSwords;
        this.server = server;
        this.initListeners();
        this.registerListeners();
    }

    private void initListeners() {
        this.fireSwordHitListener = new FireSwordHitListener(fireSwords);
    }

    private void registerListeners() {

    }
}
