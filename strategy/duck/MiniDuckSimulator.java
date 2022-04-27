package poo.strategy.duck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.perfomFly();
        mallard.perfomQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.perfomQuack();
        modelDuck.perfomFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.perfomFly();
    }
}