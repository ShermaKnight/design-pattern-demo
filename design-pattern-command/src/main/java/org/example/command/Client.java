package org.example.command;

public class Client {

    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ConcreteCommand());
        System.out.println(invoker.call("Rain is falling all around"));
    }
}
