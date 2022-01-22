package org.example.command;

import java.util.Map;

public interface Command<T, R extends Map> {
    
    R execute(T t);
}
