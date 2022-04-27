public class Light {
    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.print("Lighted it up in " + location + "\n");
    }

    public void off() {
        System.out.print("Lighted it off in " + location + "\n");
    }
}