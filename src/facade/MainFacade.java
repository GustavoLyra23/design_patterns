package facade;

public class MainFacade {

    public static void main(String[] args) {
        ServerFacade serverFacade = new ServerFacade();
        serverFacade.sendRequestA("localhost:8080");
    }
}
