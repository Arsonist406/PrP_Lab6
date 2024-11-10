package Commands.ECL;

import Candy.Candy;
import Commands.Command;
import Function.FindCandyByName;

import java.util.ArrayList;

public class DeleteCandyFromList extends Command {
    private ArrayList<Candy> candyList;

    public DeleteCandyFromList(ArrayList<Candy> candyList) {
        super();
        this.candyList = candyList;
    }

    @Override
    public void execute() {
        FindCandyByName func = new FindCandyByName(candyList);
        Candy result = func.execute();

        if (result != null) {
            candyList.remove(result);
            System.out.println("Цукерку видалено.");
        } else {
            System.out.println("Об'єкт з таким іменем не знайдено.");
        }
    }
}
