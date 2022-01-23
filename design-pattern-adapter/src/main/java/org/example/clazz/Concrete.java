package org.example.clazz;

import java.util.Arrays;

public class Concrete {

    public void specific(Object... args) {
        System.out.println("适配者执行: " + Arrays.asList(args));
    }
}
