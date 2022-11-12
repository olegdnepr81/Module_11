package Task_02;

import java.util.Arrays;

public class ArrayToReverseAndUpperCase {
    public static String[] reversUpperCase(String[] array) {

        return Arrays.stream(array).sorted().map(String::toUpperCase).toArray(String[]::new);
    }
}

