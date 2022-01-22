package org.example.visitor;

import java.util.Random;

public abstract class Staff {

    protected String userName;
    protected int kpi;

    public Staff(String userName) {
        this.userName = userName;
        this.kpi = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);
}
