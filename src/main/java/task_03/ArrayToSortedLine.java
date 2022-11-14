package task_03;

import java.util.Arrays;

public class ArrayToSortedLine {
    public static void arrayToSortedLine(String[] array) {
        Object[] array1 = Arrays.stream(array).map(s -> s.split(", ")).flatMap(strings -> Arrays.stream(strings).
                sorted()).toArray();
        System.out.println(Arrays.deepToString(array1));
    }
}
