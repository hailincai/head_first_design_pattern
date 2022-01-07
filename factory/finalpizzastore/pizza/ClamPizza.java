package factory.finalpizzastore.pizza;

import factory.finalpizzastore.ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    private PizzaIngredientFactory factory;

    public ClamPizza(PizzaIngredientFactory factory, String name) {
        super(name);
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        this.dough = factory.createDough();
        this.cheese = factory.createCheese();
        this.sauce = factory.createSauce();
        this.seaFood = factory.createSeaFood();
    }
    
}
