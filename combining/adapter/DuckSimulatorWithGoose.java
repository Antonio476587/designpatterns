package adapter;

public class DuckSimulatorWithGoose {
    public static void main(String[] args) {
        DuckSimulatorWithGoose duckSimulator = new DuckSimulatorWithGoose();
        duckSimulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redHeadDuck = new RedHeadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseAdapater = new GooseAdapter(new Goose());

        System.out.print("\nDuck Simulator: With Goose\n");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdapater);
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
