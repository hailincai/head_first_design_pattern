package decorator.condiment;

import decorator.Beverage;
import decorator.BeverageSize;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    // beverage is the object which need to be decorated
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost(); // change the behavior of decorated object
    }

    @Override
    public BeverageSize getSize() {
        return this.beverage.getSize();
    }

}
