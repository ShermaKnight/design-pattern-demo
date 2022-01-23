package org.example.prototype;

public class Realize implements Cloneable {

    private String field;

    public Realize(String field) {
        this.field = field;
        System.out.println("对象实例化完成");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
