package decorator.condiment;

import decorator.Beverage;
import decorator.BeverageSize;

public class Whip extends CondimentDecorator{
    private Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .20 + this.beverage.cost();
    }

    @Override
    public BeverageSize getSize() {
        return this.beverage.getSize();
    }
}
