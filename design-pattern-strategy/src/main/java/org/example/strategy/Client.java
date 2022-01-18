package org.example.strategy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {
        List<Number> numbers = Stream.of(15, 20, 30d, -1d, 100d, 25.10d).collect(Collectors.toList());
        Context context = new Context(new AvgStrategy());
        Double operate = context.executeOperate(numbers);
        System.out.println(operate);

        context = new Context(new SumStrategy());
        operate = context.executeOperate(numbers);
        System.out.println(operate);

        context = new Context(new MinStrategy());
        operate = context.executeOperate(numbers);
        System.out.println(operate);

        context = new Context(new MaxStrategy());
        operate = context.executeOperate(numbers);
        System.out.println(operate);
    }
}
