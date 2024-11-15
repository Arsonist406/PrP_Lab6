package UnitTests.Function;

import Candy.Candy;
import Function.ReadFromFile;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ReadFromFileTest {
    private ArrayList<Candy> expected;
    private ArrayList<Candy> actual;
    private String filePath;

    @BeforeEach
    public void setUp() {
        filePath = "D:\\Шарага\\Проекти на джаві\\PrP_Lab5\\testCandys";;
        actual = new ArrayList<>();
        expected = new ArrayList<>();
    }

    @Test
    public void testReadFile() {
        expected.add(new Candy("Шалена Бджілка", "Roshen", "Желейна", "Прямокутник", "Поліетилен", 8, 318, 65.5, false, "Фруктовий сік", "-", "Фрукти"));
        expected.add(new Candy("Зоряне Сяйво", "Світоч", "Шоколадна", "Конус", "Фольга", 13, 497, 49, false, "-", "Вафельна посипка", "Арахіс"));
        expected.add(new Candy("Плюсик", "Roshen", "Льодяник", "Еліпсоїд", "Поліетилен", 10, 392, 63.8, true, "-", "-", "Ментол"));

        ReadFromFile readFromFile = new ReadFromFile(filePath, actual);
        readFromFile.readFile();

        assertEquals(expected.toString(), actual.toString(), "Списки мають бути рівні");
    }
}