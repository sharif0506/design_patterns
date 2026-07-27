package creational.abstract_factory;

public class AwsFactory implements CloudServiceFactory {
    @Override
    public EmailService createEmailService() {
        return new SesService();
    }

    @Override
    public CDNService createCDNService() {
        return new CloudCDNService();
    }
}
