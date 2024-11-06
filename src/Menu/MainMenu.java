package Menu;

import Commands.Command;

import java.util.HashMap;
import java.util.Map;

public class MainMenu {
    private Map<String, Command> commands;

    public MainMenu() {
        this.commands  = new HashMap<>();
    }

    public void addCommand(String key, Command command) {
        commands.put(key, command);
    }

    public void executeCommand(String key) {
        Command command = commands.get(key);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Unknown command");
        }
    }
}