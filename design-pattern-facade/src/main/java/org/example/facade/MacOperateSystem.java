package org.example.facade;

public class MacOperateSystem implements OperateSystem {

    @Override
    public boolean execute(String command) {
        System.out.println("执行Mac命令: " + command);
        return true;
    }
}
