package creational.prototype.example2;

public class Main {
    public static void main(String[] args) {
        Character soldier =
                new Character("Soldier",100,20,10);

        Character copy1 = soldier.clone();
        Character copy2 = soldier.clone();
        Character copy3 = soldier.clone();

        copy1.setName("Maximus");
        copy2.setName("Alex");
        copy3.setName("John");

        copy1.print();
        copy2.print();
        copy3.print();


    }
}
