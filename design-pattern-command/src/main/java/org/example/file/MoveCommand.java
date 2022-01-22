package org.example.file;

public class MoveCommand implements Command {

    private String source;
    private String destination;
    private FileReceiver fileReceiver;

    public MoveCommand() {
        if (fileReceiver == null) {
            fileReceiver = new FileReceiver();
        }
    }

    public MoveCommand(FileReceiver fileReceiver) {
        this.fileReceiver = fileReceiver;
    }

    public MoveCommand(String source, String destination) {
        this();
        this.source = source;
        this.destination = destination;
    }

    @Override
    public boolean operate() {
        return fileReceiver.move(source, destination);
    }

    @Override
    public boolean undo() {
        return fileReceiver.move(destination, source);
    }
}
