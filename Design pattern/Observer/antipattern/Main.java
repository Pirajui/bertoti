package antipattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();


        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();


        subject.addObserver(observer1);
        subject.addObserver(observer2);


        int newState = 42;
        subject.setState(newState);
    }
}


class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}

interface Observer {
    void update(int state);
}

class ConcreteObserver implements Observer {
    @Override
    public void update(int state) {
        System.out.print("Oiiiiiiii");
    }
}
