package gumballstatewinner;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.print("You inserted a quarter\n");
    }

    public void ejectQuarter() {
        System.out.print("You haven't inserted a quarter\n");
    }

    public void turnCrank() {
        System.out.print("You turned but there's no quarter\n");
    }

    public void dispense() {
        System.out.print("You need to pay first\n");
    }

}
