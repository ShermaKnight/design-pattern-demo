package org.example.responsibility;

import org.apache.commons.collections4.CollectionUtils;
import org.example.entity.Member;
import org.springframework.util.AntPathMatcher;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AuthenticationHandler extends Handler {

    private static AntPathMatcher antPathMatcher = new AntPathMatcher();

    private static HashMap<String, List<String>> resourceCache = new HashMap<String, List<String>>() {
        {
            put("10001", Stream.of("/login/**").collect(Collectors.toList()));
            put("10002", Stream.of("/login/**", "/user/manager/**", "/api/**").collect(Collectors.toList()));
            put("10003", Stream.of("/login/**", "/api/**").collect(Collectors.toList()));
            put("10004", Stream.of("/login/**", "/user/manager/**").collect(Collectors.toList()));
        }
    };

    @Override
    public void execute(Member member) {
        List<String> resources = resourceCache.get(member.getUserId());
        if (CollectionUtils.isEmpty(resources)) {
            throw new RuntimeException("no permission");
        }
        boolean label = false;
        for (String resource : resources) {
            if (antPathMatcher.match(resource, member.getResource())) {
                label = true;
            }
        }
        if (!label) {
            throw new RuntimeException("resource no permission");
        }
        if (Optional.ofNullable(handler).isPresent()) {
            handler.execute(member);
        }
    }
}
