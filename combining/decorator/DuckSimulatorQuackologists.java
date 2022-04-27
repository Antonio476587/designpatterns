package decorator;

public class DuckSimulatorQuackologists {
    public static void main(String[] args) {
        DuckSimulatorQuackologists duckSimulator = new DuckSimulatorQuackologists();
        duckSimulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseAdapater = new GooseAdapter(new Goose());

        System.out.print("\nDuck Simulator: Counting with decorator\n");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapater);

        // System.out.print("The mallard duck " + mallardDuck.getQuacks() + " times\n");
        System.out.print("The ducks quacked " + QuackCounter.getQuacks() + " times\n");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
