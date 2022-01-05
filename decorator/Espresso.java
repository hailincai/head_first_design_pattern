package decorator;

public class Espresso extends Beverage{
    public Espresso(){
       this.description = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
    
}
