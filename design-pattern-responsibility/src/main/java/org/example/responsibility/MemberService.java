package org.example.responsibility;

import org.example.entity.Member;

public class MemberService {

    public void login(String userId, String password, String resource) {
        Handler.Builder builder = new Handler.Builder();
        builder.addHandler(new ValidateHandler()).addHandler(new LoginHandler()).addHandler(new AuthenticationHandler());
        builder.build().execute(new Member(userId, password, resource));
    }
}
