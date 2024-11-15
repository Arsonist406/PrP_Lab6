package UnitTests.Commands;

import Candy.Candy;
import Commands.PrintGiftCommand;
import Gift.Gift;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintGiftCommandTest {
    private Gift testGift;
    private PrintGiftCommand testedCommand;

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

        testedCommand = new PrintGiftCommand(testGift);
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void executeTest() {
        System.setOut(new PrintStream(outContent));

        String expected = "Назва: " + testGift.getName() + "\r\n" + "Вага: " + testGift.getWeight() + "\r\n" +
                "Список цукерок:" + "\r\n" + testGift.toString();

        testedCommand.execute();

        String capturedOutput = outContent.toString().trim() + "\n";

        assertEquals(expected, capturedOutput);

        System.setOut(originalOut);
    }
}
