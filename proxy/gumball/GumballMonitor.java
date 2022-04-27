import java.rmi.*;

public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.print("\nGumball Machine: " + gumballMachine.getLocation());
            System.out.print("\nCurrent inventory: " + gumballMachine.getCount() + " gumballs");
            System.out.print("\nCurrent state: " + gumballMachine.getState() + "\n");
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }
}
