package org.example.state;

public class Client {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.handler();
        context.handler();
    }
}
