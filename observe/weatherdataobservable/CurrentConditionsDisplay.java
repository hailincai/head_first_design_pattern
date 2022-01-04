package observe.weatherdataobservable;

public class CurrentConditionsDisplay extends WeatherDataSubscriber implements DisplayElement{

    @Override
    public void onNext(WeatherData item) {
        display(item);
        subscription.request(1);
    }

    @Override
    public void display(WeatherData data) {
        System.out.println("Current conditions: " + data.getTemprature() 
        + "F degrees and " + data.getHumidity() + "% humidity");        
    }
    
}
