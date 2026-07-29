package creational.prototype.example1;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSheep implements Sheep {

    private String name;
    private List<String> traits;

    public AbstractSheep(String name) {
        this.name = name;
        this.traits = new ArrayList<>();
        simulateExpensiveInit();
    }

    // Copy constructor — skips expensive init, deep-copies the traits list
    protected AbstractSheep(AbstractSheep source) {
        this.name = source.name;
        this.traits = new ArrayList<>(source.traits);
    }

    // Simulates a costly setup (e.g. DB lookup, DNA sequencing, heavy computation)
    private void simulateExpensiveInit() {
        System.out.println("  [expensive DNA sequencing for '" + name + "'...]");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addTrait(String trait) {
        traits.add(trait);
    }

    @Override
    public void describe() {
        System.out.println(getClass().getSimpleName() + " '" + name + "' -> traits: " + traits);
    }

    @Override
    public abstract Sheep clone();
}
