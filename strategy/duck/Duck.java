package poo.strategy.duck;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck() {}

    public abstract void display();

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void perfomQuack() {
        quackBehavior.quack();
    }

    public void perfomFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.print("Every duck swim, even decoys\n");
    }
}