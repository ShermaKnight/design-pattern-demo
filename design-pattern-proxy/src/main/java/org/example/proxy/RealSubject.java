package org.example.proxy;

public class RealSubject implements Subject {

    @Override
    public void execute() {
        System.out.println("执行真实主题方法");
    }
}
