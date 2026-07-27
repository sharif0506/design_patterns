package creational.abstract_factory;

// Google's email service
public class GmailService implements EmailService{
    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("[GCP Gmail API] Emailing " + to + " -> " + subject);
    }
}
