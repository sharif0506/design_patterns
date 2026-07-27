package creational.abstract_factory;

public class Main {
    public static void main(String[] args) {
        // Provider chosen in ONE place — e.g. from config / env var
        String cloudServiceProvider = System.getenv().getOrDefault("CLOUD_PROVIDER", "aws");

        CloudServiceFactory factory;

        // can add azure in future or other cloud service
        if (cloudServiceProvider.equalsIgnoreCase("aws")) {
            factory = new AwsFactory();
        } else if (cloudServiceProvider.equalsIgnoreCase("gcp")) {
            factory = new GcpFactory();
        } else {
            throw new IllegalArgumentException("Unknown cloud provider: " + cloudServiceProvider);
        }
        // optionally, factory method can be used here
        // CloudServiceFactory factory = CloudServiceFactoryProducer.getFactory(cloudServiceProvider);


        new NotificationService(factory).run();
    }
}
