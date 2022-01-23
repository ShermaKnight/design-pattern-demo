package org.example.bridge;

public class Client {

    public static void main(String[] args) {
        Bag bag = new Wallet();
        bag.setColor(new RedColor());
        System.out.println(bag.getName());
    }
}
