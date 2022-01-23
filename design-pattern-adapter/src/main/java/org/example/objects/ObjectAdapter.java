package org.example.objects;

import org.example.clazz.Concrete;
import org.example.clazz.Target;

public class ObjectAdapter implements Target {

    private Concrete concrete;

    public ObjectAdapter(Concrete concrete) {
        this.concrete = concrete;
    }

    @Override
    public void request(Object... args) {
        concrete.specific(args);
    }
}
