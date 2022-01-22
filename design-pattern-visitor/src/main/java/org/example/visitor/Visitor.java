package org.example.visitor;

public interface Visitor {

    void visit(Engineer engineer);

    void visit(Manager manager);
}
