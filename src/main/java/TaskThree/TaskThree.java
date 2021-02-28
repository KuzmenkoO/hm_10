package TaskThree;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TaskThree {
    public static String NumbersInSortedView(String[] array) {
        return Arrays.stream(array)
                .flatMap((n) -> Arrays.stream(n.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
