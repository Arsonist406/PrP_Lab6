package ErrorMailer;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class ErrorMailer {
    private String smtpHost;
    private String smtpPort;
    private String fromEmail;
    private String password;
    private String toEmail;
    String errorMessage;

    public ErrorMailer(String errorMessage) {
        smtpHost = "smtp.gmail.com";
        smtpPort = "587";
        fromEmail = "forlabforlab53@gmail.com";
        password = "hkdm wbji zjkt zfqy";
        toEmail = "forlabforlab53@gmail.com";
        this.errorMessage = errorMessage;
    }

    public void sendErrorNotification() {
        // Налаштування властивостей для SMTP сервера
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", smtpHost);
        properties.put("mail.smtp.port", smtpPort);

        // Створення сесії з аутентифікацією
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Створення повідомлення
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject("Error Notification");
            message.setText("An error occurred: " + errorMessage);

            // Надсилання повідомлення
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}