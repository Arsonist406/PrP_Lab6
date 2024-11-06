package Logger;

public class Logger {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String LIGHT_GREEN = "\u001B[92m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK = "\u001B[40m";
    public static final String PURPLE = "\u001B[41m";

    public static void mainMenu() {
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

    public static void setNameGift() {
        System.out.println(BLUE);
        System.out.println("Назвіть новий подарунок: ");
        System.out.println(RESET);
    }

    public static void editGiftMenu() {
        System.out.println(LIGHT_GREEN);
        System.out.println("***Меню редагування подарунку***");
        System.out.println("1. Добавити цукерку в подарунок");
        System.out.println("2. Видалити подарунок");
        System.out.println("3. Вихід");
        System.out.println(RESET);
    }

    public static void editCandyDataBaseMenu() {
        System.out.println(LIGHT_GREEN);
        System.out.println("***Меню редагування бази даних цукерок***");
        System.out.println("1. Створити нову базу даних цукерок");
        System.out.println("2. Добавити нову цукерку в базу даних");
        System.out.println("3. Змінити інформацію про цукерку");
        System.out.println("4. Видалити цукерку з бази даних");
        System.out.println("5. Вихід");
        System.out.println(RESET);
    }

    public static void exit() {
        System.out.println(GREEN);
        System.out.println("До побачення!");
        System.out.println(RESET);
    }
}
