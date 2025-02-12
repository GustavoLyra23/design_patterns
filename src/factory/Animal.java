package factory;

public interface Animal {
    default void speak() {
        System.out.println("I am an animal");
    }
}
