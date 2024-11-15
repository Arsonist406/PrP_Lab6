package Commands;

import Candy.Candy;
import Function.FindCandyByName;
import Gift.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateGiftCommand extends Command {
    private Gift gift;
    private ArrayList<Candy> candyList;

    public CreateGiftCommand(Gift gift, ArrayList<Candy> candyList) {
        super();
        this.gift = gift;
        this.candyList = candyList;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть назву подарунку: ");
        String name = scanner.nextLine();
        gift.setName(name);

        while (true) {
            FindCandyByName func = new FindCandyByName(candyList);
            Candy result = func.execute();

            System.out.print("Введіть кількість: ");
            String amount = scanner.nextLine();

            gift.setWeight(gift.getWeight() + result.getWeight() * Double.parseDouble(amount));

            gift.addCandyToListOfCandies(result, amount);

            System.out.print("Для продовження введіть 1, щоб заврешити введіть будь-що інше: ");
            String input = scanner.nextLine();
            if (!input.equals("1")) {
                break;
            }
        }
    }
}
