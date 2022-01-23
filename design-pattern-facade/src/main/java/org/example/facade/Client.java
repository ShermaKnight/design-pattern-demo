package org.example.facade;

public class Client {

    public static void main(String[] args) {
        SystemFacade facade = new SystemFacade(new LinuxOperateSystem(), new MacOperateSystem(), new WindowsOperateSystem());
        facade.executeLinuxCommand("find / -name \"readme.md\" -type f");
        facade.executeWindowsCommand("dir");
        facade.executeMacCommand("pwd");
    }
}
