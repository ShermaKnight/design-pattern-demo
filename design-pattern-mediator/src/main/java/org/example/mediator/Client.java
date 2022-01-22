package org.example.mediator;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague hrColleague = new HrColleague(mediator, 10001l);
        Colleague itColleagueA = new ItColleague(mediator, 10002l);
        Colleague itColleagueB = new ItColleague(mediator, 10003l);
        mediator.register(hrColleague);
        mediator.register(itColleagueA);
        mediator.register(itColleagueB);

        hrColleague.send("我的电脑需要升级");
        itColleagueA.send("老师稍等片刻, 我们马上派人协助升级");
    }
}
