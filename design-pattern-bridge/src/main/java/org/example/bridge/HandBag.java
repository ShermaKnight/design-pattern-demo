package org.example.bridge;

public class HandBag extends Bag {

    @Override
    public String getName() {
        return "挎包" + ": " + color.getColor();
    }
}
