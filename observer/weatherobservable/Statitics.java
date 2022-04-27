import java.util.Observable;
import java.util.Observer;

public class Statitics implements Observer, DisplayElement {
    private float tempSum = 0.0f;
    private float minTemp = 200;
    private float maxTemp = 0.0f;
    private float tempAvg = 0.0f;
    private float temp = 0.0f;
    private int numReadings;
    private Observable observable;

    public Statitics(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object args) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            temp = weatherData.getTemperature();
            tempSum += temp;
            numReadings++;
            tempAvg = tempSum / numReadings;

            if (temp > maxTemp) {
                maxTemp = temp;
            }

            if (temp < minTemp) {
                minTemp = temp;
            }

            display();
        }
    }

    public void display() {
        System.out.print("max/avg/min temperature:" + maxTemp + "/" + tempAvg + "/" + minTemp + "\n");
    }
}