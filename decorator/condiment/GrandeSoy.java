package decorator.condiment;

import decorator.Beverage;

public class GrandeSoy extends Soy{

    public GrandeSoy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return 0.15 + this.beverage.cost();
    }
    
}
