package Logger;

public class Logger {
    public String RESET;
    public String RED;
    public String GREEN;
    public String LIGHT_GREEN;
    public String YELLOW;
    public String BLUE;
    public String WHITE;

    public Logger() {
        RESET = "\u001B[0m";
        RED = "\u001B[31m";
        GREEN = "\u001B[32m";
        LIGHT_GREEN = "\u001B[92m";
        YELLOW = "\u001B[33m";
        BLUE = "\u001B[34m";
        WHITE = "\u001B[37m";
    }

    public void start() {
        System.out.println("Type '0' to show the menu.");
    }

    public void mainMenu() {
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
        System.out.println("3. Редагувати новорічний подарунок");
        System.out.println("4. Знайти цукерку в новорічному подарунку");
        System.out.println("5. Вивести базу даних цукерок");
        System.out.println("6. Редагувати базу даних цукерок");
        System.out.println("7. Довідка");
        System.out.println("8. Вихід");
        System.out.println(RESET);
    }

    public void setNameGift() {
        System.out.println(BLUE);
        System.out.println("Назвіть новий подарунок: ");
        System.out.println(RESET);
    }

    public void chooseCandy() {
        System.out.println(BLUE);
        System.out.println("Введіть через enter номери цукерок зі списку, які ви хочете добавити в подарунок.");
        System.out.println("Для закінчення введіть '0'.");
        System.out.println(RESET);
    }

    public void editGiftMenu() {
        System.out.println(LIGHT_GREEN);
        System.out.println("***Меню редагування подарунку***");
        System.out.println("1. Добавити цукерку в подарунок");
        System.out.println("2. Видалити подарунок");
        System.out.println("3. Вихід");
        System.out.println(RESET);
    }

    public void editCandyListMenu() {
        System.out.println(LIGHT_GREEN);
        System.out.println("***Меню редагування бази даних цукерок***");
        System.out.println("1. Створити нову базу даних цукерок");
        System.out.println("2. Добавити нову цукерку в базу даних");
        System.out.println("3. Змінити інформацію про цукерку");
        System.out.println("4. Видалити цукерку з бази даних");
        System.out.println("5. Вихід");
        System.out.println(RESET);
    }

    public void reference() {
        System.out.println(WHITE);
        System.out.println("");
        System.out.println(RESET);
    }

    public void enterCommand() {
        System.out.print("Enter command: ");
    }

    public void unknownCommand() {
        System.out.println("Unknown command");
    }

    public void exit() {
        System.out.println(GREEN);
        System.out.println("До побачення!");
        System.out.println(RESET);
    }
}
