package creational.abstract_factory;

public interface CloudServiceFactory {
    EmailService createEmailService();

    CDNService createCDNService();
}
