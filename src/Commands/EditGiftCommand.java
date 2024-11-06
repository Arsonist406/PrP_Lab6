package Commands;

import Commands.EG.*;
import Menu.EditGiftMenu;

import java.util.Scanner;

public class EditGiftCommand extends Command {
    public EditGiftCommand() {
        super();
    }

    @Override
    public void execute() {
        EditGiftMenu EGMenu = new EditGiftMenu();

        EGMenu.addCommand("0", new ShowEGMenuCommand());
        EGMenu.addCommand("1", new AddCandyToGift());
        EGMenu.addCommand("2", new DeleteGift());

        Scanner scanner = new Scanner(System.in);
        String input;

        EGMenu.executeCommand("0");

        while (true) {
            System.out.print("Enter command: ");
            input = scanner.nextLine();
            if (input.equals("3")) {
                this.logger.mainMenu();
                return;
            }
            EGMenu.executeCommand(input);
        }
    }
}
