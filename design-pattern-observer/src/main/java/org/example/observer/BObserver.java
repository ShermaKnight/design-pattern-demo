package org.example.observer;

public class BObserver implements Observer {

    @Override
    public void response(Context context) {
        System.out.println("执行B观察者");
    }
}
