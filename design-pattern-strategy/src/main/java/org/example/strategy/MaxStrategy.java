package org.example.strategy;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class MaxStrategy implements Strategy {

    @Override
    public Double doOperate(List<Number> numbers) {
        if (CollectionUtils.isNotEmpty(numbers)) {
            return numbers.stream().mapToDouble(Number::doubleValue).max().getAsDouble();
        }
        return 0d;
    }
}
