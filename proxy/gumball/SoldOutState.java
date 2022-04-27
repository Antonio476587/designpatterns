public class SoldOutState implements State{
    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.print("You can't insert a quarter, the machine is sold out\n");
    }

    public void ejectQuarter() {
        System.out.print("You can't eject, you haven't inserted a quarter yet\n");
    }

    public void turnCrank() {
        System.out.print("You turned, but there are no gumballs\n");
    }

    public void dispense() {
        System.out.print("No gumball dispensed\n");
    }

    public String toString() {
        return "Sold out the machine bro..ki...";
    }
}
