package org.example.observer;

public class ConcreteSubject extends Subject {

    @Override
    public void change() {
        System.out.println("具体目标发生了改变");
        Context context = new Context();
        observers.stream().forEach(observer -> observer.response(context));
    }
}
