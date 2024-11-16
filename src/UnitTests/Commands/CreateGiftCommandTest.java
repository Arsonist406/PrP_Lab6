package UnitTests.Commands;

import Candy.Candy;
import Commands.CreateGiftCommand;
import Gift.Gift;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateGiftCommandTest {
    private Gift expectedGift;
    private Gift actualGift;
    private ArrayList<Candy> testCandyList;
    private CreateGiftCommand testedCommand;

    private PrintStream originalOut;

    @BeforeEach
    public void setUp() {
        originalOut = System.out;

        testCandyList = new ArrayList<>();

        testCandyList.add(new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти"));
        testCandyList.add(new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс"));
        testCandyList.add(new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол"));

        expectedGift = new Gift("Зима");
        expectedGift.addCandyToListOfCandies(testCandyList.get(2), "50");
        expectedGift.addCandyToListOfCandies(testCandyList.get(1), "30");

        actualGift = new Gift("-");
        testedCommand = new CreateGiftCommand(actualGift, testCandyList);
    }

    @Test
    public void executeTest() {
        String input = "Зима\r\n3\r\n50\r\n1\r\n2\r\n30\r\n4";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        testedCommand.execute();

        assertEquals(expectedGift.toString(), actualGift.toString());

        System.setOut(originalOut);
    }
}
