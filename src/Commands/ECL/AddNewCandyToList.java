package Commands.ECL;

import Candy.*;
import Logger.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewCandyToList {
    public static void execute(ArrayList<Candy> candyList) {
        Scanner scanner = new Scanner(System.in);

        Logger.getCandyName();
        String name = scanner.nextLine();

        Logger.getCandyBrand();
        String brand = scanner.nextLine();

        Logger.getCandyType();
        String type = scanner.nextLine();

        Logger.getCandyShape();
        String shape = scanner.nextLine();

        Logger.getCandyPackageType();
        String packageType = scanner.nextLine();

        Logger.getCandyWeight();
        float weight = scanner.nextFloat();

        Logger.getCandyCalorieContent();
        float calorieContent = scanner.nextFloat();

        Logger.getCandySugarContent();
        float sugarContent = scanner.nextFloat();

        Logger.getCandyHypoallergenic();
        boolean hypoallergenic = !scanner.nextBoolean();

        Scanner scanner2 = new Scanner(System.in);

        Logger.getCandyFilling();
        String filling = scanner2.nextLine();

        Logger.getCandyAdditives();
        String additives = scanner2.nextLine();

        Logger.getCandyFlavors();
        String flavors = scanner2.nextLine();

        switch (type) {
            case "Грильяж", "грильяж":
                candyList.add(new Brittle(name, brand, type, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Шоколадна", "шоколадна":
                candyList.add(new Chocolate(name, brand, type, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Драже", "драже":
                candyList.add(new Dragee(name, brand, type, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Жувальна", "жувальна":
                candyList.add(new Gum(name, brand, type, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Желейна", "желейна":
                candyList.add(new Jelly(name, brand, type, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Льодяник", "льодяник":
                candyList.add(new Lollipop(name, brand, type, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Пастила", "пастила":
                candyList.add(new Pastila(name, brand, type, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Ірис", "ірис":
                candyList.add(new Toffe(name, brand, type, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Вафельна", "вафельна":
                candyList.add(new Waffle(name, brand, type, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            default:
                Logger.candyThisTypeNotExist();
                break;
        }
    }
}
