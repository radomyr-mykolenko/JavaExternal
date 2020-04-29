import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }
    //@Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

   // @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i>=0){
            observers.remove(i);
        }
    }

   // @Override
    public void notifyObservers() {
        for (int i=0;i<observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    public void updateMeasurements() throws JsonProcessingException {
        JSONreguest jsoNreguest = new JSONreguest();
        String response = jsoNreguest.getRequest();
        ObjectMapper objectMapper = new ObjectMapper();
        //JSONreguest a = jsoNreguest.getRequest()
        //ObjectMapper main = objectMapper.readValue(response, ObjectMapper.class);


        System.out.println(response);
        //ObjectMapper objectMapper = new ObjectMapper(response);

    }
    /*public void updateMeasurements(String city){
        ApiRequestJSON apiRequestJSON = new ApiRequestJSON();
        String apiResponse = apiRequestJSON.getApiRequest(city);
        JSONObject jsonObject = new JSONObject(apiResponse);
        JSONObject main = (JSONObject)jsonObject.get("main");
        double temp = (Double) main.get("temp");
        int humid = (Integer) main.get("humidity");
        int press = (Integer) main.get("pressure");
        setMeasurements(temp,humid,press);
    }*/
}
