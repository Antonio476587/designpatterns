public class TV {
    String location;
    int channel;
    int volume;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.print("TV on at " + location + "\n");
    }

    public void off() {
        System.out.print("TV off at " + location + "\n");
    }

    public void setInputChannel(int channel) {
        this.channel = channel;
        System.out.print("Channel is " + channel + "\n");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.print("Volume is " + volume + "\n");
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }
}