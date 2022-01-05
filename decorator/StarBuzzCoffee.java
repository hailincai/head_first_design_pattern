package decorator;

import decorator.condiment.Mocha;
import decorator.condiment.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage2 = new DarkRoasted();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(String.format("%s $ %.2f", beverage2.getDescription(), beverage2.cost()));
    }
}
