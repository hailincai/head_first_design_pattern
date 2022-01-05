package decorator;

import decorator.condiment.SoyFactory;

public class StarBuzzCoffeWithSize {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(); // base prices 1.99
        beverage.setSize(BeverageSize.TALL);

        Beverage wrap = SoyFactory.createSoyCondiment(beverage);
        System.out.println(String.format("%s $%.2f", wrap.getDescription(), wrap.cost()));

        beverage.setSize(BeverageSize.GRANDE);
        wrap = SoyFactory.createSoyCondiment(beverage);
        System.out.println(String.format("%s $%.2f", wrap.getDescription(), wrap.cost()));

        beverage.setSize(BeverageSize.VENTI);
        wrap = SoyFactory.createSoyCondiment(beverage);
        System.out.println(String.format("%s $%.2f", wrap.getDescription(), wrap.cost()));
    }
}
