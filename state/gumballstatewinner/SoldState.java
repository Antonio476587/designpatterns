package gumballstatewinner;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.print("Please wait, we're already giving you a gumball\n");
    }

    public void ejectQuarter() {
        System.out.print("Sorry, you already turned the crank\n");
    }

    public void turnCrank() {
        System.out.print("Turning twice doesn't get you another gumball!\n");
    }

	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Oops, out of gumballs!\n");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}
