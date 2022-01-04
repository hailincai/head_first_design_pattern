package observe.weatherdata;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemp = 200;
    private float maxTemp = 0;
    private int updateTimes = 0;
    private float tempSum = 0;

    public StatisticsDisplay(Subject subject){
        subject.addObserver(this);
    }

    @Override
    public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / updateTimes)
			+ "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (temp < minTemp){
            minTemp = temp;
        }
        if (temp > maxTemp){
            maxTemp = temp;
        }

        tempSum += temp;
        updateTimes++;
        display();
    }
    
}
