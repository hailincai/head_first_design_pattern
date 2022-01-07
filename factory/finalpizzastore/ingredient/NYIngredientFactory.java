package factory.finalpizzastore.ingredient;

import factory.finalpizzastore.ingredient.cheese.Cheese;
import factory.finalpizzastore.ingredient.cheese.ReggianoCheese;
import factory.finalpizzastore.ingredient.dough.Dough;
import factory.finalpizzastore.ingredient.dough.ThinCrustDough;
import factory.finalpizzastore.ingredient.sauce.MarinaraSauce;
import factory.finalpizzastore.ingredient.sauce.Sauce;
import factory.finalpizzastore.ingredient.seafood.FreshClams;
import factory.finalpizzastore.ingredient.seafood.SeaFood;

public class NYIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public SeaFood createSeaFood() {
        return new FreshClams();
    }
    
}
