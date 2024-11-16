package UnitTests.Commands.ECL;

import Candy.Candy;
import Commands.ECL.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreateNewListCommandTest {
    private ArrayList<Candy> testCandyList;
    private CreateNewListCommand testedCommand;

    private PrintStream originalOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        testCandyList = new ArrayList<>();

        testCandyList.add(new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти"));
        testCandyList.add(new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс"));
        testCandyList.add(new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол"));

        testedCommand = new CreateNewListCommand(testCandyList);
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void executeTest() {
        String input = "тест\n" + "тест\n" + "тест\n" + "тест\n" + "тест\n" + "0\n" + "0\n" + "0\n" + "так\n" +
                "тест\n" + "тест\n" + "тест\n" + "dfg";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ArrayList<Candy> expectedCandyList = new ArrayList<>();
        expectedCandyList.add(new Candy("тест", "тест", "тест", "тест", "тест", 0, 0, 0, false, "тест", "тест", "тест"));

        testedCommand.execute();

        assertEquals(expectedCandyList.toString(), testCandyList.toString());

        System.setOut(originalOut);
    }
}
