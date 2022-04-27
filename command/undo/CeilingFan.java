public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        System.out.print(location + " ceiling fan is on high\n");
        speed = HIGH;
    }

    public void medium() {
        System.out.print(location + " ceiling fan is on medium\n");
        speed = MEDIUM;
    }

    public void low() {
        System.out.print(location + " ceiling fan is on low\n");
        speed = LOW;
    }

    public void off() {
        System.out.print(location + " ceiling fan is off\n");
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }

    public void on() {
        System.out.print("Ceiling fan on at " + location + "\n");
    }
}