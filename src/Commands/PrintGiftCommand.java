package Commands;

import ErrorMailer.ErrorMailer;
import Gift.*;
import Logger.Logger;

import java.io.IOException;

public class PrintGiftCommand extends Command {
    private Gift gift;

    public PrintGiftCommand(Gift gift) {
        this.gift = gift;
    }

    @Override
    public void execute() {
        try {
            System.out.println("Назва: " + gift.getName());
            System.out.println("Вага: " + gift.getWeight());
            System.out.println("Список цукерок:");
            System.out.println(gift.toString());
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
