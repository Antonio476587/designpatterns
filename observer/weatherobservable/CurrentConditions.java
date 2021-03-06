import java.util.Observable;
import java.util.Observer;

public class CurrentConditions implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditions(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object args) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.print("Current conditions: " + temperature+ "F degrees and " + humidity + "% humidity");
    }
}