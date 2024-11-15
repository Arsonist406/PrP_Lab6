package UnitTests.Commands;

import Candy.Candy;
import Commands.PrintCandyListCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintCandyListCommmandTest {
    private ArrayList<Candy> testCandyList;
    private PrintCandyListCommand testedCommand;

    private PrintStream originalOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        originalOut = System.out;

        testCandyList = new ArrayList<>();
        testCandyList.add(new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти"));
        testCandyList.add(new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс"));
        testCandyList.add(new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол"));

        testedCommand = new PrintCandyListCommand(testCandyList);
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void executeTest() {
        System.setOut(new PrintStream(outContent));

        testedCommand.execute();

        String expected = testCandyList.get(0).toString() + "\r\n" + testCandyList.get(1).toString() + "\r\n" + testCandyList.get(2).toString();

        String capturedOutput = "\n" + outContent.toString().trim();

        assertEquals(expected, capturedOutput);

        System.setOut(originalOut);
    }
}
