package Function;

import Candy.Candy;
import Commands.PrintCandyListCommand;

import java.util.ArrayList;
import java.util.Scanner;

public class FindCandyByName {
    private ArrayList<Candy> candyList;

    public FindCandyByName(ArrayList<Candy> candyList) {
        this.candyList = candyList;
    }

    public Candy execute() {
        PrintCandyListCommand command = new PrintCandyListCommand(candyList);
        command.execute();
        System.out.print("Введіть назву цукерки зі списку: ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Candy result = candyList.stream().filter(candy -> candy.getName().equals(name)).findFirst().orElse(null);

        return result;
    }
}
