package task_05;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Zip {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iteratorFirst = first.iterator();
        List<T> collect = second.flatMap(i -> {
            if (iteratorFirst.hasNext() && i != null) {
                return Stream.of(i, iteratorFirst.next());
            } else {
                return Stream.empty();
            }
        }).collect(Collectors.toList());
        return (Stream<T>) collect.stream();
    }
}