package org.example.responsibility;

public class Client {

    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        memberService.login("10001", "password10001", "/login/");
        memberService.login("10003", "password10003", "/user/manager/delete");
    }
}
