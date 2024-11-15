import Candy.*;
import Function.ReadFromFile;
import Gift.*;
import Commands.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        ArrayList<Candy> candyList = new ArrayList();
        Gift gift = new Gift("-");

        createStartCandy(candyList);

        Scanner scanner = new Scanner(System.in);
        String input;

        ShowMainMenuCommand command1 = new ShowMainMenuCommand();

        while (true) {
            command1.execute();
            System.out.print("Введіть команду: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    CreateGiftCommand command2 = new CreateGiftCommand(gift, candyList);
                    command2.execute();
                    break;
                case "2":
                    if (gift.getListOfCandies().isEmpty()) {
                        System.out.println("Подарунок не створений.");
                        break;
                    }
                    PrintGiftCommand command3 = new PrintGiftCommand(gift);
                    command3.execute();
                    break;
                case "3":
                    FindCandyBySugarContentCommand command4 = new FindCandyBySugarContentCommand(gift);
                    command4.execute();
                    break;
                case "4":
                    if (candyList.isEmpty()) {
                        System.out.println("Список цукерок пустий.");
                        break;
                    }
                    PrintCandyListCommand command5 = new PrintCandyListCommand(candyList);
                    command5.execute();
                    break;
                case "5":
                    PrintEditCandyListMenuCommand command6 = new PrintEditCandyListMenuCommand(candyList);
                    command6.execute();
                    break;
                case "6":
                    if (gift.getListOfCandies().isEmpty()) {
                        System.out.println("Подарунок не створений.");
                        break;
                    }
                    SortGiftCommand command8 = new SortGiftCommand(gift);
                    command8.execute();
                    break;
                case "7":
                    ExitCommand command7 = new ExitCommand();
                    command7.execute();
                    break;
                default:
                    System.out.println("Невідома команда");
            }
        }
    }

    public static void createStartCandy(ArrayList<Candy> candyList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Створити пару стартових цукерок? (так / ні)");
        String temp;
        Boolean temp2;

        while (true) {
            temp = scanner.nextLine();
            if (temp.equals("так")) {
                temp2 = true;
                break;
            } else if (temp.equals("ні")) {
                temp2 = false;
                break;
            }
            System.out.println("Повторіть введення");
        }

        String path = "D:\\Шарага\\Проекти на джаві\\PrP_Lab5\\candys";

        if (temp2) {
            ReadFromFile func = new ReadFromFile(path, candyList);
            func.readFile();
        }
    }
}
