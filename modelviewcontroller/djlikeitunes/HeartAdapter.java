public class HeartAdapter implements BeatModelInterface {
    HeartModelInterface heartModel;

    public HeartAdapter(HeartModelInterface heartModel) {
        this.heartModel = heartModel;
    }

    public void initialize() {
    }

    public void on() {
    }

    public void off() {
    }

    public int getBPM() {
        return heartModel.getHeartRate();
    }

    public void setBPM(int bpm) {
    }

    public void registerObserver(BeatObserver o) {
        heartModel.registerObserver(o);
    }

    public void removeObserver(BeatObserver o) {
        heartModel.removeObserver(o);
    }

    public void registerObserver(BPMObserver o) {
        heartModel.registerObserver(o);
    }

    public void removeObserver(BPMObserver o) {
        heartModel.removeObserver(o);
    }
}
