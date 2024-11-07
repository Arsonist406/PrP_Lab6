package Commands;

public class PrintReferenceCommand extends Command {
    public PrintReferenceCommand() {
        super();
    }

    @Override
    public static void execute() {
        this.logger.reference();
    }
}
