package org.example.iterator;

public interface Aggregate<T> {

    void add(T t);

    void remove(T t);

    Iterator getIterator();
}
