package org.example.state;

public class ConcreteStateA extends State {

    @Override
    void handler(Context context) {
        System.out.println("当前处于状态A");
        context.setState(new ConcreteStateB());
    }
}
