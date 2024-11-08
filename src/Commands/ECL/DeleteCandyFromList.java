package Commands.ECL;

import Candy.Candy;
import Commands.FindCandyByNameCommand;
import Commands.PrintCandyListCommand;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteCandyFromList {
    public static void execute(ArrayList<Candy> candyList) {
        Candy result = FindCandyByNameCommand.execute(candyList);

        if (result != null) {
            candyList.remove(result);
            System.out.println("Цукерку видалено.");
        } else {
            System.out.println("Об'єкт з таким іменем не знайдено.");
        }
    }
}
