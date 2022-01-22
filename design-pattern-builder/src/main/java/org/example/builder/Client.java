package org.example.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());
        User user = director.construct();
        System.out.println(user);
    }
}
