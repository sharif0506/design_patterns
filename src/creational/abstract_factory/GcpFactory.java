package creational.abstract_factory;

public class GcpFactory implements CloudServiceFactory {
    @Override
    public EmailService createEmailService() {
        return new GmailService();
    }

    @Override
    public CDNService createCDNService() {
        return new CloudfrontService();
    }
}
