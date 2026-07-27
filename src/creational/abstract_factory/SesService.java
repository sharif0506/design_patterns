package creational.abstract_factory;

// AWS Email Service
public class SesService implements EmailService {
    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("[AWS SES] Emailing " + to + " -> " + subject);
    }
}
