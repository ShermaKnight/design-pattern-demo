package org.example.strategy;

import java.util.List;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Double executeOperate(List<Number> numbers) {
        return this.strategy.doOperate(numbers);
    }
}
