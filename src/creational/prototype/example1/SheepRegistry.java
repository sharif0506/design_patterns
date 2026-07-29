package creational.prototype.example1;

import java.util.HashMap;
import java.util.Map;

public class SheepRegistry {

    private final Map<String, Sheep> prototypes = new HashMap<>();

    public void register(String key, Sheep prototype) {
        prototypes.put(key, prototype);
    }

    public Sheep get(String key) {
        Sheep prototype = prototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("No prototype registered for key: " + key);
        }
        return prototype.clone();
    }
}
