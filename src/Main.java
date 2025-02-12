import factory.AnimalFactory;
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton.getInstance().showMessage();
        AnimalFactory.getAnimal("dog").speak();
        AnimalFactory.getAnimal("cat").speak();
    }
}
