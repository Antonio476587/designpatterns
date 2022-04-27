public class WinnerState implements State {
    transient GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.print("Please wait, we're already giving you two gumballs\n");
    }

    public void ejectQuarter() {
        System.out.print("Sorry, you already turned the crank\n");
    }

    public void turnCrank() {
        System.out.print("Turning twice doesn't get you more gumballs!\n");
    }

    public void dispense() {
        System.out.print("YOU'RE A WINNER! You get two gumballs for your quarter\n");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
            	System.out.println("Oops, out of gumballs!\n");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
    }

    public String toString() {
        return "Ya yo 'toy tan millonario que si quiero me retiro";
    }

}
