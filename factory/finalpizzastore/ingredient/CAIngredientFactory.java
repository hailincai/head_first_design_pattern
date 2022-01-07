package factory.finalpizzastore.ingredient;

import factory.finalpizzastore.ingredient.cheese.Cheese;
import factory.finalpizzastore.ingredient.cheese.GoatCheese;
import factory.finalpizzastore.ingredient.dough.Dough;
import factory.finalpizzastore.ingredient.dough.VeryThinCrustDough;
import factory.finalpizzastore.ingredient.sauce.BruschettaSauce;
import factory.finalpizzastore.ingredient.sauce.Sauce;
import factory.finalpizzastore.ingredient.seafood.Camari;
import factory.finalpizzastore.ingredient.seafood.SeaFood;

public class CAIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new VeryThinCrustDough();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public SeaFood createSeaFood() {
        return new Camari();
    }
    
}
