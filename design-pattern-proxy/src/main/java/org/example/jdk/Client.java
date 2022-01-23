package org.example.jdk;

import cn.hutool.aop.ProxyUtil;
import cn.hutool.aop.aspects.TimeIntervalAspect;
import org.example.entity.Animal;
import org.example.entity.Cat;

@SuppressWarnings("all")
public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        // client.hutoolProxy();
        client.commonProxy();
    }

    private void commonProxy() {
        Animal animal = (Animal) AnimalProxyFactory.getProxy(new Cat());
        animal.eat();
    }

    private void hutoolProxy() {
        Animal proxy = ProxyUtil.proxy(new Cat(), TimeIntervalAspect.class);
        proxy.eat();
    }
}
