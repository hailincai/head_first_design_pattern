package decorator.condiment;

import decorator.Beverage;

public class TallSoy extends Soy{
    public TallSoy(Beverage beverage){
        super(beverage);
    }

    @Override
    public double cost() {
        return .10 + this.beverage.cost();
    }
    
    
}
