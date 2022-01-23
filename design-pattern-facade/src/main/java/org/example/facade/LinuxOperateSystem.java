package org.example.facade;

public class LinuxOperateSystem implements OperateSystem {

    @Override
    public boolean execute(String command) {
        System.out.println("执行Linux命令: " + command);
        return true;
    }
}
