package gumballmonitor;

public class GumballMachineTestDemo {
    public static void main(String[] args) {
        int count = 0;

        if (args.length < 2) {
            System.out.print("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(args[0], count);

        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        System.out.print(gumballMachine);
        monitor.report();

        gumballMachine.insertQuarter();
        monitor.report();

        gumballMachine.ejectQuarter();
        monitor.report();

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        monitor.report();

        for (int i = gumballMachine.getCount(); i > 0; i--) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }
        monitor.report();
    }
}
