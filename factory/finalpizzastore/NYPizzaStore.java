package factory.finalpizzastore;

import factory.finalpizzastore.ingredient.NYIngredientFactory;
import factory.finalpizzastore.ingredient.PizzaIngredientFactory;
import factory.finalpizzastore.pizza.CheesePizza;
import factory.finalpizzastore.pizza.ClamPizza;
import factory.finalpizzastore.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    private PizzaIngredientFactory factory = new NYIngredientFactory();

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)){
            return new CheesePizza(factory, "NY Style cheese pizza");
        }else if ("clam".equals(type)){
            return new ClamPizza(factory, "NY Style Clam pizza");
        }else{
            return null;
        }
    }
    
}
