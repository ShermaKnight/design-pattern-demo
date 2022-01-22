package org.example.responsibility;

import org.apache.commons.lang3.StringUtils;
import org.example.entity.Member;

import java.util.Optional;

public class ValidateHandler extends Handler {

    public void execute(Member member) {
        if (!Optional.ofNullable(member).isPresent() || StringUtils.isEmpty(member.getUserId()) || StringUtils.isEmpty(member.getPassword())) {
            throw new RuntimeException("parameter invalid");
        }
        if (Optional.ofNullable(handler).isPresent()) {
            handler.execute(member);
        }
    }
}
