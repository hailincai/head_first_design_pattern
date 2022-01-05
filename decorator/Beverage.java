package decorator;

public abstract class Beverage {
    String description = "Unknown Beverage";
    BeverageSize size;

    public void setSize(BeverageSize size){
        this.size = size;
    }

    public BeverageSize getSize(){
        return this.size;
    }

    public String getDescription(){
        return this.description;
    }

    abstract public double cost();
}
