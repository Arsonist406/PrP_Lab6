package Commands;

public class ShowMainMenuCommand extends Command {
    public ShowMainMenuCommand() {
        super();
    }

    @Override
    public static void execute() {
        this.logger.mainMenu();
    }
}
