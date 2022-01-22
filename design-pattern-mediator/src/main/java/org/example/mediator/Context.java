package org.example.mediator;

import lombok.Data;

@Data
public class Context {

    private String traceId;
    private Long userId;
    private String text;

    public Context(Long userId) {
        this.userId = userId;
    }
}
