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
        int i = 1;
        for (Candy candy : candyList) {
            System.out.print(i);
            System.out.print(". ");
            System.out.println(candy.getName());
            i++;
        }

        System.out.print("Введіть номер цукерки зі списку: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        while (true) {
            if (number >= 1 && number <= candyList.size()) {
                return candyList.get(number - 1);
            }
            System.out.println("Неправильний номер.");
        }
    }
}
