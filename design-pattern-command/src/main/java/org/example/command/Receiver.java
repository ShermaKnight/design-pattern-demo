package org.example.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Receiver {

    public Map<String, Integer> action(String text) {
        if (StringUtils.isNotEmpty(text)) {
            HashMap<String, Integer> map = new HashMap<>();
            Arrays.stream(text.split(" ")).parallel().forEach(s -> {
                map.put(s, map.getOrDefault(s, 0) + 1);
            });
            return map;
        }
        return Collections.EMPTY_MAP;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class WordCount {

        private String text;
        private Integer count;

        public WordCount(String text) {
            this.text = text;
            this.count = 1;
        }
    }

}
