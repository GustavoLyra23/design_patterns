package facade;

import static util.PrintUtil.println;

public interface Server {

    void start();

    default void sendRequest(String url) {
        println("Sending request to server "
                + url);
    }


}
