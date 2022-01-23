package org.example.facade;

public class WindowsOperateSystem implements OperateSystem {

    @Override
    public boolean execute(String command) {
        System.out.println("执行Windows命令: " + command);
        return true;
    }
}
