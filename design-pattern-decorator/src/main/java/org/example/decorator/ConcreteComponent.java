package org.example.decorator;

public class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("执行操作");
    }
}
