package observer;

public class ServerResponder implements Observer {

    private String url;

    public ServerResponder(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void update(String msg) {
        System.out.println("ServerResponder: " + msg);
    }
}
