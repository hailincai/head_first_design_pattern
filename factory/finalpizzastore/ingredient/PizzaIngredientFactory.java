package factory.finalpizzastore.ingredient;

import factory.finalpizzastore.ingredient.cheese.Cheese;
import factory.finalpizzastore.ingredient.dough.Dough;
import factory.finalpizzastore.ingredient.sauce.Sauce;
import factory.finalpizzastore.ingredient.seafood.SeaFood;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Cheese createCheese();
    public Sauce createSauce();
    public SeaFood createSeaFood();
}
