package src.Commands;
import Logger.Logger;

public class Command {
    protected Logger logger;

    public Command() {
        logger = new Logger();
    }

    public void execute() {return;}
}
