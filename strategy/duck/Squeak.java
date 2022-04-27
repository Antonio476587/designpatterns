package poo.strategy.duck;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.print("Squeak\n");
    }
}