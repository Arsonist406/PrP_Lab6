package Commands.ECL;

import Candy.*;
import Commands.Command;

import java.util.ArrayList;
import java.util.Scanner;

public class AddNewCandyToList extends Command {
    private ArrayList<Candy> candyList;

    public AddNewCandyToList(ArrayList<Candy> candyList) {
        super();
        this.candyList = candyList;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву цукерки: ");
        String name = scanner.nextLine();

        System.out.print("Введіть назву бренду: ");
        String brand = scanner.nextLine();

        System.out.print("Введіть тип цукерки: ");
        String type = scanner.nextLine();

        System.out.print("Введіть форму цукерки: ");
        String shape = scanner.nextLine();

        System.out.print("Введіть тип пакунку: ");
        String packageType = scanner.nextLine();

        Scanner scanner2 = new Scanner(System.in);

        System.out.print("Введіть вагу: ");
        double weight = scanner2.nextDouble();

        System.out.print("Введіть калорійність: ");
        double calorieContent = scanner2.nextDouble();

        System.out.print("Введіть вмістимість цукру: ");
        double sugarContent = scanner2.nextDouble();

        System.out.print("Ця цукерка викликає алергічні реакції? (true / false): ");
        boolean hypoallergenic = !scanner2.nextBoolean();

        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Введіть наповнювач: ");
        String filling = scanner3.nextLine();

        System.out.print("Введіть добавку: ");
        String additives = scanner3.nextLine();

        System.out.print("Введіть ароматизатор: ");
        String flavors = scanner3.nextLine();

        candyList.add(new Candy(name, brand, type, shape, packageType, weight, calorieContent, sugarContent,
                hypoallergenic, filling, additives, flavors));
    }
}
