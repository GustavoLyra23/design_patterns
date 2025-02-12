package factory;

/*
  The idea of the Factory pattern is to have a Factory class that simplifies
  the creation of objects.
 */
public class AnimalFactory {
    public static Animal getAnimal(String type) {
        return switch (type) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            default -> throw new IllegalArgumentException("Invalid animal type: " + type);
        };
    }


}
