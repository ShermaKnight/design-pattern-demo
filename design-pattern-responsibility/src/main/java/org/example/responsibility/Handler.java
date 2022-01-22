package org.example.responsibility;

import org.example.entity.Member;

import java.util.Optional;

public abstract class Handler {

    protected Handler handler;

    private void next(Handler chain) {
        this.handler = chain;
    }

    public abstract void execute(Member member);

    public static class Builder {

        private Handler head;
        private Handler tail;

        public Builder addHandler(Handler handler) {
            if (!Optional.ofNullable(this.head).isPresent()) {
                this.head = this.tail = handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;
            return this;
        }

        public Handler build() {
            return this.head;
        }
    }
}
