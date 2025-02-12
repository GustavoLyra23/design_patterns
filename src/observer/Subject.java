package observer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String msg) {
        observers.forEach(observer -> observer.update(msg));
    }
}

class MainObserverPattern {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        var url = scanner.nextLine();
        Subject subject = new Subject();
        setSubjectData(subject);
        subject.getObservers().stream()
                .filter(obs -> {
                    if (obs instanceof ServerResponder responder){
                        return responder.getUrl().equals(url);
                    } else {
                        return false;
                    }
                }).forEach(obs ->
                        obs.update("Server is responding"));

    }

    private static void setSubjectData(Subject subject) {
        for (int i = 0; i < 3; i++) {
            subject.attach(new ServerResponder("localhost:8080"));
            subject.attach(new ServerResponder("localhost:3000"));
            subject.attach(new ClientResponder());
        }
    }
}

