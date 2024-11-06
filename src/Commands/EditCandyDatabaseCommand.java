package Commands;

import Commands.ECD.*;
import Menu.EditCandyDatabaseMenu;

import java.util.Scanner;

public class EditCandyDatabaseCommand extends Command {
    public EditCandyDatabaseCommand() {
        super();
    }

    @Override
    public void execute() {
        EditCandyDatabaseMenu ECDMenu = new EditCandyDatabaseMenu();

        ECDMenu.addCommand("0", new ShowECDMenuCommand());
        ECDMenu.addCommand("1", new CreateNewDatabase());
        ECDMenu.addCommand("2", new AddNewCandyToDatabase());
        ECDMenu.addCommand("3", new EditCandyInfo());
        ECDMenu.addCommand("4", new DeleteCandyFromDatabase());

        Scanner scanner = new Scanner(System.in);
        String input;

        ECDMenu.executeCommand("0");

        while (true) {
            System.out.print("Enter command: ");
            input = scanner.nextLine();
            if (input.equals("5")) {
                this.logger.mainMenu();
                return;
            }
            ECDMenu.executeCommand(input);
        }
    }
}
