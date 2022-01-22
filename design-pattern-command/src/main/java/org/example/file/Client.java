package org.example.file;

public class Client {

    public static void main(String[] args) {
        String source = args[0];
        String destination = args[1];
        System.out.println(source + ", " + destination);
        Invoker invoker = new Invoker();
        invoker.takeCommand(new MoveCommand(source, destination)).takeCommand(new RenameCommand(destination, source)).takeCommand(new CopyCommand(source, destination));
        System.out.println(invoker.operate());
        System.out.println(invoker.undo());
    }
}
