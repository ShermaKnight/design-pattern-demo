package org.example.memento;

import lombok.Data;

@Data
public class Originator {

    private String state;

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
