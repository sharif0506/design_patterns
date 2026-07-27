package creational.abstract_factory;

class NotificationService {
    private final EmailService email;
    private final CDNService cdn;

    public NotificationService(CloudServiceFactory factory) {
        this.email = factory.createEmailService();
        this.cdn   = factory.createCDNService();
    }

    public void run() {
        String url = cdn.publishAsset("welcome-banner.png");
        email.sendEmail("user@example.com", "Welcome!",
                "Check out our banner: " + url);
    }
}