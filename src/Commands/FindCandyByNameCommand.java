package Commands;

import Candy.Candy;

import java.util.ArrayList;
import java.util.Scanner;

public class FindCandyByNameCommand {
    public static Candy execute(ArrayList<Candy> candyList) {
        PrintCandyListCommand.execute(candyList);
        System.out.print("Введіть назву цукерки зі списку: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Candy result = candyList.stream().filter(candy -> candy.getName().equals(name)).findFirst().orElse(null);

        return result;
    }
}
