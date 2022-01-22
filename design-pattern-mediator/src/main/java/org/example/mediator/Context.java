package org.example.mediator;

import lombok.Data;

@Data
public class Context {

    private String traceId;
    private String userId;
    private String text;
}
