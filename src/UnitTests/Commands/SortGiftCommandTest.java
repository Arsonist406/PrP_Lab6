package UnitTests.Commands;

import Candy.Candy;
import Commands.SortGiftCommand;
import Gift.Gift;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SortGiftCommandTest {
    private Gift testGift;
    private SortGiftCommand testedCommand;

    private PrintStream originalOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        originalOut = System.out;

        testGift = new Gift("temp1");

        Candy candy1 = new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти");
        Candy candy2 = new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс");
        Candy candy3 = new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол");

        testGift.addCandyToListOfCandies(candy1, "30");
        testGift.addCandyToListOfCandies(candy2, "40");
        testGift.addCandyToListOfCandies(candy3, "10");

        testGift.setWeight(30*8+40*13+10*10);

        testedCommand = new SortGiftCommand(testGift);
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void executeTest() {
        String input = "1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Gift expectedGift = new Gift("temp2");

        Candy candy1 = new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти");
        Candy candy2 = new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс");
        Candy candy3 = new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол");

        expectedGift.addCandyToListOfCandies(candy1, "50");
        expectedGift.addCandyToListOfCandies(candy2, "20");
        expectedGift.addCandyToListOfCandies(candy3, "30");

        testedCommand.execute();

        assertEquals(testGift.toString(), expectedGift.toString());

        System.setOut(originalOut);
    }
}
