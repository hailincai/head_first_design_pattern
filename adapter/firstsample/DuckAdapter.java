package adapter.firstsample;

import java.util.Random;

public class DuckAdapter implements Turkey {
    Duck duck;
    Random rand = new Random();

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        this.duck.quack();
    }

    @Override
    public void fly() {
        if (rand.nextInt(5) == 0){
            this.duck.fly();
        }
    }
    
}
