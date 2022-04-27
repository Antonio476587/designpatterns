package poo.strategy.duck;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.print("Quack\n");
    }
}
