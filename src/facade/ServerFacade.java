package facade;

public class ServerFacade {

    private ServerA serverA;
    private ServerB serverB;

    public ServerFacade() {
        serverA = new ServerA();
        serverB = new ServerB();
    }

    public void start() {
        serverA.start();
        serverB.start();
    }

    public void sendRequestA(String url) {
        serverA.sendRequest(url);
    }
}
