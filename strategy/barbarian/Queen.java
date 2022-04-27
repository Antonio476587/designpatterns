package poo.strategy.barbarian;

public class Queen extends Character {
    public Queen() {
        weapon = new BowAndArrowBehavior();
    }

    public void display() {
        System.out.print("Yey, I'm your queen");
    }
}