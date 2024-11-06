package Commands.EG;

import Commands.Command;

public class ShowEGMenuCommand extends Command {
    public ShowEGMenuCommand() {
        super();
    }

    @Override
    public void execute() {
        this.logger.editGiftMenu();
    }
}
