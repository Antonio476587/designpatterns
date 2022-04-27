public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.print("Opening the garage door\n");
    }

    public void down() {
        System.out.print("Closing the garage door\n");
    }

    public void stop() {
        System.out.print("Stoping any action\n");
    }

    public void lightOn() {
        System.out.print("Turning on the lights\n");
    }

    public void lightOff() {
        System.out.print("Turning of the lights\n");
    }
}