package org.example.visitor;

public class CEOVisitor implements Visitor {

    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师: " + engineer.userName + ", KPI: " + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("产品经理: " + manager.userName + ", KPI: " + manager.kpi + ", 月活大于百万的产品数量: " + manager.getProducts());
    }
}
