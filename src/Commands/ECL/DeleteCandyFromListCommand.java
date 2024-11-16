package Commands.ECL;

import Candy.Candy;
import Commands.Command;
import ErrorMailer.ErrorMailer;
import Function.FindCandyByName;
import Logger.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteCandyFromListCommand extends Command {
    private ArrayList<Candy> candyList;

    public DeleteCandyFromListCommand(ArrayList<Candy> candyList) {
        super();
        this.candyList = candyList;
    }

    @Override
    public void execute() {
        try {
            Scanner scanner = new Scanner(System.in);
            FindCandyByName func = new FindCandyByName(candyList, scanner);
            Candy result = func.execute();

            if (result != null) {
                candyList.remove(result);
                System.out.println("Цукерку видалено.");
            } else {
                System.out.println("Об'єкт з таким іменем не знайдено.");
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
