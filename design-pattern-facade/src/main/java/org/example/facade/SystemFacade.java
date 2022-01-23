package org.example.facade;

public class SystemFacade {

    private OperateSystem linux, mac, windows;

    public SystemFacade(OperateSystem linux, OperateSystem mac, OperateSystem windows) {
        this.linux = linux;
        this.mac = mac;
        this.windows = windows;
    }

    public boolean executeLinuxCommand(String command) {
        return linux.execute(command);
    }

    public boolean executeMacCommand(String command) {
        return mac.execute(command);
    }

    public boolean executeWindowsCommand(String command) {
        return windows.execute(command);
    }
}
