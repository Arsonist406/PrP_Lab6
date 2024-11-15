package Commands;

import Gift.*;

public class PrintGiftCommand extends Command {
    private Gift gift;

    public PrintGiftCommand(Gift gift) {
        this.gift = gift;
    }

    @Override
    public void execute() {
        System.out.println("Назва: " + gift.getName());
        System.out.println("Вага: " + gift.getWeight());
        System.out.println("Список цукерок:");
        System.out.println(gift.toString());
    }
}
