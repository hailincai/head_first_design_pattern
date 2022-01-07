package factory.finalpizzastore;

import factory.finalpizzastore.ingredient.ChicagoIngrendientFactory;
import factory.finalpizzastore.ingredient.PizzaIngredientFactory;
import factory.finalpizzastore.pizza.CheesePizza;
import factory.finalpizzastore.pizza.ClamPizza;
import factory.finalpizzastore.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    private PizzaIngredientFactory factory = new ChicagoIngrendientFactory();

    @Override
    Pizza createPizza(String type) {
        if ("cheese".equals(type)){
            return new CheesePizza(factory, "Chicago Style Chees pizza");
        }else if ("clam".equals(type)){
            return new ClamPizza(factory, "Chicago Style Clam pizza");
        }else{
            return null;
        }
    }
    
}
