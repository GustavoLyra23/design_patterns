package facade;

public class ServerA implements Server {
    @Override
    public void start() {
        System.out.println("ServerA started");
    }
}
