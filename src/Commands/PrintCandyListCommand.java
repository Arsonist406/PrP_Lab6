package Commands;

import Candy.Candy;

import java.util.ArrayList;

public class PrintCandyListCommand extends Command {
    private ArrayList<Candy> candyList;

    public PrintCandyListCommand(ArrayList<Candy> candyList) {
        super();
        this.candyList = candyList;
    }

    @Override
    public  void execute() {
        for (Candy candy : candyList) {
            System.out.println(candy.toString());
        }
    }
}
