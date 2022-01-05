package decorator.condiment;

import decorator.Beverage;

public class VentiSoy extends Soy {

    public VentiSoy(Beverage beverage){
        super(beverage);
    }

    @Override
    public double cost() {
        return .20 + this.beverage.cost();
    }
    
}
