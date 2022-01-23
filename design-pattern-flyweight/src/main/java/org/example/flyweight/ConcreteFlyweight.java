package org.example.flyweight;

public class ConcreteFlyweight implements Flyweight {

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
    }

    @Override
    public String getConnection(Pool pool) {
        return "jdbc:" + pool.getType() + "://" + pool.getHost() + ":" + pool.getPort();
    }
}
