package org.example.hook;

public abstract class Git {

    public void gitAdd() {
        System.out.println("git add -A");
    }

    public void gitCommit() {
        System.out.println("git commit -m \"Update something.\"");
    }

    public void gitPush() {
        System.out.println("git push origin main");
    }

    public boolean commitBefore() {
        return false;
    }

    abstract void gitPull();

    public void commitTemplate() {
        if (commitBefore()) {
            gitPull();
        }
        gitAdd();
        gitCommit();
        gitPush();
    }
}
