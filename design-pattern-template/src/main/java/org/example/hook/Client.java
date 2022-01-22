package org.example.hook;

public class Client {

    public static void main(String[] args) {
        Git git = new ConcreteGit();
        git.commitTemplate();
    }
}
