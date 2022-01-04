package observe.weatherdata;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature 
        + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
    
}
