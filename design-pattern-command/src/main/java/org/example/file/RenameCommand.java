package org.example.file;

public class RenameCommand implements Command {

    private String source;
    private String destination;
    private FileReceiver fileReceiver;

    public RenameCommand() {
        if (fileReceiver == null) {
            fileReceiver = new FileReceiver();
        }
    }

    public RenameCommand(FileReceiver fileReceiver) {
        this.fileReceiver = fileReceiver;
    }

    public RenameCommand(String source, String destination) {
        this();
        this.source = source;
        this.destination = destination;
    }

    @Override
    public boolean operate() {
        return fileReceiver.rename(source, destination);
    }

    @Override
    public boolean undo() {
        return fileReceiver.rename(destination, source);
    }
}
