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

        editCandyListMenu();

        while (true) {
            System.out.print("Enter command: ");
            input = scanner.nextLine();

            switch (input) {
                case "0":
                    ShowECLMenuCommand command1 = new ShowECLMenuCommand();
                    command1.execute();
                    break;
                case "1":
                    CreateNewList command2 = new CreateNewList(candyList);
                    command2.execute();
                    break;
                case "2":
                    AddNewCandyToList command3 = new AddNewCandyToList(candyList);
                    command3.execute();
                    break;
                case "3":
                    EditCandyInfo command4 = new EditCandyInfo(candyList);
                    command4.execute();
                    break;
                case "4":
                    DeleteCandyFromList command5 = new DeleteCandyFromList(candyList);
                    command5.execute();
                    break;
                case "5":
                    ShowMainMenuCommand command6 = new ShowMainMenuCommand();
                    command6.execute();
                    return;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    public static void editCandyListMenu() {
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";
        String LIGHT_GREEN = "\u001B[92m";

        System.out.print(RED + "*" + RESET);
        System.out.print(BLUE + "*" + RESET);
        System.out.print(YELLOW + "*" + RESET);

        System.out.println(LIGHT_GREEN);
        System.out.println("Меню редагування списку цукерок");
        System.out.println(RESET);

        System.out.print(YELLOW + "*" + RESET);
        System.out.print(BLUE + "*" + RESET);
        System.out.print(RED + "*" + RESET);

        System.out.println(LIGHT_GREEN);
        System.out.println("1. Створити новий список цукерок");
        System.out.println("2. Добавити нову цукерку в список");
        System.out.println("3. Змінити інформацію про цукерку");
        System.out.println("4. Видалити цукерку зі списку");
        System.out.println("5. Вихід");
        System.out.println(RESET);
    }
}
