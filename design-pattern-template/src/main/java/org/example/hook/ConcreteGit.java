package org.example.hook;

public class ConcreteGit extends Git {

    @Override
    public boolean commitBefore() {
        return true;
    }

    @Override
    void gitPull() {
        System.out.println("git stash");
        System.out.println("git pull origin main");
        System.out.println("git stash pop");
    }
}
