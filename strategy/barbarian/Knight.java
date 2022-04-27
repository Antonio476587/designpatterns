package poo.strategy.barbarian;

public class Knight extends Character {
    public Knight() {
        weapon = new AxeBehavior();
    }

    public void display() {
        System.out.print("I'M A KNIGHT");
    }
}