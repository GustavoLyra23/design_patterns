package singleton;

/*
  The idea behind SingletonPattern is to have only one
  instance of a class
 */
public class Singleton {

    private static Singleton instance;

    //private constructor to avoid client applications to use constructor...
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton!");
    }


}
