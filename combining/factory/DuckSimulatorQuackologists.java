package factory;

public class DuckSimulatorQuackologists {
    public static void main(String[] args) {
        DuckSimulatorQuackologists duckSimulator = new DuckSimulatorQuackologists();
        CountingDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseAdapater = new GooseDuckFactory().createGoose();

        System.out.print("\nDuck Simulator: Counting with decorator\n");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapater);

        System.out.print("The ducks quacked " + QuackCounter.getQuacks() + " times\n");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
