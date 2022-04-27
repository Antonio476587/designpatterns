import java.util.*;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registryObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
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