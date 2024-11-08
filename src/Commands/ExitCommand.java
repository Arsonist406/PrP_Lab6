package Commands;

import Logger.Logger;

public class ExitCommand {

    public static void execute() {
        Logger.exit();
        System.exit(0);
    }
}
