import Candy.*;
import Gift.Gift;
import Commands.*;
import Logger.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<Candy> candyList = new ArrayList();
        Map<String, Gift> gift = new HashMap();

        createStartCandy(candyList);

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
                    CreateGiftCommand.execute();
                    break;
                case "2":
                    PrintGiftCommand.execute();
                    break;
                case "3":
                    PrintEditGiftMenuCommand.execute();
                    break;
                case "4":
                    FindCandyCommand.execute();
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
        Logger.start();
        Logger.createStartCandy();
        Boolean temp = scanner2.nextBoolean();
        if (temp) {
            candyList.add(new Jelly("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник",
                    "Поліетилен", 8F, 318F, 65.5F, false,
                    "Фруктовий сік", "-", "Фрукти"));

            candyList.add(new Chocolate("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус",
                    "Фольга", 13F, 497F, 49F, false,
                    "-", "Вафельна посипка", "Арахіс"));

            candyList.add(new Lollipop("Плюсик", "Roshen", "Льодяник", "Еліпсоїд",
                    "Поліетилен", 10F, 392F, 63.8F, true,
                    "-", "-", "Ментол"));
        }
    }
}
