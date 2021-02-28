package TaskTwo;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskTwo {
    public static List<String> listOfRowsInUpperCaseSortedDescending(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
