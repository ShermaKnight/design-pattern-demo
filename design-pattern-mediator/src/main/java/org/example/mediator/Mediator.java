package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {

    protected abstract void register(Colleague colleague);

    protected abstract void relay(Colleague colleague);
}
