package org.example.prototype;

import lombok.SneakyThrows;

public class Client {

    @SneakyThrows
    public static void main(String[] args) {
        Realize realize = new Realize("field");
        System.out.println(realize == realize.clone());
    }
}
