package creational.abstract_factory;

// this is optional and can be done in the main
public class CloudServiceFactoryProducer {
    public CloudServiceFactory getFactory(String provider) {
        switch (provider.toLowerCase()) {
            case "aws":
                return new AwsFactory();
            case "gcp":
                return new GcpFactory();
            default:
                throw new IllegalArgumentException("Unknown provider: " + provider);
        }
    }
}
