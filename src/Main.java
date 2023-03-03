import testing_course.lesson1.Lesson1;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Lesson1 lesson1 = new Lesson1();


        List<Integer> nums = Stream.iterate(2, e -> e * 4)
                .limit(11)
                .toList();

        lesson1.findMinMax(nums.stream(),
                Integer::compareTo,
                (x, y) -> System.out.printf("min: %s, max: %s%n", x, y));

        lesson1.Predicate(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17));
    }
}