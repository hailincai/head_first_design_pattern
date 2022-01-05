package decorator.condiment;

import decorator.Beverage;
import decorator.BeverageSize;

public abstract class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public BeverageSize getSize(){
        return this.beverage.getSize();
    }
}
