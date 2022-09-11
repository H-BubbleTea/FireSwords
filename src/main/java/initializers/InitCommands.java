package initializers;

import commands.GetSwordCommand;
import main.FireSwords;

import java.util.Objects;

public class InitCommands {

    public InitCommands(FireSwords plugin) {
        Objects.requireNonNull(plugin.getCommand("getSword")).setExecutor(new GetSwordCommand(plugin));
    }

}

