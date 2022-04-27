package gumballmonitor;

public class GumballMachine {
    State soldState;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State winnerState;

    State state = soldOutState;
    int count = 0;
    String location;

    public GumballMachine(String location, int count) {
        this.location = location;
        this.count = count;
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        winnerState = new WinnerState(this);

        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void releaseBall() {
        System.out.print("A gumball comes rolling out the slot...\n");
        if (count != 0) {
            count = count - 1;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void refill(int numGumBalls) {
        this.count = numGumBalls;
        state = noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    public State getState() {
        return state;
    }

    public String getLocation() {
        return location;
    }

    public void setState(State state) {
        this.state = state;
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
        if (state == soldOutState) {
            result.append("sold out");
        } else if (state == noQuarterState) {
            result.append("waiting for quarter");
        } else if (state == hasQuarterState) {
            result.append("waiting for turn of crank");
        } else if (state == soldState) {
            result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }
}