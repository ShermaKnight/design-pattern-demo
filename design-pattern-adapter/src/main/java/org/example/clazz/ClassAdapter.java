package org.example.clazz;

public class ClassAdapter extends Concrete implements Target {

    @Override
    public void request(Object... args) {
        specific(args);
    }
}
