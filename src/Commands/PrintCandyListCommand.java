package Commands;

import Candy.Candy;
import ErrorMailer.ErrorMailer;
import Logger.Logger;

import java.io.IOException;
import java.util.ArrayList;

public class PrintCandyListCommand extends Command {
    private ArrayList<Candy> candyList;

    public PrintCandyListCommand(ArrayList<Candy> candyList) {
        super();
        this.candyList = candyList;
    }

    @Override
    public  void execute() {
        try {
            for (Candy candy : candyList) {
                System.out.println(candy.toString());
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
