package day3.exercise;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class Exercise6 {
    record User(int age, int count) {
    }

    public static void main(String[] args) {
        List<User> collect = Stream.of(
                        new User(20, 1),
                        new User(20, 1),
                        new User(20, 1),
                        new User(30, 1),
                        new User(30, 1)
                )
                .collect(groupingBy(User::age, summingInt(User::count)))
                .entrySet().stream().map(e -> new User(e.getKey(), e.getValue())).toList();
        System.out.println(collect);
    }
}
