package TaskOne;

import java.util.List;
import java.util.stream.Collectors;

public class TaskOne {
    public static String listOfNamesWithOddIndex(List<String> names){
        return names.stream()
                .map(s -> names.indexOf(s) + ". " + s)
                .filter(s -> Integer.parseInt(s.split(". ")[0]) % 2 != 0)
                .collect(Collectors.joining(", "));
    }
}
