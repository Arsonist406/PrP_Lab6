package Commands;

import Commands.ECL.*;

import Candy.*;
import Logger.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintEditCandyListMenuCommand {

    public static void execute(ArrayList<Candy> candyList) {
        Scanner scanner = new Scanner(System.in);
        String input;

        Logger.editCandyListMenu();

        while (true) {
            Logger.enterCommand();
            input = scanner.nextLine();

            switch (input) {
                case "0":
                    ShowECLMenuCommand.execute();
                    break;
                case "1":
                    CreateNewList.execute(candyList);
                    break;
                case "2":
                    AddNewCandyToList.execute(candyList);
                    break;
                case "3":
                    EditCandyInfo.execute(candyList);
                    break;
                case "4":
                    DeleteCandyFromList.execute(candyList);
                    break;
                case "5":
                    Logger.mainMenu();
                    return;
                default:
                    Logger.unknownCommand();
            }
        }
    }
}
