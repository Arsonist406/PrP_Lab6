package Commands;


public class ShowMainMenuCommand extends Command {
    public ShowMainMenuCommand() {
        super();
    }

    @Override
    public void execute() {
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";
        String LIGHT_GREEN = "\u001B[92m";

        System.out.print(RED + "*" + RESET);
        System.out.print(BLUE + "*" + RESET);
        System.out.print(YELLOW + "*" + RESET);

        System.out.print(LIGHT_GREEN);
        System.out.print("Меню");
        System.out.print(RESET);

        System.out.print(YELLOW + "*" + RESET);
        System.out.print(BLUE + "*" + RESET);
        System.out.print(RED + "*" + RESET);

        System.out.println(LIGHT_GREEN);
        System.out.println("1. Створити новорічний подарунок");
        System.out.println("2. Вивести новорічний подарунок");
        System.out.println("3. Знайти цукерку в новорічному подарунку за заданим діапазоном цукру");
        System.out.println("4. Вивести список цукерок");
        System.out.println("5. Редагувати список цукерок");
        System.out.println("6. Вихід");
        System.out.println(RESET);
    }
}
