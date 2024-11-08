package Commands;

import Candy.Candy;

import java.util.ArrayList;

public class PrintCandyListCommand {

    public static void execute(ArrayList<Candy> candyList) {
        for (Candy candy : candyList) {
            System.out.println(candy.toString());
        }
    }
}
