package facade;

public class ServerB implements Server {
    @Override
    public void start() {
        System.out.println("Server B started");
    }
}
