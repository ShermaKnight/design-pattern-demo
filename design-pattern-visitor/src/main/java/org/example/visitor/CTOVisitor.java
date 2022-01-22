package org.example.visitor;

public class CTOVisitor implements Visitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.userName + ", 代码行数: " + engineer.getCodes());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("产品经理: " + manager.userName + ", 月活大于百万的产品数量: " + manager.getProducts());
    }
}
