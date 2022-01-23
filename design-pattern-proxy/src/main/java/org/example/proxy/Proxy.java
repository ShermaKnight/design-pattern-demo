package org.example.proxy;

public class Proxy implements Subject {

    private RealSubject subject;

    @Override
    public void execute() {
        if (subject == null) {
            subject = new RealSubject();
        }
        preExecute();
        subject.execute();
        postExecute();
    }

    private void preExecute() {
        System.out.println("访问真实主题之前预处理");
    }

    private void postExecute() {
        System.out.println("访问真实主题之后处理");
    }
}
