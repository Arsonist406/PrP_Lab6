package Commands.ECL;

import Commands.Command;

public class ShowECLMenuCommand extends Command {
    public ShowECLMenuCommand() {
        super();
    }

    @Override
    public static void execute() {
        this.logger.editCandyDataBaseMenu();
    }
}
