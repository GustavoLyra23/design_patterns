package decorator;

import static util.PrintUtil.println;

// The decorator pattern is used to extend or alter the functionality of objects at runtime
// by wrapping them in an object of a decorator class.
public class MainDecorator {
    public static void main(String[] args) {
        Coffe coffee = new SimpleCoffe();
        println(coffee.getDescription() + " price " + coffee.getCost());
        coffee = new WithMilk(coffee);
        println(coffee.getDescription() + " price " + coffee.getCost());
        coffee = new WithSugar(coffee);
        println(coffee.getDescription() + " price " + coffee.getCost());
    }
}
