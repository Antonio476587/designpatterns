package gumballmonitor;

public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.print("\nGumball Machine: " + gumballMachine.getLocation());
        System.out.print("\nCurrent inventory: " + gumballMachine.getCount() + " gumballs");
        System.out.print("\nCurrent state: " + gumballMachine.getState() + "\n");
    }
}
