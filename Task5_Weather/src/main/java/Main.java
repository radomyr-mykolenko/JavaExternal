import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(10, 50, 56.4F);
        weatherData.setMeasurements(11, 52, 56.6F);
        weatherData.setMeasurements(23, 40, 30.6F);

        try {
            weatherData.updateMeasurements();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }
}
