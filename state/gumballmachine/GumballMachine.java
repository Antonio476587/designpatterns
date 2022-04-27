package gumballmachine;

public class GumballMachine {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.print("You can't insert another quarter\n");
        } else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.print("You inserted a quarter\n");
        } else if (state == SOLD_OUT) {
            System.out.print("You can't insert a quarter, the machine is sold out\n");
        } else if (state == SOLD) {
            System.out.print("Please wait, we're already giving you a gumball\n");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.print("Quarter returned\n");
            state = NO_QUARTER;
        } else if (state == NO_QUARTER) {
            System.out.print("You haven't inserted a quarter\n");
        } else if (state == SOLD) {
            System.out.print("Sorry, you already turned the crank\n");
        } else if (state == SOLD_OUT) {
            System.out.print("You can't eject, you haven't inserted a quarter yet\n");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.print("Turning twice doesn't get you another gumball!\n");
        } else if (state == NO_QUARTER) {
            System.out.print("You turned but there's no quarter\n");
        } else if (state == SOLD_OUT) {
            System.out.print("You turned, but there are no gumballs\n");
        } else if (state == HAS_QUARTER) {
            System.out.print("You turned...\n");
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.print("A gumball comes rolling out the slot\n");
            count = count - 1;
            if (count == 0) {
                System.out.print("Oops, out of gumballs!\n");
                state = SOLD_OUT;
            } else {
                state = NO_QUARTER;
            }
        } else if (state == NO_QUARTER) {
            System.out.print("You need to pay first\n");
        } else if (state == SOLD_OUT) {
            System.out.print("No gumball dispensed\n");
        } else if (state == HAS_QUARTER) {
            System.out.print("No gumball dispensed\n");
        }
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = NO_QUARTER;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n\n\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        if (state == SOLD_OUT) {
            result.append("sold out");
        } else if (state == NO_QUARTER) {
            result.append("waiting for quarter");
        } else if (state == HAS_QUARTER) {
            result.append("waiting for turn of crank");
        } else if (state == SOLD) {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }
}