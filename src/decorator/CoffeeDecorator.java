package decorator;

// Abstract decorator class - note that it implements Coffe interface
abstract class CoffeeDecorator implements Coffe {
    protected Coffe coffe;

    public CoffeeDecorator(Coffe coffe) {
        this.coffe = coffe;
    }

    @Override
    public double getCost() {
        return coffe.getCost();
    }

    @Override
    public String getDescription() {
        return coffe.getDescription();
    }
}
