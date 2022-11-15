package task_05;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("1", "2", "3", "4", "5", "6", "7");
        Stream<String> stream2 = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

        System.out.println(Zip.zip(stream1, stream2)
                // .peek(System.out::println)
                .collect(Collectors.toList()));
    }
}

