package task_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToReverseAndUpperCase {
    public void reversUpperCase(String[] array) {
        List<String> arr = Arrays.stream(array).sorted(Comparator.reverseOrder()).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(arr);
    }
}

