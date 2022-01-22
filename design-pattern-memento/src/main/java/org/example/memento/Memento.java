package org.example.memento;

import lombok.Data;

@Data
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
