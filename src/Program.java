import Commands.*;
import Gift.Gift;
import Logger.*;

import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Map<String, Gift> gifts;
        Logger logger = new Logger();

        Scanner scanner = new Scanner(System.in);
        String input;

        logger.start();

        while (true) {
            logger.enterCommand();
            input = scanner.nextLine();

            switch (input) {
                case "0":
                    ShowMainMenuCommand.execute();
                    break;
                case "1":
                    CreateGiftCommand.execute();
                    break;
                case "2":
                    PrintGiftCommand.execute();
                    break;
                case "3":
                    EditGiftCommand.execute();
                    break;
                case "4":
                    FindCandyCommand.execute();
                    break;
                case "5":
                    PrintCandyListCommand.execute();
                    break;
                case "6":
                    EditCandyListCommand.execute();
                    break;
                case "7":
                    PrintReferenceCommand.execute();
                    break;
                case "8":
                    ExitCommand.execute();
                    break;
                default:
                    logger.unknownCommand();
            }
        }
    }
}
