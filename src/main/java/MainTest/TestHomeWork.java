package MainTest;

import TaskFive.TaskFive;
import TaskFour.TaskFour;
import TaskOne.TaskOne;
import TaskThree.TaskThree;
import TaskTwo.TaskTwo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestHomeWork {
    private static final List<String> names =
            Arrays.asList("Oleksandr", "Igor", "Vasyl", "Tanya", "Sergiy", "Ira", "Olga", "Den", "Sara",
                    "Masha", "Viktor", "Dana", "Kira", "Alex", "Lena", "Vita");
    private static final String[] array = {"1, 2, 0", "4, 5"};

    public static void main(String[] args) {
//      Завдання №1
        System.out.println("Завдання №1");
        System.out.println(TaskOne.listOfNamesWithOddIndex(names));
        System.out.println();

//      Завдання №2
        System.out.println("Завдання №2");
        System.out.println(TaskTwo.listOfRowsInUpperCaseSortedDescending(names));
        System.out.println();

//      Завдання №3
        System.out.println("Завдання №3");
        System.out.println(TaskThree.NumbersInSortedView(array));
        System.out.println();

//      Завдання №4
        System.out.println("Завдання №4");
        long a = 25214903917L;
        long m = (long) Math.pow(2, 48);
        long c = 11;
        long seed = 10;
        Stream<Long> random = TaskFour.linearCongruentialGenerator(a, c, m, seed);
        random
                .limit(5)   //      Встановлено зупинку на 5 чисел
                .forEach(System.out::println);
        System.out.println();

//      Завдання №5
        System.out.println("Завдання №5");
        Stream<String> first = Stream.of("Oleksandr", "Igor", "Vasyl", "Tanya", "Sergiy", "Ira", "Olga", "Den", "Sara");
        Stream<String> second = Stream.of("Viktor", "Dana", "Kira", "Alex", "Lena", "Vita");
        System.out.println(TaskFive.zip(first, second)
                .collect(Collectors.toList()));
    }
}
