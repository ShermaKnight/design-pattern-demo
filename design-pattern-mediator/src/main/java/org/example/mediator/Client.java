package org.example.mediator;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague hrColleague = new HrColleague(mediator, 10001l);
        Colleague itColleague = new ItColleague(mediator, 10002l);
        mediator.register(hrColleague);
        mediator.register(itColleague);

        hrColleague.send("我的电脑需要升级");
        itColleague.send("收到");
    }
}
