import java.util.*;

public class StatiticsDisplay implements Observer, DisplayElement {
    private float tempSum = 0.0f;
    private float minTemp = 200;
    private float maxTemp = 0.0f;
    private float tempAvg = 0.0f;
    private int numReadings;
    private Subject weatherData;

    public StatiticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registryObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
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

    public void display() {
        System.out.print("max/avg/min temperature:" + maxTemp + "/" + tempAvg + "/" + minTemp + "\n");
    }
}