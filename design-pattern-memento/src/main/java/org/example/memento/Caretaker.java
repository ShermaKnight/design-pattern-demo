package org.example.memento;

import lombok.Data;

import java.util.Stack;

@Data
public class Caretaker {

    private Stack<Memento> mementos = new Stack<>();

    public Caretaker takeMemento(Memento memento) {
        mementos.add(memento);
        return this;
    }

    public void clear() {
        mementos.clear();
    }

    public Memento pop() {
        return mementos.pop();
    }
}
