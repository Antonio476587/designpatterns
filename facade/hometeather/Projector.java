package hometeather;

public class Projector {
    String description;
    DvdPlayer dvd;

    public Projector(String description, DvdPlayer dvd) {
        this.description = description;
        this.dvd = dvd;
    }

    public void on() {
        System.out.print(description + " on\n");
    }

    public void off() {
        System.out.print(description + " off\n");
    }

    public void wideScreenMode() {
        System.out.print(description + " in widescreen mode (16x9 aspect ratio)\n");
    }

    public void tvMode() {
        System.out.print(description + " in tv mode (4x3 aspect ratio)\n");
    }

    public String toString() {
        return description;
    }
}
