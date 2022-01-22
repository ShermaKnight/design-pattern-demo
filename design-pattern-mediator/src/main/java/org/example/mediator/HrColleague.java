package org.example.mediator;

import java.util.UUID;

public class HrColleague extends Colleague {

    private Long userId;

    public HrColleague(Mediator mediator, Long userId) {
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
        System.out.println("HR发送消息: " + context);
        mediator.relay(this);
    }

    @Override
    protected void receive(Context context) {
        this.context = context;
        System.out.println("HR收到消息: " + context);
    }
}
