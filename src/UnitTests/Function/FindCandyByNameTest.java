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

public class FindCandyByNameTest {
    private ArrayList<Candy> testedArrayList;
    private FindCandyByName testedFunction;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        testedArrayList = new ArrayList<Candy>();
        testedArrayList.add(new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти"));
        testedArrayList.add(new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс"));
        testedArrayList.add(new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол"));

        testedFunction = new FindCandyByName(testedArrayList);

        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testFindCandyByName() {
        String input = "3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Candy result = testedFunction.execute();
        Candy expected = testedArrayList.get(2);
        assertEquals(expected, result);
    }
}
