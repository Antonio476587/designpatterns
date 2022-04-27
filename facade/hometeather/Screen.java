package hometeather;

public class Screen {
    String description;

    public Screen(String description) {
        this.description = description;
    }

    public void up() {
        System.out.print(description + " going up\n");
    }

    public void down() {
        System.out.print(description + " going down\n");
    }

    public String toString() {
        return description;
    }
}
