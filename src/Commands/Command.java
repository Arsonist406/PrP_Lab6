package Commands;

import Logger.Logger;

public class Command {
    protected static Logger logger;

    public static void execute() {return;}

    public boolean isCreateGift() {
        if (this instanceof CreateGiftCommand) {
            return true;
        }
        return false;
    }
}
