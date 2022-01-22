package org.example.visitor;

public class Client {

    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();
        System.out.println("CEO报表: ");
        report.showReport(new CEOVisitor());

        System.out.println();
        System.out.println("CTO报表: ");
        report.showReport(new CTOVisitor());
    }
}
