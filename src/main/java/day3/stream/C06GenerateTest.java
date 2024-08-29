package day3.stream;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class C06GenerateTest {
    public static void main(String[] args) {

        // 1. IntStream.range

        IntStream.range(1, 10).forEach(System.out::print); // 包头不包尾
        IntStream.rangeClosed(1, 9).forEach(System.out::print); // 包头包尾

        // 2. IntStream.iterate  生成 1 3 5 7 9 ... 奇数序列    可以根据上一个元素值来生成当前元素
        IntStream.iterate(1, x -> x + 2).limit(10).forEach(System.out::print);
        IntStream.iterate(1, x -> x <= 9, x -> x + 2).forEach(System.out::print);

        // 3. IntStream.generate
        IntStream.generate(()-> ThreadLocalRandom.current().nextInt(100)).limit(5).forEach(System.out::println);

        ThreadLocalRandom.current().ints(5, 0, 100).forEach(System.out::println);
    }
}
