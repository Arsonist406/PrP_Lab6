package Commands;

import Candy.Candy;
import Gift.*;

import java.util.*;

public class PrintGiftCommand extends Command {
    private Gift gift;

    public PrintGiftCommand(Gift gift) {
        this.gift = gift;
    }

    @Override
    public void execute() {
        System.out.println("На основі якого параметра відсортувати цукерки в списку?");
        System.out.println("Вага, Калорійність, Вміст цукру.");

        Scanner scanner = new Scanner(System.in);
        String field = scanner.nextLine();

        // Отримуємо записі мапи у вигляді списку
        List<Map.Entry<String, Candy>> entries = new ArrayList<>(gift.getListOfCandies().entrySet());

        if (field.equals("Калорійність") || field.equals("калорійність") || field.equals("ккал")) {
            entries.sort(Comparator.comparingDouble(e -> e.getValue().getCalorieContent()));

        } else if (field.equals("Вага") || field.equals("вага")) {
            entries.sort(Comparator.comparingDouble(e -> e.getValue().getWeight()));

        } else if (field.equals("Вміст цукру") || field.equals("вміст цукру") || field.equals("цукор")) {
            entries.sort(Comparator.comparingDouble(e -> e.getValue().getSugarContent()));
        } else {
            System.out.println("На основі цього параметру неможливо відсортувати список.");
        }

        // Перетворюємо відсортований список назад у LinkedHashMap для збереження порядку
        Map<String, Candy> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Candy> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        gift.cleanListOfCandies();

        gift.setListOfCandies(sortedMap);

        System.out.println("Назва: " + gift.getName());
        System.out.println("Вага: " + gift.getWeight());
        System.out.println("Список цукерок:");
        System.out.println(gift.toString());
    }
}
