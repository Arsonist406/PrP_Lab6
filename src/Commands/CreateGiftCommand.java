package Commands;

import Candy.Candy;
import Gift.*;
import Logger.Logger;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class CreateGiftCommand {

    public static void execute(Gift gift, ArrayList<Candy> candyList) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву подарунку: ");
        String name = scanner.nextLine();
        gift.setName(name);

        while (true) {
            Candy result = FindCandyByNameCommand.execute(candyList);

            System.out.print("Введіть кількість: ");
            String amount = scanner.nextLine();

            gift.addCandyToListOfCandies(result, amount);

            Logger.toStop();
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
        }
    }
}
