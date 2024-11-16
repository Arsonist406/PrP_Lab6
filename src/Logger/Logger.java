package Logger;

import ErrorMailer.ErrorMailer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.io.IOException;

public class Logger {
    private BufferedWriter br;
    String message;

    public Logger(String message) throws IOException {
        br = new BufferedWriter(new FileWriter("D:\\Шарага\\Проекти на джаві\\PrP_Lab5\\logging_file", true));
        this.message = message;
    }

    public void log() {
        LocalDateTime now = LocalDateTime.now();
        try {
            br.write(now + ": " + message + "\n");
            br.flush();
        } catch (IOException e) {
            System.out.println("Помилка запису в лог: " + e.getMessage());

            ErrorMailer mailer = new ErrorMailer(e.getMessage());
            mailer.sendErrorNotification();
        }
    }
}
