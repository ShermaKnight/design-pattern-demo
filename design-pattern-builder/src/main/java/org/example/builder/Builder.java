package org.example.builder;

public abstract class Builder {

    protected User user = new User();

    abstract void buildBase();

    abstract void buildSchool();

    abstract void buildAddress();

    public User getUser() {
        return user;
    }
}
