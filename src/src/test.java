package src;

public class test {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";

    public static void menuForUser() {
        System.out.println(GREEN);
        System.out.println("***Меню***");
        System.out.println("1. Створити новорічний подарунок");
        System.out.println("2. Вивести новорічний подарунок");
        System.out.println("3. Редагувати новорічний подарунок");
        System.out.println("4. Знайти цукерку в новорічному подарунку");
        System.out.println("5. Вивести базу даних цукерок");
        System.out.println("6. Редагувати базу даних цукерок");
        System.out.println(RESET);
    }

    public static void main(String[] args) {
        test.menuForUser();
    }
}
