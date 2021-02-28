package TaskFour;

import java.util.stream.Stream;

public class TaskFour {
    public static Stream <Long> linearCongruentialGenerator(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> 1 * (a * x + c) % m);
    }
}
