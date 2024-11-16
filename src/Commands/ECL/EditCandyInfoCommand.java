package Commands.ECL;

import Candy.*;
import Commands.Command;
import ErrorMailer.ErrorMailer;
import Function.FindCandyByName;
import Logger.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EditCandyInfoCommand extends Command {
    private ArrayList<Candy> candyList;

    public EditCandyInfoCommand(ArrayList<Candy> candyList) {
        super();
        this.candyList = candyList;
    }

    @Override
    public void execute() {
        try {
            Scanner scanner = new Scanner(System.in);
            FindCandyByName func = new FindCandyByName(candyList, scanner);
            Candy editTarget = func.execute();

            if (editTarget != null) {
                System.out.println("1. Назва");
                System.out.println("2. Виробник");
                System.out.println("3. Тип");
                System.out.println("4. Форма");
                System.out.println("5. Тип пакунку");
                System.out.println("6. Вага");
                System.out.println("7. Калорійність");
                System.out.println("8. Вміст цукру");
                System.out.println("9. Гіпоалергенність");
                System.out.println("10. Наповнювач");
                System.out.println("11. Добавки");
                System.out.println("12. Ароматизатори");

                System.out.print("Введіть номер поля, який хочете змінити: ");

                String field = scanner.nextLine();

                System.out.print("Введіть нове значення поля: ");

                String newData = scanner.nextLine();

                switch (field) {
                    case "1":
                        editTarget.setName(newData);
                        break;
                    case "2":
                        editTarget.setBrand(newData);
                        break;
                    case "3":
                        editTarget.setType(newData);
                        break;
                    case "4":
                        editTarget.setShape(newData);
                        break;
                    case "5":
                        editTarget.setPackageType(newData);
                        break;
                    case "6":
                        editTarget.setWeight(Double.parseDouble(newData));
                        break;
                    case "7":
                        editTarget.setCalorieContent(Double.parseDouble(newData));
                        break;
                    case "8":
                        editTarget.setSugarContent(Double.parseDouble(newData));
                        break;
                    case "9":
                        editTarget.setHypoallergenic(Boolean.parseBoolean(newData));
                        break;
                    case "10":
                        editTarget.setFilling(newData);
                        break;
                    case "11":
                        editTarget.setAdditives(newData);
                        break;
                    case "12":
                        editTarget.setFlavors(newData);
                        break;
                    default:
                        System.out.println("Такого поля не існує.");
                        break;
                }
            } else {
                System.out.println("Цукеру з таким іменем не знайдено.");
            }
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
