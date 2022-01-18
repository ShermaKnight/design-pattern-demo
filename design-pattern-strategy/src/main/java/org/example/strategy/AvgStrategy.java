package org.example.strategy;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AvgStrategy implements Strategy {

    public Double doOperate(List<Number> numbers) {
        if (CollectionUtils.isNotEmpty(numbers)) {
            return numbers.stream().collect(Collectors.averagingDouble(Number::doubleValue));
        }
        return 0d;
    }
}
