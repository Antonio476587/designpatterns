public class CeilingFan {
    String location;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void on() {
        System.out.print("Ceiling fan on at " + location + "\n");
    }

    public void off() {
        System.out.print("Ceiling fan off at " + location + "\n");
    }
}