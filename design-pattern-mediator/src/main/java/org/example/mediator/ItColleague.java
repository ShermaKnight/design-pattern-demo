package org.example.mediator;

import java.util.UUID;

public class ItColleague extends Colleague {

    private Long userId;

    public ItColleague(Mediator mediator, Long userId) {
        super(mediator);
        this.userId = userId;
    }

    @Override
    protected void send(String text) {
        if (context == null) {
            context = new Context();
        }
        context.setTraceId(UUID.randomUUID().toString());
        context.setUserId(String.valueOf(userId));
        context.setText(text);
        System.out.println("IT发送消息: " + context);
        mediator.relay(this);
    }

    @Override
    protected void receive(Context context) {
        this.context = context;
        System.out.println("IT收到消息: " + context);
    }
}
