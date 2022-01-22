package org.example.mediator;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    protected void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
        }
    }

    @Override
    protected void relay(Colleague colleague) {
        if (CollectionUtils.isNotEmpty(colleagues)) {
            colleagues.stream().filter(c -> !c.equals(colleague)).forEach(c -> c.receive(colleague.context));
        }
    }
}
