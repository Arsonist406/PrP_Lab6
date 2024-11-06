package Commands.ECD;

import Commands.Command;

public class ShowECDMenuCommand extends Command {
    public ShowECDMenuCommand() {
        super();
    }

    @Override
    public void execute() {
        this.logger.editCandyDataBaseMenu();
    }
}
