package org.example.memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("第一次设置状态");
        Caretaker caretaker = new Caretaker();
        caretaker.takeMemento(originator.createMemento());
        System.out.println(originator.getState());

        originator.setState("第二次设置状态");
        caretaker.takeMemento(originator.createMemento());
        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.pop());
        System.out.println(originator.getState());

        originator.restoreMemento(caretaker.pop());
        System.out.println(originator.getState());
    }
}
