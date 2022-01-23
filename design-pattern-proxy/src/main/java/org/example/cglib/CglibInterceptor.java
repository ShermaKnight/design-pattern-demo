package org.example.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibInterceptor implements MethodInterceptor {

    private Object target;
    private long startTime;

    public CglibInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
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

    public Object getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(target.getClass());
        return enhancer.create();
    }
}
