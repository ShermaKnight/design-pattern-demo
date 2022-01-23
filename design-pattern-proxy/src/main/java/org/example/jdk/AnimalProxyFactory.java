package org.example.jdk;

import java.lang.reflect.Proxy;

public class AnimalProxyFactory {

    public static Object getProxy(Object target) {
        AnimalInvocationHandler invocationHandler = new AnimalInvocationHandler();
        invocationHandler.setTarget(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocationHandler);
    }
}
