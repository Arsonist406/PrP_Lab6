package Commands.ECL;

import Candy.Candy;
import Commands.PrintCandyListCommand;

import java.util.ArrayList;

public class DeleteCandyFromList {
    public static void execute(ArrayList<Candy> candyList) {
        PrintCandyListCommand.execute(candyList);
        System.out.print("Введіть назву цукерки зі списку, яку хочете видалити: ");
    }
}
