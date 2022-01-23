package org.example.flyweight;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class FlyweightFactory {

    private ConcurrentHashMap<String, Flyweight> flyweights = new ConcurrentHashMap<>();

    public Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        }
        Flyweight flyweight = new ConcreteFlyweight(key);
        flyweights.put(key, flyweight);
        return flyweight;
    }
}
