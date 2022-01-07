package factory.simplefactory;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        if ("clam".equals(type)){
            return new ClamPizza();
        }else if ("cheese".equals(type)){
            return new CheesePizza();
        }else if ("veggie".equals(type)){
            return new VeggiePizza();
        }else if ("pepperoni".equals(type)){
            return new PepperoniPizza();
        }else{
            return null;
        }
    }
}
