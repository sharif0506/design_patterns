package creational.prototype.example1;

public class Main {
    public static void main(String[] args) {

        // Build prototypes once — expensive init runs only here
        System.out.println("=== Building prototypes (expensive) ===");
        Sheep blackPrototype = new BlackSheep("BlackBase");
        blackPrototype.addTrait("wool:black");
        blackPrototype.addTrait("size:large");

        Sheep whitePrototype = new WhiteSheep("WhiteBase");
        whitePrototype.addTrait("wool:white");
        whitePrototype.addTrait("size:medium");

        SheepRegistry registry = new SheepRegistry();
        registry.register("black", blackPrototype);
        registry.register("white", whitePrototype);

        // Clone from registry — no expensive init, each clone is independent
        System.out.println("\n=== Cloning from registry (cheap) ===");
        Sheep sheep1 = registry.get("black");
        sheep1.setName("Midnight");
        sheep1.addTrait("temperament:calm");   // only on this clone

        Sheep sheep2 = registry.get("black");
        sheep2.setName("Shadow");
        sheep2.addTrait("temperament:aggressive"); // only on this clone

        Sheep sheep3 = registry.get("white");
        sheep3.setName("Snowball");

        // Deep copy proof: prototypes are unchanged despite clone mutations
        System.out.println("\n=== Prototype state (must be unchanged) ===");
        blackPrototype.describe();
        whitePrototype.describe();

        System.out.println("\n=== Clones (independently customized) ===");
        sheep1.describe();
        sheep2.describe();
        sheep3.describe();

        sheep1.makeSound();
        sheep2.makeSound();
        sheep3.makeSound();
    }
}
