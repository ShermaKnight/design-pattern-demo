package org.example.command;

import java.util.Map;
import java.util.Optional;

public class ConcreteCommand implements Command<String, Map<String, Integer>> {

    private Receiver receiver;

    public ConcreteCommand() {
        if (!Optional.ofNullable(receiver).isPresent()) {
            receiver = new Receiver();
        }
    }

    @Override
    public Map<String, Integer> execute(String s) {
        return receiver.action(s);
    }
}
