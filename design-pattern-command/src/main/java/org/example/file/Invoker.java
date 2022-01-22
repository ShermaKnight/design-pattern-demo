package org.example.file;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<Command> commands = new ArrayList<>();

    public Invoker takeCommand(Command command) {
        commands.add(command);
        return this;
    }

    public void clear() {
        commands.clear();
    }

    public boolean operate() {
        if (CollectionUtils.isNotEmpty(commands)) {
            boolean label = true;
            for (int i = 0; i <= commands.size() - 1; i++) {
                label = label & commands.get(i).operate();
                if (!label) {
                    break;
                }
            }
            return label;
        }
        return true;
    }

    public boolean undo() {
        if (CollectionUtils.isNotEmpty(commands)) {
            boolean label = true;
            for (int i = commands.size() - 1; i >= 0; i--) {
                label = label & commands.get(i).undo();
                if (!label) {
                    break;
                }
            }
            return label;
        }
        return true;
    }
}
