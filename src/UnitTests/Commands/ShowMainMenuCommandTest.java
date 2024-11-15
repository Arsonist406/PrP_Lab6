package UnitTests.Commands;

import Commands.ShowMainMenuCommand;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ShowMainMenuCommandTest {
    private ShowMainMenuCommand testedCommand;

    private PrintStream originalOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        testedCommand = new ShowMainMenuCommand();
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

        String expected = "[31m" + "*" + RESET + BLUE + "*" + RESET + YELLOW + "*" + RESET + LIGHT_GREEN + "Меню" + RESET +
                YELLOW + "*" + RESET + BLUE + "*" + RESET + RED + "*" + RESET + LIGHT_GREEN + "\r\n" +
                "1. Створити новорічний подарунок" + "\r\n" + "2. Вивести новорічний подарунок" + "\r\n" +
                "3. Знайти цукерку в новорічному подарунку за заданим діапазоном цукру" + "\r\n" +
                "4. Вивести список цукерок" + "\r\n" + "5. Редагувати список цукерок" + "\r\n" +
                "6. Відсортувати цукерки в подарунку" + "\r\n" + "7. Вихід" + "\r\n" + RESET;

        testedCommand.execute();
        String capturedOutput = outContent.toString().trim();

        assertEquals(expected, capturedOutput);

        System.setOut(originalOut);
    }
}
