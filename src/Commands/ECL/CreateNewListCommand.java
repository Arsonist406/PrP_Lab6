package Commands.ECL;

import Candy.Candy;
import Commands.Command;
import ErrorMailer.ErrorMailer;
import Logger.Logger;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateNewListCommand extends Command {
    private ArrayList<Candy> candyList;

    public CreateNewListCommand(ArrayList<Candy> candyList) {
        super();
        this.candyList = candyList;
    }

    @Override
    public void execute() {
        try {
            candyList.clear();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                AddNewCandyToListCommand command = new AddNewCandyToListCommand(candyList, scanner);
                command.execute();

                System.out.print("Для продовження введіть 1, щоб заврешити введіть будь-що інше: ");
                String input = scanner.nextLine();
                if (!input.equals("1")) {
                    break;
                }
            }
            System.out.println("Новий список цукерок створено.");
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
