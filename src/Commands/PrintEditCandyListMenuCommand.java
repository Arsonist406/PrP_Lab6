package Commands;

import Commands.ECL.*;

import Candy.*;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintEditCandyListMenuCommand extends Command {
    private ArrayList<Candy> candyList;

    public PrintEditCandyListMenuCommand(ArrayList<Candy> candyList) {
        super();
        this.candyList = candyList;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String input;

        ShowECLMenuCommand command1 = new ShowECLMenuCommand();

        while (true) {
            command1.execute();
            System.out.print("Введіть команду: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    CreateNewList command2 = new CreateNewList(candyList);
                    command2.execute();
                    break;
                case "2":
                    AddNewCandyToList command3 = new AddNewCandyToList(candyList);
                    command3.execute();
                    break;
                case "3":
                    if (candyList.isEmpty()) {
                        System.out.println("Список цукерок пустий.");
                        break;
                    }
                    EditCandyInfo command4 = new EditCandyInfo(candyList);
                    command4.execute();
                    break;
                case "4":
                    if (candyList.isEmpty()) {
                        System.out.println("Список цукерок пустий.");
                        break;
                    }
                    DeleteCandyFromList command5 = new DeleteCandyFromList(candyList);
                    command5.execute();
                    break;
                case "5":
                    if (candyList.isEmpty()) {
                        System.out.println("Список цукерок пустий.");
                        break;
                    }
                    PrintCandyListCommand command7 = new PrintCandyListCommand(candyList);
                    command7.execute();
                    break;
                case "6":
                    return;
                default:
                    System.out.println("Невідома команда");
            }
        }
    }
}
