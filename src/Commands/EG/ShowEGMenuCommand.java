package Commands.EG;

import Commands.Command;

public class ShowEGMenuCommand extends Command {
    public ShowEGMenuCommand() {
        super();
    }

    @Override
    public static void execute() {
        this.logger.editGiftMenu();
    }
}
