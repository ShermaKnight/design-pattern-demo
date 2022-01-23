package org.example.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalInvocationHandler implements InvocationHandler {

    private Object target;
    private long startTime;

    public void setTarget(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preInvoke(args);
        Object invoke = method.invoke(target, args);
        postInvoke(args);
        return invoke;
    }

    private void preInvoke(Object[] args) {
        this.startTime = System.currentTimeMillis();
    }

    private void postInvoke(Object[] args) {
        System.out.println("执行耗时: " + (System.currentTimeMillis() - startTime));
    }
}
