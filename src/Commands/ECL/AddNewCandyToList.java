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

        Scanner scanner2 = new Scanner(System.in);

        Logger.getCandyWeight();
        double weight = scanner2.nextFloat();

        Logger.getCandyCalorieContent();
        double calorieContent = scanner2.nextFloat();

        Logger.getCandySugarContent();
        double sugarContent = scanner2.nextFloat();

        Logger.getCandyHypoallergenic();
        boolean hypoallergenic = !scanner2.nextBoolean();

        Scanner scanner3 = new Scanner(System.in);

        Logger.getCandyFilling();
        String filling = scanner3.nextLine();

        Logger.getCandyAdditives();
        String additives = scanner3.nextLine();

        Logger.getCandyFlavors();
        String flavors = scanner3.nextLine();

        switch (type) {
            case "Грильяж", "грильяж":
                candyList.add(new Brittle(name, brand, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Шоколадна", "шоколадна":
                candyList.add(new Chocolate(name, brand, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Драже", "драже":
                candyList.add(new Dragee(name, brand, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Жувальна", "жувальна":
                candyList.add(new Gum(name, brand, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Желейна", "желейна":
                candyList.add(new Jelly(name, brand, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Льодяник", "льодяник":
                candyList.add(new Lollipop(name, brand, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Пастила", "пастила":
                candyList.add(new Pastila(name, brand, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Ірис", "ірис":
                candyList.add(new Toffe(name, brand, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            case "Вафельна", "вафельна":
                candyList.add(new Waffle(name, brand, shape, packageType, weight, calorieContent, sugarContent, hypoallergenic,
                        filling, additives, flavors));
                break;
            default:
                Logger.candyThisTypeNotExist();
                break;
        }
    }
}
