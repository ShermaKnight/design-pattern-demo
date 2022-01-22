package org.example.file;

public class CopyCommand implements Command {

    private String source;
    private String destination;
    private FileReceiver fileReceiver;

    public CopyCommand() {
        if (fileReceiver == null) {
            fileReceiver = new FileReceiver();
        }
    }

    public CopyCommand(FileReceiver fileReceiver) {
        this.fileReceiver = fileReceiver;
    }

    public CopyCommand(String source, String destination) {
        this();
        this.source = source;
        this.destination = destination;
    }

    @Override
    public boolean operate() {
        return fileReceiver.copy(source, destination);
    }

    @Override
    public boolean undo() {
        return fileReceiver.remove(destination);
    }
}
