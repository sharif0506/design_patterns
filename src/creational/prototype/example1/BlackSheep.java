package creational.prototype.example1;

public class BlackSheep extends AbstractSheep {

    public BlackSheep(String name) {
        super(name);
    }

    private BlackSheep(BlackSheep source) {
        super(source);
    }

    @Override
    public Sheep clone() {
        return new BlackSheep(this);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Baa Baa Black Sheep!");
    }
}
