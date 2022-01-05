package decorator;

public class DarkRoasted extends Beverage {
    public DarkRoasted() {
        this.description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
    
}
