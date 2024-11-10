package Commands.ECL;

import Candy.*;
import Commands.Command;
import Function.FindCandyByName;

import java.util.ArrayList;
import java.util.Scanner;

public class EditCandyInfo extends Command {
    private ArrayList<Candy> candyList;

    public EditCandyInfo(ArrayList<Candy> candyList) {
        super();
        this.candyList = candyList;
    }

    @Override
    public void execute() {
        FindCandyByName func = new FindCandyByName(candyList);
        Candy editTarget = func.execute();

        if (editTarget != null) {
            System.out.print("Введіть назву поля, яку хочете змінити: ");

            Scanner scanner = new Scanner(System.in);
            String field = scanner.nextLine();

            System.out.print("Введіть нове значення поля: ");

            String newStr = "";
            double newDouble = 0;
            boolean newBool = false;

            Scanner scanner2 = new Scanner(System.in);

            if (field.equals("Калорійність") || field.equals("калорійність") || field.equals("ккал") ||
                    field.equals("Вага") || field.equals("вага") || field.equals("Вміст цукру") ||
                    field.equals("вміст цукру") || field.equals("цукор")) {
                String temp = scanner2.nextLine();
                newDouble = Double.parseDouble(temp);

            } else if (field.equals("Гіпоалергенність") || field.equals("гіпоалергенність") || field.equals("гіпо"))
                newBool = scanner2.nextBoolean();
            else
                newStr = scanner2.nextLine();

            switch (field) {
                case "Назва", "назва":
                    editTarget.setName(newStr);
                    break;
                case "Виробник", "виробник":
                    editTarget.setBrand(newStr);
                    break;
                case "Тип", "тип":
                    editTarget.setType(newStr);
                    break;
                case "Форма", "форма":
                    editTarget.setShape(newStr);
                    break;
                case "Тип пакунку", "тип пакунку", "пакунок":
                    editTarget.setPackageType(newStr);
                    break;
                case "Вага", "вага":
                    editTarget.setWeight(newDouble);
                    break;
                case "Калорійність", "калорійність", "ккал":
                    editTarget.setCalorieContent(newDouble);
                    break;
                case "Вміст цукру", "вміст цукру", "цукор":
                    editTarget.setSugarContent(newDouble);
                    break;
                case "Гіпоалергенність", "гіпоалергенність", "гіпо":
                    editTarget.setHypoallergenic(newBool);
                    break;
                case "Наповнювач", "наповнювач":
                    editTarget.setFilling(newStr);
                    break;
                case "Добавки", "добавки":
                    editTarget.setAdditives(newStr);
                    break;
                case "Ароматизатори", "ароматизатори":
                    editTarget.setFlavors(newStr);
                    break;
                default:
                    System.out.println("Такого поля не існує.");
                    break;
            }
        } else {
            System.out.println("Цукеру з таким іменем не знайдено.");
        }
    }
}
