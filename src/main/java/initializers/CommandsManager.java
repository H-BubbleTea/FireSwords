package initializers;

import commands.GetSwordCommand;
import lombok.Getter;
import main.FireSwords;

import java.util.Objects;

public class CommandsManager {

    @Getter
    private GetSwordCommand getSwordCommand;

    private final FireSwords fireSwords;

    public CommandsManager(FireSwords plugin) {
        this.fireSwords = plugin;
        this.initCommands();
        this.registerCommands();
    }

    private void initCommands() {
        this.getSwordCommand = new GetSwordCommand(this.fireSwords);
    }

    private void registerCommands() {
        Objects.requireNonNull(this.fireSwords.getCommand("getSword")).setExecutor(this.getSwordCommand);
    }
}

