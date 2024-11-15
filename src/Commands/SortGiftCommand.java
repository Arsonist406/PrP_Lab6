package Commands;

import Candy.Candy;
import Gift.Gift;

import java.util.*;

public class SortGiftCommand extends Command {
    private Gift gift;

    public SortGiftCommand(Gift gift) {
        this.gift = gift;
    }

    @Override
    public void execute() {
        System.out.println("На основі якого параметра відсортувати цукерки в списку?");
        System.out.println("1.Вага\n2.Калорійність\n3.Вміст цукру.");

        Scanner scanner = new Scanner(System.in);
        String field = scanner.nextLine();

        List<Map.Entry<String, Candy>> entries = new ArrayList<>(gift.getListOfCandies().entrySet());

        if (field.equals("1")) {
            entries.sort(Comparator.comparingDouble(e -> e.getValue().getCalorieContent()));

        } else if (field.equals("2")) {
            entries.sort(Comparator.comparingDouble(e -> e.getValue().getWeight()));

        } else if (field.equals("3")) {
            entries.sort(Comparator.comparingDouble(e -> e.getValue().getSugarContent()));
        } else {
            System.out.println("На основі цього параметру неможливо відсортувати список.");
            return;
        }

        Map<String, Candy> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Candy> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        gift.cleanListOfCandies();

        gift.setListOfCandies(sortedMap);

        System.out.println("Подарунок відсортовано.");
    }
}
