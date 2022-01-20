package org.example.observer;

public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.add(new AObserver());
        subject.add(new BObserver());
        subject.change();
    }
}
