package Function;

import Candy.Candy;
import Commands.PrintCandyListCommand;
import ErrorMailer.ErrorMailer;
import Logger.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FindCandyByName {
    private ArrayList<Candy> candyList;
    private Scanner scanner;

    public FindCandyByName(ArrayList<Candy> candyList, Scanner scanner) {
        this.candyList = candyList;
        this.scanner = scanner;
    }

    public Candy execute() {
        try {
            int i = 1;
            for (Candy candy : candyList) {
                System.out.print(i);
                System.out.print(". ");
                System.out.println(candy.getName());
                i++;
            }

            System.out.print("Введіть номер цукерки зі списку: ");

            String temp = scanner.nextLine();
            int number = Integer.parseInt(temp);

            while (true) {
                if (number >= 1 && number <= candyList.size()) {
                    return candyList.get(number - 1);
                }
                System.out.println("Неправильний номер.");
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
        return null;
    }
}
