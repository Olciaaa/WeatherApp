package pl.edu.agh.to2.example.weather;

import pl.edu.agh.to2.example.weather.measures.AirCondition;
import pl.edu.agh.to2.example.weather.measures.Forecast;
import pl.edu.agh.to2.example.weather.measures.Temperature;

public class Weather {
    private String locationName;
    private Forecast forecast;
    private Temperature temperature;
    private AirCondition airCondition;
    private double temperatureCelsius;

    public AirCondition getAirCondition() {
        return airCondition;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public double getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setAirCondition(AirCondition airCondition) {
        this.airCondition = airCondition;
    }

    public void setForecast(Forecast forecast) {
        this.forecast = forecast;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }
}
