import Candy.*;
import Function.ReadFromFile;
import Gift.*;
import Commands.*;

import java.util.ArrayList;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        ArrayList<Candy> candyList = new ArrayList();
        Gift gift = new Gift(null);

        createStartCandy(candyList);
        System.out.println("Type '0' to show the menu.");

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter command: ");
            input = scanner.nextLine();

            switch (input) {
                case "0":
                    ShowMainMenuCommand command1 = new ShowMainMenuCommand();
                    command1.execute();
                    break;
                case "1":
                    CreateGiftCommand command2 = new CreateGiftCommand(gift, candyList);
                    command2.execute();
                    break;
                case "2":
                    PrintGiftCommand command3 = new PrintGiftCommand(gift);
                    command3.execute();
                    break;
                case "3":
                    FindCandyBySugarContentCommand command4 = new FindCandyBySugarContentCommand(gift);
                    command4.execute();
                    break;
                case "4":
                    PrintCandyListCommand command5 = new PrintCandyListCommand(candyList);
                    command5.execute();
                    break;
                case "5":
                    PrintEditCandyListMenuCommand command6 = new PrintEditCandyListMenuCommand(candyList);
                    command6.execute();
                    break;
                case "6":
                    ExitCommand command7 = new ExitCommand();
                    command7.execute();
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    public static void createStartCandy(ArrayList<Candy> candyList) {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Створити пару стартових цукерок? (true / false)");
        Boolean temp = scanner2.nextBoolean();

        String path = "D:\\Шарага\\Проекти на джаві\\PrP_Lab5\\src\\candys";

        if (temp) {
            ReadFromFile func = new ReadFromFile(path, candyList);
            func.readFile();
        }
    }
}
