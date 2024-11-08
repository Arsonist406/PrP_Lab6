package Commands;

import Commands.EG.*;

import java.util.Scanner;

public class EditGiftCommand extends Command {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        String input;

        logger.editGiftMenu();

        while (true) {
            logger.enterCommand();
            input = scanner.nextLine();

            switch (input) {
                case "0":
                    ShowEGMenuCommand.execute();
                    break;
                case "1":
                    AddCandyToGift.execute();
                    break;
                case "2":
                    DeleteGift.execute();
                    break;
                case "3":
                    logger.mainMenu();
                    return;
                default:
                    logger.unknownCommand();
            }
        }
    }
}
