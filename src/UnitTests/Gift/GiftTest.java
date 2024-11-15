package UnitTests.Gift;

import Candy.Candy;
import Gift.Gift;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

public class GiftTest {
    private Gift gift;

    @BeforeEach
    void setUp() {
        gift = new Gift("Зима");
        Candy candy1 = new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти");
        Candy candy2 = new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс");
        Candy candy3 = new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол");

        HashMap<String, Candy> listOfCandies = new HashMap<String, Candy>();
        listOfCandies.put("39", candy1);
        listOfCandies.put("20", candy2);
        listOfCandies.put("19", candy3);
        gift.setListOfCandies(listOfCandies);

        gift.setWeight(39*8+20*13+19*10);
    }

    @Test
    public void getSetNameTest() {
        String name = "testData";
        gift.setName(name);
        assertEquals(name, gift.getName());
    }

    @Test
    public void getSetListOfCandiesTest() {
        HashMap<String, Candy> expected = new HashMap<String, Candy>();

        expected.put("10", new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти"));
        expected.put("7", new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс"));
        expected.put("19", new Candy("Карамельний Вихор", "АВК", "Карамель", "Еліпсоїд", "Папір", 12, 420, 50.0, false, "-", "Горіхова крихта", "Карамель"));

        gift.setListOfCandies(expected);

        assertEquals(expected.get(0), gift.getListOfCandies().get(0));
        assertEquals(expected.get(1), gift.getListOfCandies().get(1));
        assertEquals(expected.get(2), gift.getListOfCandies().get(2));
    }

    @Test
    public void getSetWeightTest() {
        double Weight = 20.57;
        gift.setWeight(Weight);
        assertEquals(Weight, gift.getWeight());
    }

    @Test
    public void addCandyToListOfCandiesTest() {
        HashMap<String, Candy> expected = new HashMap<String, Candy>();

        expected.put("39", new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти"));
        expected.put("20", new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс"));
        expected.put("19", new Candy("Карамельний Вихор", "АВК", "Карамель", "Еліпсоїд", "Папір", 12, 420, 50.0, false, "-", "Горіхова крихта", "Карамель"));
        expected.put("50", new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол"));

        Candy candy = new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол");

        gift.addCandyToListOfCandies(candy, "50");

        assertEquals(expected.get(0), gift.getListOfCandies().get(0));
        assertEquals(expected.get(1), gift.getListOfCandies().get(1));
        assertEquals(expected.get(2), gift.getListOfCandies().get(2));
        assertEquals(expected.get(3), gift.getListOfCandies().get(3));
    }

    @Test
    public void cleanListOfCandiesTest() {
        gift.cleanListOfCandies();
        assertTrue(gift.getListOfCandies().isEmpty());
    }

    @Test
    public void toStringTest() {
        HashMap<String, Candy> temp = new HashMap<String, Candy>();

        temp.put("39", new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти"));
        temp.put("20", new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс"));
        temp.put("19", new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол"));

        String expected = "";

        for (Candy candy : temp.values()) {
            expected += candy.toString();
            expected += "\n";
        }

        String tested = gift.toString();

        assertEquals(expected, tested);
    }

}
