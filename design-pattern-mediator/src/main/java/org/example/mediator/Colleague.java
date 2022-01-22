package org.example.mediator;

public abstract class Colleague {

    protected Mediator mediator;
    protected Context context;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    protected abstract void send(String text);

    protected abstract void receive(Context context);
}
