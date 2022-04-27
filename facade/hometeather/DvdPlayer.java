package hometeather;

public class DvdPlayer {
    String description;
    int currentTrack;
    Amplifier amplifier;
    String movie;

    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.print(description + " on\n");
    }

    public void off() {
        System.out.print(description + " off\n");
    }

    public void eject() {
        movie = null;
        System.out.print(description + " eject\n");
    }

    public void play(String movie) {
        this.movie = movie;
        currentTrack = 0;
        System.out.print(description + " playing \"" + movie + "\"\n");
    }

    public void play(int track) {
        if (movie == null) {
            System.out.print(description + " can't play track " + track + " no dvd inserted\n");
        } else {
            currentTrack = track;
            System.out.print(description + " playing track " + currentTrack + " of \"" + movie + "\"\n");
        }
    }

    public void stop() {
        currentTrack = 0;
        System.out.print(description + " stopped \"" + movie + "\"\n");
    }

    public void pause() {
        System.out.print(description + " paused \"" + movie + "\"\n");
    }

    public void setTwoChannelAudio() {
        System.out.print(description + " set two channel audio\n");
    }

    public void setSurroundAudio() {
        System.out.print(description + " set surround audio\n");
    }

    public String toString() {
        return description;
    }
}
