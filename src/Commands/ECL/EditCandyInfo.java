package Commands.ECL;

import Candy.*;
import Commands.FindCandyByNameCommand;
import Logger.Logger;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Scanner;

public class EditCandyInfo {
    public static void execute(ArrayList<Candy> candyList) throws IllegalAccessException {
        Candy editTarget = FindCandyByNameCommand.execute(candyList);

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
                    //!!!! доробити
                    switch (newStr) {
                        case "Грильяж", "грильяж":
                            Brittle brittle = new Brittle("", "", "", "", 0,
                                    0, 0, false,
                                    "", "", "");
                            reflection(brittle, editTarget);
                            candyList.add(brittle);
                            break;
                        case "Шоколадна", "шоколадна":
                            Chocolate chocolate = new Chocolate("", "", "", "", 0,
                                    0, 0, false,
                                    "", "", "");
                            reflection(chocolate, editTarget);
                            candyList.add(chocolate);
                            break;
                        case "Драже", "драже":
                            Dragee dragee = new Dragee("", "", "", "", 0,
                                    0, 0, false,
                                    "", "", "");
                            reflection(dragee, editTarget);
                            candyList.add(dragee);
                            break;
                        case "Жувальна", "жувальна":
                            Gum gum = new Gum("", "", "", "", 0,
                                    0, 0, false,
                                    "", "", "");
                            reflection(gum, editTarget);
                            candyList.add(gum);
                            break;
                        case "Желейна", "желейна":
                            Jelly jelly = new Jelly("", "", "", "", 0,
                                    0, 0, false,
                                    "", "", "");
                            reflection(jelly, editTarget);
                            candyList.add(jelly);
                            break;
                        case "Льодяник", "льодяник":
                            Lollipop lollipop = new Lollipop("", "", "", "", 0,
                                    0, 0, false,
                                    "", "", "");
                            reflection(lollipop, editTarget);
                            candyList.add(lollipop);
                            break;
                        case "Пастила", "пастила":
                            Pastila pastila = new Pastila("", "", "", "", 0,
                                    0, 0, false,
                                    "", "", "");
                            reflection(pastila, editTarget);
                            candyList.add(pastila);
                            break;
                        case "Ірис", "ірис":
                            Toffe toffe = new Toffe("", "", "", "", 0,
                                    0, 0, false,
                                    "", "", "");
                            reflection(toffe, editTarget);
                            candyList.add(toffe);
                            break;
                        case "Вафельна", "вафельна":
                            Waffle waffle = new Waffle("", "", "", "", 0,
                                    0, 0, false,
                                    "", "", "");
                            reflection(waffle, editTarget);
                            candyList.add(waffle);
                            break;
                        default:
                            Logger.candyThisTypeNotExist();
                            break;
                    }
                    candyList.remove(editTarget);
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

    public static void reflection(Candy diffType, Candy editTarget) throws IllegalAccessException {
        for (Field f : Candy.class.getDeclaredFields()) {
            f.setAccessible(true);
            Object value = f.get(editTarget);  // Отримуємо значення поля з objectA
            f.set(diffType, value);          // Встановлюємо значення поля в objectB
        }
    }
}
