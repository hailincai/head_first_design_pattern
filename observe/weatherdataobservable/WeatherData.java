package observe.weatherdataobservable;

public class WeatherData {
    private float temprature;
    private float humidity;
    private float pressure;

    public WeatherData(float temprature, float humidity, float pressure){
        this.temprature = temprature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemprature() {
        return this.temprature;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }
}
