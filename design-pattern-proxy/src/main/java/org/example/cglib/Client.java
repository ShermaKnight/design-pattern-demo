package org.example.cglib;

import cn.hutool.aop.ProxyUtil;
import cn.hutool.aop.aspects.TimeIntervalAspect;
import org.example.entity.Animal;
import org.example.entity.Cat;

@SuppressWarnings("all")
public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.commonProxy();
        client.hutoolProxy();
    }

    private void commonProxy() {
        Cat cat = (Cat) new CglibInterceptor(new Cat()).getProxy();
        cat.eat();
    }

    private void hutoolProxy() {
        Cat cat = ProxyUtil.proxy(new Cat(), TimeIntervalAspect.class);
        cat.eat();
    }
}
