package org.example.jdk;

public class Client {

    public static void main(String[] args) {
        OilFutures oil = new OilFutures();
        oil.addObserver(new Bear());
        oil.addObserver(new Bull());
        oil.setPrice(10);
        oil.setPrice(-9);
    }
}
