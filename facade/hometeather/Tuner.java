package hometeather;

public class Tuner {
    String description;
    Amplifier amplifier;
    double frequency;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
    }

    public void on() {
        System.out.print(description + " on\n");
    }

    public void off() {
        System.out.print(description + " off\n");
    }

    public void setFrequency(double frequency) {
        System.out.print(description + " setting frequency to " + frequency + "\n");
        this.frequency = frequency;
    }

    public void setAm() {
        System.out.print(description + " setting AM mode\n");
    }

    public void setFm() {
        System.out.print(description + " setting FM mode\n");
    }

    public String toString() {
        return description;
    }
}
