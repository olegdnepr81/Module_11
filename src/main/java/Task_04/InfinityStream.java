package Task_04;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InfinityStream {
    public static void main(String[] args) {
        OurRandom random = new OurRandom(25214903917L, 11L, (long) Math.pow(2, 48));
        Stream<Long> integerStream = Stream.iterate(3L, (seed) -> random.changeSeed(seed).next());
        integerStream.limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

}
