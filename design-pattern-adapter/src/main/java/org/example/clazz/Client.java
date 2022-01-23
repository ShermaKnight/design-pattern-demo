package org.example.clazz;

public class Client {

    public static void main(String[] args) {
        Target target = new ClassAdapter();
        target.request(1, 2, 3);
    }
}
