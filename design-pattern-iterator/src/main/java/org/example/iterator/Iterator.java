package org.example.iterator;

public interface Iterator<T> {

    T first();

    T next();

    boolean hasNext();
}
