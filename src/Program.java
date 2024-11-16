import Candy.*;
import ErrorMailer.ErrorMailer;
import Function.ReadFromFile;
import Gift.*;
import Commands.*;
import Logger.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public void main(String[] args) {
        try {
            ArrayList<Candy> candyList = new ArrayList<>();
            Gift gift = new Gift("-");
            Scanner scanner = new Scanner(System.in);
            String input;

            Logger log1 = new Logger("***Програму запущено***");
            log1.log();

            createStartCandy(candyList);

            ShowMainMenuCommand command1 = new ShowMainMenuCommand();

            while (true) {
                command1.execute();
                System.out.print("Введіть команду: ");
                input = scanner.nextLine();

                switch (input) {
                    case "1":
                        CreateGiftCommand command2 = new CreateGiftCommand(gift, candyList);
                        command2.execute();

                        Logger log2 = new Logger("Створено подарунок.");
                        log2.log();

                        break;
                    case "2":
                        if (gift.getListOfCandies().isEmpty()) {
                            System.out.println("Подарунок не створений.");
                            break;
                        }
                        PrintGiftCommand command3 = new PrintGiftCommand(gift);
                        command3.execute();

                        Logger log3 = new Logger("Виведено подарунок в консоль.");
                        log3.log();

                        break;
                    case "3":
                        if (gift.getListOfCandies().isEmpty()) {
                            System.out.println("Подарунок не створений.");
                            break;
                        }
                        FindCandyBySugarContentCommand command4 = new FindCandyBySugarContentCommand(gift);
                        command4.execute();

                        Logger log4 = new Logger("Виведено цукерку з подарунку з заданого діапазону цукру.");
                        log4.log();

                        break;
                    case "4":
                        if (candyList.isEmpty()) {
                            System.out.println("Список цукерок пустий.");
                            break;
                        }
                        PrintCandyListCommand command5 = new PrintCandyListCommand(candyList);
                        command5.execute();

                        Logger log5 = new Logger("Виведено список цукерок.");
                        log5.log();

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

                        Logger log6 = new Logger("Відсортовано цукерки в подарунку.");
                        log6.log();

                        break;
                    case "7":
                        Logger log7 = new Logger("***Програму завершено***");
                        log7.log();

                        ExitCommand command7 = new ExitCommand();
                        command7.execute();
                        break;
                    default:
                        System.out.println("Невідома команда");
                }
            }
        } catch (Exception e) {
            ErrorMailer mailer = new ErrorMailer(e.getMessage());
            mailer.sendErrorNotification();

            System.out.println("Помилка: " + e.getMessage());

            try {
                Logger log1 = new Logger("Помилка: " + e.getMessage());
                log1.log();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public void createStartCandy(ArrayList<Candy> candyList) {
        try {
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

            String path = "candys";

            if (temp2) {
                ReadFromFile func = new ReadFromFile(path, candyList);
                func.readFile();

                Logger log1 = new Logger("Стартові цукерки створено");
                log1.log();
            } else {
                Logger log1 = new Logger("Стартові цукерки НЕ створено");
                log1.log();
            }

        } catch (Exception e) {
            ErrorMailer mailer = new ErrorMailer(e.getMessage());
            mailer.sendErrorNotification();

            System.out.println("Помилка: " + e.getMessage());

            try {
                Logger log1 = new Logger("Помилка: " + e.getMessage());
                log1.log();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
