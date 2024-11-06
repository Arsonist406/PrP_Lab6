import Commands.*;
import Menu.*;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        MainMenu menu = new MainMenu();

        menu.addCommand("0", new ShowMainMenuCommand());
        menu.addCommand("1", new CreateGiftCommand());
        menu.addCommand("2", new PrintGiftCommand());
        menu.addCommand("3", new EditGiftCommand());
        menu.addCommand("4", new FindCandyCommand());
        menu.addCommand("5", new PrintCandyDatabaseCommand());
        menu.addCommand("6", new EditCandyDatabaseCommand());
        menu.addCommand("7", new PrintReferenceCommand());
        menu.addCommand("8", new ExitCommand());

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Type '0' to show the menu.");

        while (true) {
            System.out.print("Enter command: ");
            input = scanner.nextLine();
            menu.executeCommand(input);
        }
    }
}
