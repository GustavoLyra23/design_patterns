package observer;

/*
   The idea of the Observer pattern is to have a Subject that
   maintains a list of Observers.
   When the Subject changes, it notifies all the Observers.
 */
public interface Observer {
    void update(String msg);
}
