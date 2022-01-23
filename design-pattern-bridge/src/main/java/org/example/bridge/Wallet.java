package org.example.bridge;

public class Wallet extends Bag {

    @Override
    public String getName() {
        return "钱包" + ": " + color.getColor();
    }
}
