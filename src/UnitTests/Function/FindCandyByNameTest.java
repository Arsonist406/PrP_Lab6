package UnitTests.Function;

import Candy.Candy;
import Function.FindCandyByName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FindCandyByNameTest {
    private ArrayList<Candy> testCandyList;
    private FindCandyByName testedFunction;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        testCandyList = new ArrayList<Candy>();

        testCandyList.add(new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти"));
        testCandyList.add(new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс"));
        testCandyList.add(new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол"));

        String input = "3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Scanner scanner = new Scanner(System.in);
        testedFunction = new FindCandyByName(testCandyList, scanner);

        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void executeTest() {
        Candy result = testedFunction.execute();
        Candy expected = testCandyList.get(2);
        assertEquals(expected, result);
    }
}
