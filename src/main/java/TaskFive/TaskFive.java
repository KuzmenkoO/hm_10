package TaskFive;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskFive {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        // return Stream.concat(first, second);

        List<T> a = first.collect(Collectors.toList());
        List<T> b = second.collect(Collectors.toList());
        int minLengthList = Math.min(a.size(), b.size());

        List<T> newList = new ArrayList<>();
        for (int i = 0; i < minLengthList; i++) {
            newList.add(a.get(i));
            newList.add(b.get(i));
        }

        return newList.stream();
    }
}

