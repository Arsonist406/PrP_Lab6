package UnitTests.Commands.ECL;

import Candy.Candy;
import Commands.ECL.EditCandyInfoCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EditCandyInfoCommandTest {
    private ArrayList<Candy> testCandyList;
    private EditCandyInfoCommand testedCommand;

    private PrintStream originalOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        testCandyList = new ArrayList<>();

        testCandyList.add(new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти"));
        testCandyList.add(new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс"));
        testCandyList.add(new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол"));

        testedCommand = new EditCandyInfoCommand(testCandyList);

        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void executeTest() {
        String input = "3\n10\nКуркума";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Candy expectedCandy = new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "Куркума", "-", "Ментол");

        testedCommand.execute();

        assertEquals(expectedCandy.toString(), testCandyList.get(2).toString());

        System.setOut(originalOut);

    }
}
