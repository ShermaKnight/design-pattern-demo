package org.example.observer;

public class AObserver implements Observer {

    @Override
    public void response(Context context) {
        System.out.println("执行A观察者");
    }
}
