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
                (x, y) -> System.out.println(String.format("min: %s, max: %s", x, y)));

        System.out.println("nums = " + nums);
    }
}