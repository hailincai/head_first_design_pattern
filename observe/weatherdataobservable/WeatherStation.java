package observe.weatherdataobservable;

import java.util.Random;
import java.util.concurrent.SubmissionPublisher;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeatherStation {
    public static void main(String[] args) throws Exception {
        SubmissionPublisher<WeatherData> publisher = new WeatherDataPublisher();
        CurrentConditionsDisplay currentConditionDisplay = new CurrentConditionsDisplay();

        publisher.subscribe(currentConditionDisplay);
        Random random = new Random();
        Stream.iterate(1, n -> n + 1)
                .parallel()
                .map(n -> new WeatherData(random.nextFloat(), random.nextFloat(), random.nextFloat()))
                .limit(20)
                .collect(Collectors.toList())
                .forEach(publisher::submit);        
        
        Thread.sleep(10000);
        publisher.close();
    }
}
