package org.example.visitor;

import lombok.Data;

public class Engineer extends Staff {

    private Long codes;

    public Engineer(String userName, Long codes) {
        super(userName);
        this.codes = codes;
    }

    public Long getCodes() {
        return codes;
    }

    public void setCodes(Long codes) {
        this.codes = codes;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
