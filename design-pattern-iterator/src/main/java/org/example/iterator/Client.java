package org.example.iterator;

import lombok.SneakyThrows;

import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

public class Client {

    @SneakyThrows
    public static void main(String[] args) {
        Aggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("北京大学");
        aggregate.add("清华大学");
        aggregate.add("国防科技大学");
        aggregate.add("哈尔滨工业大学");
        aggregate.add("哈尔滨工程大学");

        CountDownLatch latch = new CountDownLatch(4);
        IntStream.range(1, 5).parallel().forEach(i -> new Thread(() -> {
            try {
                String threadName = Thread.currentThread().getName();
                System.out.println("线程启动: " + threadName);
                Iterator iterator = aggregate.getIterator();
                while (iterator.hasNext()) {
                    System.out.println(threadName + ": " + iterator.next());
                }
            } finally {
                latch.countDown();
            }
        }).start());

        latch.await();
        System.out.println("执行完成");
    }
}
