package Commands;

import Commands.ECL.*;

import java.util.Scanner;

public class EditCandyListCommand extends Command {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        String input;

        logger.editCandyListMenu();

        while (true) {
            logger.enterCommand();
            input = scanner.nextLine();

            switch (input) {
                case "0":
                    ShowECLMenuCommand.execute();
                    break;
                case "1":
                    CreateNewList.execute();
                    break;
                case "2":
                    AddNewCandyToList.execute();
                    break;
                case "3":
                    EditCandyInfo.execute();
                    break;
                case "4":
                    DeleteCandyFromList.execute();
                    break;
                case "5":
                    logger.mainMenu();
                    return;
                default:
                    logger.unknownCommand();
            }
        }
    }
}
