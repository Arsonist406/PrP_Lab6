package UnitTests.Commands.ECL;

import Commands.ECL.ShowECLMenuCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShowECLMenuCommandTest {
    private ShowECLMenuCommand testedCommand;

    private PrintStream originalOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        testedCommand = new ShowECLMenuCommand();
        originalOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void executeTest() {
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[34m";
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";
        String LIGHT_GREEN = "\u001B[92m";

        String expected = "[31m" + "*" + RESET + BLUE + "*" + RESET + YELLOW + "*" + RESET + LIGHT_GREEN +
                "Меню редагування списку цукерок" + RESET + YELLOW + "*" + RESET + BLUE + "*" + RESET + RED +
                "*" + RESET + LIGHT_GREEN + "\r\n" + "1. Створити новий список цукерок" + "\r\n" +
                "2. Добавити нову цукерку в список" + "\r\n" + "3. Змінити інформацію про цукерку" + "\r\n" +
                "4. Видалити цукерку зі списку" + "\r\n" + "5. Вивести список цукерок" + "\r\n" +
                "6. Вихід" + "\r\n" + RESET;

        testedCommand.execute();
        String actual = outContent.toString().trim();

        assertEquals(expected, actual);

        System.setOut(originalOut);
    }

}
