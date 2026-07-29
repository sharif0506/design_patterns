package creational.prototype.example2;

public class Character {

    private String name;
    private int health;
    private int attack;
    private int defence;

    // Expensive constructor
    public Character(String name, int health, int attack, int defence) {

        System.out.println("Loading assets...(expensive)");

        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defence = defence;
    }

    // Copy constructor
    private Character(Character other) {

        this.name = other.name;
        this.health = other.health;
        this.attack = other.attack;
        this.defence = other.defence;
    }

    public Character clone() {
        return new Character(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
        System.out.println(health);
        System.out.println(attack);
        System.out.println(defence);
    }
}
