package decorator;

public class WithSugar extends CoffeeDecorator {

    public WithSugar(Coffe coffe) {
        super(coffe);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }
}
