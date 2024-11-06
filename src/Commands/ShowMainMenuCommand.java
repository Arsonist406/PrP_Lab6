package Commands;

public class ShowMainMenuCommand extends Command {
    public ShowMainMenuCommand() {
        super();
    }

    @Override
    public void execute() {
        this.logger.mainMenu();
    }
}
