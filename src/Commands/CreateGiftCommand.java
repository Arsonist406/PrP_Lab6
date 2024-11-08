package Commands;

import Gift.*;
import Logger.Logger;

import java.util.Map;
import java.util.Scanner;

public class CreateGiftCommand {

    public static Map<String, Gift> execute() {
        Scanner scanner = new Scanner(System.in);

        //Logger.setNameGift();
        String name = scanner.nextLine();

        //Logger.chooseCandy();
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
