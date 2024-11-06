package src.Logger;

public class Logger {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK = "\u001B[40m";
    public static final String PURPLE = "\u001B[41m";

    public static void mainMenu() {
        System.out.println(GREEN);
        System.out.println("***Меню***");
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

    public static void setNameGift() {
        System.out.println(BLUE);
        System.out.println("Назвіть новий подарунок: ");
        System.out.println(RESET);
    }

    public static void exit() {
        System.out.println(GREEN);
        System.out.println("До побачення!");
        System.out.println(RESET);
    }
}
