package Commands;

import Commands.ECL.*;

import Candy.*;
import Logger.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrintEditCandyListMenuCommand extends Command {
    private ArrayList<Candy> candyList;

    public PrintEditCandyListMenuCommand(ArrayList<Candy> candyList) {
        super();
        this.candyList = candyList;
    }

    @Override
    public void execute() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input;

        ShowECLMenuCommand command1 = new ShowECLMenuCommand();

        while (true) {
            command1.execute();
            System.out.print("Введіть команду: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    CreateNewListCommand command2 = new CreateNewListCommand(candyList);
                    command2.execute();

                    Logger log1 = new Logger("Створено новий список цукерок.");
                    log1.log();

                    break;
                case "2":
                    Scanner scanner5 = new Scanner(System.in);
                    AddNewCandyToListCommand command3 = new AddNewCandyToListCommand(candyList, scanner5);
                    command3.execute();

                    Logger log2 = new Logger("До списку цукерок добавлено нову цукеру.");
                    log2.log();

                    break;
                case "3":
                    if (candyList.isEmpty()) {
                        System.out.println("Список цукерок пустий.");
                        break;
                    }
                    EditCandyInfoCommand command4 = new EditCandyInfoCommand(candyList);
                    command4.execute();

                    Logger log3 = new Logger("Змінено інформацію про цукерку.");
                    log3.log();

                    break;
                case "4":
                    if (candyList.isEmpty()) {
                        System.out.println("Список цукерок пустий.");
                        break;
                    }
                    DeleteCandyFromListCommand command5 = new DeleteCandyFromListCommand(candyList);
                    command5.execute();

                    Logger log4 = new Logger("Зі списку цукерок видалено цукерку.");
                    log4.log();

                    break;
                case "5":
                    if (candyList.isEmpty()) {
                        System.out.println("Список цукерок пустий.");
                        break;
                    }
                    PrintCandyListCommand command7 = new PrintCandyListCommand(candyList);
                    command7.execute();

                    Logger log5 = new Logger("Список цукерок виведенно в консоль.");
                    log5.log();

                    break;
                case "6":
                    return;
                default:
                    System.out.println("Невідома команда");
            }
        }
    }
}
