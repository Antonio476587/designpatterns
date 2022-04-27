import java.util.Observable;
import java.util.Observer;
import java.util.*;

public class Forecast implements Observer, DisplayElement {
    private float lastPressure;
    private float currentPressure = 29.92f;
    private Observable observable;

    public Forecast(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.print("Forecast measurements:");
        if (currentPressure > lastPressure) {
            System.out.print("Al parecer el clima esta mejorando\n");
        }
        if (currentPressure == lastPressure) {
            System.out.print("El mismo clima\n");
        }
        if (currentPressure < lastPressure) {
            System.out.print("Chaparron wowowowuauwuauwuuauawu\n");
        }
    }
}