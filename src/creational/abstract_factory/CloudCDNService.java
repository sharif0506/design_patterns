package creational.abstract_factory;

// Google's CDN -> CloudCDN
public class CloudCDNService implements CDNService {
    @Override
    public String publishAsset(String path) {
        System.out.println("[AWS CloudFront] Publishing " + path);
        return "https://d123.cloudfront.net/" + path;
    }
}
