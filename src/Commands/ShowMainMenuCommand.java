package Commands;

import Logger.Logger;

public class ShowMainMenuCommand {
    public ShowMainMenuCommand() {
        super();
    }

    public static void execute() {
        Logger.mainMenu();
    }
}
