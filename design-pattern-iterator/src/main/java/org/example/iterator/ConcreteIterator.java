package org.example.iterator;

import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {

    private List<T> list;
    private int index = -1;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public T first() {
        return list.get(0);
    }

    @Override
    public T next() {
        if (hasNext()) {
            return list.get(++index);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return index < list.size() - 1;
    }
}
