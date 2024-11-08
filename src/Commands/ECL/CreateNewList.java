package Commands.ECL;

import Candy.Candy;
import Logger.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateNewList {
    public static void execute(ArrayList<Candy> candyList) {
        candyList.clear();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            AddNewCandyToList.execute(candyList);
            Logger.toStop();
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
        }
        Logger.newCandyListWasCreated();
    }
}
