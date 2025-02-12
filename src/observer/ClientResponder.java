package observer;

public class ClientResponder implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("ClientResponder: " + msg);
    }
}
