package factory.finalpizzastore.ingredient;

import factory.finalpizzastore.ingredient.cheese.Cheese;
import factory.finalpizzastore.ingredient.cheese.MozzarelliaCheese;
import factory.finalpizzastore.ingredient.dough.Dough;
import factory.finalpizzastore.ingredient.dough.ThickCrustDough;
import factory.finalpizzastore.ingredient.sauce.PlumTomatoSauce;
import factory.finalpizzastore.ingredient.sauce.Sauce;
import factory.finalpizzastore.ingredient.seafood.FrozenClams;
import factory.finalpizzastore.ingredient.seafood.SeaFood;

public class ChicagoIngrendientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarelliaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public SeaFood createSeaFood() {
        return new FrozenClams();
    }
    
}
