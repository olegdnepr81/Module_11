package task_01;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FilterOddIndexName {
    public void nameLine(String[] name) {

        List<String> arr;
        arr = IntStream.range(0, name.length)
                .filter(n -> n % 2 != 0)
                .mapToObj(index -> String.format("%d.%s", index, name[index]))
                .collect(Collectors.toList());
        System.out.println(arr);
    }
}
