public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

       CurrentConditions currentConditions = new CurrentConditions(weatherData);
        Statitics statitics = new Statitics(weatherData);
        Forecast forecast = new Forecast(weatherData);

        weatherData.setMeasurementsChanged(80, 65, 30.4f);
        weatherData.setMeasurementsChanged(82, 70, 29.2f);
        weatherData.setMeasurementsChanged(78, 90, 29.2f);
    }
}