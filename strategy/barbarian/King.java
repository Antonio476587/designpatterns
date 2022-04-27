package poo.strategy.barbarian;

public class King extends Character {
    public King() {
        weapon = new SwordBehavior();
    }

    public void display() {
        System.out.print("This is my kingdom");
    }
}