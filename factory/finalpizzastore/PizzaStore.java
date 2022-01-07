package factory.finalpizzastore;

import factory.finalpizzastore.pizza.Pizza;

public abstract class PizzaStore {
    abstract Pizza createPizza(String type);

    public void orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
