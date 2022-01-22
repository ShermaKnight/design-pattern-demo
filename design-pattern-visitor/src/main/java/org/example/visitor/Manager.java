package org.example.visitor;

public class Manager extends Staff {

    private Long products = 0l;

    public Manager(String userName, Long products) {
        super(userName);
        this.products = products;
    }

    public Long getProducts() {
        return products;
    }

    public void setProducts(Long products) {
        this.products = products;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
