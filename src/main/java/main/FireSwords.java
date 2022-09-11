package main;

import initializers.InitCommands;
import org.bukkit.plugin.java.JavaPlugin;

public final class FireSwords extends JavaPlugin {

    static private FireSwords fireSwords;
    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onEnable() {
        fireSwords = this;
        super.onEnable();
        new InitCommands(fireSwords);
    }
}
