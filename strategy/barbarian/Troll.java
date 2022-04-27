package poo.strategy.barbarian;

public class Troll extends Character {
    public Troll() {
        weapon = new KnifeBehavior();
    }

    public void display() {
        System.out.print("ROAAAR");
    }
}