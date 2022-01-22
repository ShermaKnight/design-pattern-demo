package org.example.responsibility;

import org.apache.commons.lang3.StringUtils;
import org.example.entity.Member;

import java.util.HashMap;
import java.util.Optional;

public class LoginHandler extends Handler {

    private static HashMap<String, String> userCache = new HashMap<String, String>() {
        {
            put("10001", "password10001");
            put("10002", "password10002");
            put("10003", "password10003");
            put("10004", "password10004");
        }
    };

    @Override
    public void execute(Member member) {
        if (!userCache.containsKey(member.getUserId())) {
            throw new RuntimeException("user invalid");
        }
        if (!StringUtils.equalsIgnoreCase(userCache.get(member.getUserId()), member.getPassword())) {
            throw new RuntimeException("username or password invalid");
        }
        if (Optional.ofNullable(handler).isPresent()) {
            handler.execute(member);
        }
    }
}
