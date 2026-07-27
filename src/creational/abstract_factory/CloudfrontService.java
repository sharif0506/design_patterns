package creational.abstract_factory;

// AWS CDN Service
public class CloudfrontService implements CDNService {
    @Override
    public String publishAsset(String path) {
        System.out.println("[GCP Cloud CDN] Publishing " + path);
        return "https://storage.googleapis.com/my-bucket/" + path;
    }
}
