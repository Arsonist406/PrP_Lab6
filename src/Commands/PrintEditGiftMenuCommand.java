package Commands;

import Commands.EG.*;
import Logger.Logger;

import java.util.Scanner;

public class PrintEditGiftMenuCommand {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        String input;

        Logger.editGiftMenu();

        while (true) {
            Logger.enterCommand();
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
                    Logger.mainMenu();
                    return;
                default:
                    Logger.unknownCommand();
            }
        }
    }
}
