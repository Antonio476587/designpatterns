package poo.strategy.duck;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.print("I'm flying with a rocket");
    }
}