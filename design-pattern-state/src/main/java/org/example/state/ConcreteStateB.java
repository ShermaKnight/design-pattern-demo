package org.example.state;

public class ConcreteStateB extends State {

    @Override
    void handler(Context context) {
        System.out.println("当前处于状态B");
        context.setState(new ConcreteStateA());
    }
}
