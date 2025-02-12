package proxy;

public class MainProxy {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        image.display();
        image.display();
    }
}
