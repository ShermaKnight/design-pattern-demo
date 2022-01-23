package org.example.entity;

import cn.hutool.core.lang.Console;

public class Cat implements Animal {

    @Override
    public void eat() {
        Console.log("猫吃鱼");
    }
}
