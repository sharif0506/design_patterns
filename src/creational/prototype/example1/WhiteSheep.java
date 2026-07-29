package creational.prototype.example1;

public class WhiteSheep extends AbstractSheep {

    public WhiteSheep(String name) {
        super(name);
    }

    private WhiteSheep(WhiteSheep source) {
        super(source);
    }

    @Override
    public Sheep clone() {
        return new WhiteSheep(this);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Baa Baa White Sheep!");
    }
}
