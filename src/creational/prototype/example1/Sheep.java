package creational.prototype.example1;

public interface Sheep {
    Sheep clone();
    String getName();
    void setName(String name);
    void addTrait(String trait);
    void makeSound();
    void describe();
}
