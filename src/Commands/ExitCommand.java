package Commands;


public class ExitCommand extends Command {

    public ExitCommand() {
        super();
    }

    @Override
    public void execute() {
        System.out.println("До побачення!");
        System.exit(0);
    }
}
