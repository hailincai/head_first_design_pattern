package factory.finalpizzastore.pizza;

import factory.finalpizzastore.ingredient.cheese.Cheese;
import factory.finalpizzastore.ingredient.dough.Dough;
import factory.finalpizzastore.ingredient.sauce.Sauce;
import factory.finalpizzastore.ingredient.seafood.SeaFood;

public abstract class Pizza {
    String name;
    Dough dough;
    Cheese cheese;
    Sauce sauce;
    SeaFood seaFood;

    public abstract void prepare();

    public Pizza(String name){
        this.name = name;
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting pizza to diagonial slices");
    }

    public void box() {
        System.out.println("Place pizza in official box");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
        if (dough != null){
		    display.append(dough + "\n");
        }
        if (sauce != null){
		    display.append(sauce + "\n");
        }
        if (cheese != null) {
            display.append(cheese + "\n");
        }
        if (seaFood != null){
            display.append(seaFood + "\n");
        }
		return display.toString();
    }
}
