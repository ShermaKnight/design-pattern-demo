package org.example.objects;

import org.example.clazz.Concrete;
import org.example.clazz.Target;

public class Client {

    public static void main(String[] args) {
        Target target = new ObjectAdapter(new Concrete());
        target.request(1, 2, 3);
    }
}
