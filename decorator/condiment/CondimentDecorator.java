package decorator.condiment;

import decorator.Beverage;
import decorator.BeverageSize;

/**
 * CondimentDecorator extends Beverage, 
 * So the CondimentDecorator has the same type as any Beverage
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
    public abstract BeverageSize getSize();
}
