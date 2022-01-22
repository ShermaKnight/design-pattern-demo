package org.example.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public User construct() {
        builder.buildBase();
        builder.buildSchool();
        builder.buildAddress();
        return builder.getUser();
    }
}
