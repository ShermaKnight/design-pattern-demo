package org.example.command;

import java.util.Map;

public class Invoker<T> {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public Map call(T t) {
        return command.execute(t);
    }
}
