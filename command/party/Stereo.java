public class Stereo {
    String location;
    int volume;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.print("Stereo on at " + location + "\n");
    }

    public void off() {
        System.out.print("Stereo off at " + location + "\n");
    }

    public void setCd() {
        System.out.print("CD running\n");
    }

    public void setDvd() {
        System.out.print("DVD running\n");
    }

    public void setRadio() {
        System.out.print("Listening Radio \n");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.print("Volume is " + volume + "\n");
    }

    public int getVolume() {
        return volume;
    }
}