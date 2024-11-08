import Candy.*;
import Gift.Gift;
import Commands.*;
import Logger.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws IllegalAccessException {
        ArrayList<Candy> candyList = new ArrayList();
        Gift gift = new Gift(null);

        createStartCandy(candyList);
        Logger.start();

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            Logger.enterCommand();
            input = scanner.nextLine();

            switch (input) {
                case "0":
                    ShowMainMenuCommand.execute();
                    break;
                case "1":
                    CreateGiftCommand.execute(gift, candyList);
                    break;
                case "2":
                    PrintGiftCommand.execute();
                    break;
                case "3":
                    PrintEditGiftMenuCommand.execute();
                    break;
                case "4":
                    FindCandyByNameCommand.execute(candyList);
                    break;
                case "5":
                    PrintCandyListCommand.execute(candyList);
                    break;
                case "6":
                    PrintEditCandyListMenuCommand.execute(candyList);
                    break;
                case "7":
                    PrintReferenceCommand.execute();
                    break;
                case "8":
                    ExitCommand.execute();
                    break;
                default:
                    Logger.unknownCommand();
            }
        }
    }

    public static void createStartCandy(ArrayList<Candy> candyList) {
        Scanner scanner2 = new Scanner(System.in);
        Logger.createStartCandy();
        Boolean temp = scanner2.nextBoolean();
        if (temp) {
            candyList.add(new Jelly("Шалена Бджілка", "Roshen", "Прямокутник",
                    "Поліетилен", 8, 318, 65.5, false,
                    "Фруктовий сік", "-", "Фрукти"));

            candyList.add(new Chocolate("Зоряне Сяйво", "Світоч", "Конус",
                    "Фольга", 13, 497, 49, false,
                    "-", "Вафельна посипка", "Арахіс"));

            candyList.add(new Lollipop("Плюсик", "Roshen", "Еліпсоїд",
                    "Поліетилен", 10, 392, 63.8, true,
                    "-", "-", "Ментол"));
        }
    }
}
