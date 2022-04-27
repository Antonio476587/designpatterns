package observer;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator duckSimulator = new DuckSimulator();
		CountingDuckFactory duckFactory = new CountingDuckFactory();
		duckSimulator.simulate(duckFactory);
	}

	void simulate(AbstractDuckFactory duckFactory) {
		Quackable redHeadDuck = duckFactory.createRedHeadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseDuckFactory().createGoose();

		System.out.print("\nDuck Simulator: With Observer - Flocks");

		Flock flockOfDucks = new Flock();

		flockOfDucks.add(redHeadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallards = new Flock();

		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		flockOfDucks.add(flockOfMallards);

		System.out.print("\nDuck Simulator: Whole Flock Simulation\n");
		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		simulate(flockOfDucks);

		System.out.print("\nDuck Simulator: Mallard Flock Simulation\n");
		simulate(flockOfMallards);
		System.out.print("\n\nThe ducks quacked " + QuackCounter.getQuacks() + " times\n");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
