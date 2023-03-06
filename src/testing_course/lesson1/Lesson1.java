package testing_course.lesson1;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lesson1 {
     /* Задание 1
    Напишите метод findMinMax, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.
    Данный метод принимает на вход 3 элемента:
    Stream<? extends T> stream,
    Comparator<? super T> order,
    BiConsumer<? super T, ? super T> minMaxConsumer */

    public <T> void findMinMax(Stream<? extends T> stream,
                               Comparator<? super T> order,
                               BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> items = stream.sorted(order).collect(Collectors.toList()); //создаем условный список для работы с принимаемыми параметрами
        if (!items.isEmpty()) {
            minMaxConsumer.accept(items.get(0), items.get(items.size() - 1));
        } else {
            minMaxConsumer.accept(null, null);
        } // проверка на поступающий пустой список
    }

    /* Задание 2
    Реализуйте метод, который принимает на вход Список целых чисел и определяет количество четных и выводит их в консоль.
    Решать именно с применением Stream API */

    public void predicate(List<Integer> integers) {
        System.out.println(".count() = " + integers.stream()
                .filter(x -> x % 2 == 0)
                .peek(System.out::println)
                .count());
    }
}