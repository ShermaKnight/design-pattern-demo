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
            context = new Context(userId);
        }
        context.setTraceId(UUID.randomUUID().toString());
        context.setText(text);
        System.out.println("HR发送消息: " + context);
        mediator.relay(this);
    }

    @Override
    protected void receive(Context context) {
        if (this.context == null) {
            this.context = new Context(userId);
        }
        this.context.setTraceId(context.getTraceId());
        this.context.setText(context.getText());
        System.out.println("HR收到消息: " + this.context);
    }
}
