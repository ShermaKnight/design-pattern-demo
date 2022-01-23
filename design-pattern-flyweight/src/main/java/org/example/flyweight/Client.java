package org.example.flyweight;

public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Pool pool = new Pool("mysql-connection", "mysql", "127.0.0.1", "3306");
        Flyweight flyweightA1 = factory.getFlyweight("A");
        Flyweight flyweightA2 = factory.getFlyweight("A");
        System.out.println(flyweightA1 == flyweightA2);
    }
}
