package observe.weatherdataobservable;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscription;

public abstract class WeatherDataSubscriber implements Flow.Subscriber<WeatherData> {
    protected Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable){
        System.err.println("Get error:" + throwable.getMessage());
    }

    @Override
    public void onComplete(){
        // happen when publisher shutdown the stream
        System.out.println("Subscription has been terminated...");
    }
}
