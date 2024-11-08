package Logger;

public class Logger {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String LIGHT_GREEN = "\u001B[92m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String WHITE = "\u001B[37m";

    public static void start() {
        System.out.println("Type '0' to show the menu.");
    }

    public static void createStartCandy() {
        System.out.println("Створити пару стартових цукерок? (true / false)");
    }

    public static void toStop() {
        System.out.println("Для закінчення введіть 'end'.");
    }

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
        System.out.println("5. Вивести список цукерок");
        System.out.println("6. Редагувати список цукерок");
        System.out.println("7. Довідка");
        System.out.println("8. Вихід");
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


    public static void editCandyListMenu() {
        System.out.println(LIGHT_GREEN);
        System.out.println("***Меню редагування списку цукерок***");
        System.out.println("1. Створити новий список цукерок");
        System.out.println("2. Добавити нову цукерку в список");
        System.out.println("3. Змінити інформацію про цукерку");
        System.out.println("4. Видалити цукерку зі списку");
        System.out.println("5. Вихід");
        System.out.println(RESET);
    }

    public static void newCandyListWasCreated() {
        System.out.println("Новий список цукерок створено.");
    }

    public static void getCandyName() {
        System.out.print("Введіть назву цукерки: ");
    }

    public static void getCandyBrand() {
        System.out.print("Введіть назву бренду: ");
    }

    public static void getCandyType() {
        System.out.println("Грильяж, Шоколадна, Драже, Жувальна, Желейна, Льодяник, Пастила, Ірис, Вафельна.");
        System.out.print("Введіть тип цукерки зі списку: ");
    }

    public static void getCandyShape() {
        System.out.print("Введіть форму цукерки: ");
    }

    public static void getCandyPackageType() {
        System.out.print("Введіть тип пакунку: ");
    }

    public static void getCandyWeight() {
        System.out.print("Введіть вагу: ");
    }

    public static void getCandyCalorieContent() {
        System.out.print("Введіть калорійність: ");
    }

    public static void getCandySugarContent() {
        System.out.print("Введіть вмістимість цукру: ");
    }

    public static void getCandyHypoallergenic() {
        System.out.print("Ця цукерка викликає алергічні реакції? (true / false): ");
    }

    public static void getCandyFilling() {
        System.out.print("Введіть наповнювач: ");
    }

    public static void getCandyAdditives() {
        System.out.print("Введіть добавку: ");
    }

    public static void getCandyFlavors() {
        System.out.print("Введіть ароматизатор: ");
    }

    public static void candyThisTypeNotExist() {
        System.out.println("Цукерки такого типу добавити не можна. Повторіть ввдення");
    }



    public static void reference() {
        System.out.println(WHITE);
        System.out.println("доробити");
        System.out.println(RESET);
    }

    public static void enterCommand() {
        System.out.print("Enter command: ");
    }

    public static void unknownCommand() {
        System.out.println("Unknown command");
    }

    public static void exit() {
        System.out.println(GREEN);
        System.out.println("До побачення!");
        System.out.println(RESET);
    }
}
