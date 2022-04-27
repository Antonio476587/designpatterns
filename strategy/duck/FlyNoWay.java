package poo.strategy.duck;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.print("I cant fly\n");
    }
}