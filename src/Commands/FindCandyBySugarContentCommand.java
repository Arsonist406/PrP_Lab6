package Commands;

import Candy.Candy;
import Gift.*;

import java.util.Scanner;

public class FindCandyBySugarContentCommand extends Command {
    private Gift gift;

    public FindCandyBySugarContentCommand(Gift gift) {
        super();
        this.gift = gift;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть нижню межу: ");
        String input = scanner.nextLine();
        int min = Integer.parseInt(input);

        System.out.print("Введіть верхню межу: ");
        input = scanner.nextLine();
        int max = Integer.parseInt(input);

        for (Candy candy : gift.getListOfCandies().values()) {
            if (candy.getSugarContent() >= min && candy.getSugarContent() <= max) {
                System.out.println("Знайдена цукерка:");
                System.out.println(candy);
                return;
            }
        }
        System.out.println("Цукерок з вмістом цікру в даному діапазоні в списку не має.");
    }
}
