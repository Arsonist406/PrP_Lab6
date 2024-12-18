package Commands;

import Candy.Candy;
import ErrorMailer.ErrorMailer;
import Function.FindCandyByName;
import Gift.*;
import Logger.Logger;

import java.io.IOException;
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
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть назву подарунку: ");
            String name = scanner.nextLine();
            gift.setName(name);

            while (true) {
                FindCandyByName func = new FindCandyByName(candyList, scanner);
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
