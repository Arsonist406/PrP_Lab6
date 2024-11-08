package Commands.ECL;

import Candy.Candy;
import Logger.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateNewList {
    public static void execute(ArrayList<Candy> candyList) {
        candyList.clear();
        Scanner scanner = new Scanner(System.in);

        Logger.toStop();
        while (true) {
            AddNewCandyToList.execute(candyList);
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
        }
        Logger.newCandyListWasCreated();
    }
}
