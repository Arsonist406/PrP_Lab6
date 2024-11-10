package Commands.ECL;

import Candy.Candy;
import Commands.Command;


import java.util.ArrayList;
import java.util.Scanner;

public class CreateNewList extends Command {
    private ArrayList<Candy> candyList;

    public CreateNewList(ArrayList<Candy> candyList) {
        super();
        this.candyList = candyList;
    }

    @Override
    public void execute() {
        candyList.clear();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            AddNewCandyToList command = new AddNewCandyToList(candyList);
            command.execute();

            System.out.println("Для закінчення введіть зараз 'end'.");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
        }
        System.out.println("Новий список цукерок створено.");
    }
}
