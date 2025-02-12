package decorator;

// Concrete decorator class that adds milk to coffe
public class WithMilk extends CoffeeDecorator {

    public WithMilk(Coffe coffe) {
        super(coffe);
    }

    public double getCost() {
        return super.getCost() + 1.5;
    }

    public String getDescription() {
        return super.getDescription() + ", milk";
    }
}
