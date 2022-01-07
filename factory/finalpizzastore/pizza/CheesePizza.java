package factory.finalpizzastore.pizza;

import factory.finalpizzastore.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    private PizzaIngredientFactory factory;

    public CheesePizza(PizzaIngredientFactory factory, String name){
        super(name);
        this.factory = factory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        this.dough = factory.createDough();
        this.cheese = factory.createCheese();
        this.sauce = factory.createSauce();
    }
    
}
