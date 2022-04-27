package hometeather;

public class TheaterLights {
    String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void on() {
        System.out.print(description + " on\n");
    }

    public void off() {
        System.out.print(description + " off\n");
    }

    public void dim(int level) {
        System.out.print(description + " dimming to " + level + "%\n");
    }

    public String toString() {
        return description;
    }
}
