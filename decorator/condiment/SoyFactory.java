package decorator.condiment;

import decorator.Beverage;
import decorator.BeverageSize;

public class SoyFactory {
    public static Soy createSoyCondiment(Beverage beverage){
        if (BeverageSize.TALL.equals(beverage.getSize())){
            return new TallSoy(beverage);
        }else if (BeverageSize.GRANDE.equals(beverage.getSize())){
            return new GrandeSoy(beverage);
        }else if (BeverageSize.VENTI.equals(beverage.getSize())){
            return new VentiSoy(beverage);
        }else{
            throw new IllegalArgumentException("Input beverage has invalid size definition");
        }
    }
}
