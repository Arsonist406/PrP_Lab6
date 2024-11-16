package Commands;

import Candy.Candy;
import ErrorMailer.ErrorMailer;
import Gift.*;
import Logger.Logger;

import java.io.IOException;
import java.util.Scanner;

public class FindCandyBySugarContentCommand extends Command {
    private Gift gift;

    public FindCandyBySugarContentCommand(Gift gift) {
        super();
        this.gift = gift;
    }

    @Override
    public void execute() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть нижню межу: ");
            String input = scanner.nextLine();
            int min = Integer.parseInt(input);

            System.out.print("Введіть верхню межу: ");
            input = scanner.nextLine();
            int max = Integer.parseInt(input);

            for (Candy candy : gift.getListOfCandies().values()) {
                if (candy.getSugarContent() >= min && candy.getSugarContent() <= max) {
                    System.out.print("\nЗнайдена цукерка:");
                    System.out.println(candy.toString());
                    System.out.println();
                    return;
                }
            }
            System.out.println("Цукерок з вмістом цікру в даному діапазоні в списку не має.");
        } catch (Exception e) {
            ErrorMailer mailer = new ErrorMailer(e.getMessage());
            mailer.sendErrorNotification();

            System.out.println("Помилка: " + e.getMessage());

            try {
                Logger log1 = new Logger("Помилка: " + e.getMessage());
                log1.log();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
