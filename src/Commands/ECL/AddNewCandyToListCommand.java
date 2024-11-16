package Commands.ECL;

import Candy.*;
import Commands.Command;
import ErrorMailer.ErrorMailer;
import Logger.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AddNewCandyToListCommand extends Command {
    private ArrayList<Candy> candyList;
    private Scanner scanner;

    public AddNewCandyToListCommand(ArrayList<Candy> candyList, Scanner scanner) {
        super();
        this.candyList = candyList;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        try {
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

            System.out.print("Введіть вагу: ");
            double weight = 0;
            while (true) {
                if (scanner.hasNextDouble()) {
                    weight = scanner.nextDouble();
                    break;
                }
                System.out.println("Повторіть введення");
            }

            System.out.print("Введіть калорійність: ");
            double calorieContent = 0;
            while (true) {
                if (scanner.hasNextDouble()) {
                    calorieContent = scanner.nextDouble();
                    break;
                }
                System.out.println("Повторіть введення");
            }

            System.out.print("Введіть вмістимість цукру: ");
            double sugarContent = 0;
            while (true) {
                if (scanner.hasNextDouble()) {
                    sugarContent = scanner.nextDouble();
                    break;
                }
                System.out.println("Повторіть введення");
            }

            System.out.print("Ця цукерка викликає алергічні реакції? (так / ні): ");
            boolean hypoallergenic = false;
            String temp;
            while (true) {
                temp = scanner.nextLine();
                if (temp.equals("так")) {
                    hypoallergenic = false;
                    break;
                } else if (temp.equals("ні")) {
                    hypoallergenic = true;
                    break;
                }
                System.out.println("Повторіть введення");
            }

            System.out.print("Введіть наповнювач: ");
            String filling = scanner.nextLine();

            System.out.print("Введіть добавку: ");
            String additives = scanner.nextLine();

            System.out.print("Введіть ароматизатор: ");
            String flavors = scanner.nextLine();

            candyList.add(new Candy(name, brand, type, shape, packageType, weight, calorieContent, sugarContent,
                    hypoallergenic, filling, additives, flavors));
        } catch (Exception e) {
            ErrorMailer mailer = new ErrorMailer(e.getMessage());
            mailer.sendErrorNotification();

            System.out.println("Помилка: " + e.getMessage());

            try {
                Logger log1 = new Logger("Помилка: " + e.getMessage());
                log1.log();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
