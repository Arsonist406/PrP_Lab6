package Commands;

import Gift.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CreateGiftCommand extends Command {
    public CreateGiftCommand() {
        super();
    }

    public Map<String, Gift> createGift() {
        Scanner scanner = new Scanner(System.in);

        logger.setNameGift();
        String name = scanner.nextLine();

        logger.chooseCandy();
        String number = "";
        Gift temp;
        while (true) {
            number = scanner.nextLine();
            if (number.equals("0")) {
                break;
            }
            //temp.addCandy();
        }
        //Map<String, Gift> gift = new HashMap<String, Gift>(name, temp);
        Map<String, Gift> gift = null;
        return gift;
    }
}
