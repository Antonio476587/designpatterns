package observer;

public class DuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }
    public Quackable createRedHeadDuck() {
        return new RedHeadDuck();
    }
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
    public Quackable createDuckCall() {
        return new DuckCall();
    }
}
