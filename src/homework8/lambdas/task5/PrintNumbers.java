package homework8.lambdas.task5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PrintNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-5, -4, -3, 1, 2, 3, -2, 4, -1, 0, 5, 6);

        System.out.println(sumAll(numbers, n -> n % 2 == 0));
        System.out.println(sumAll(numbers, n -> n % 2 != 0));
        System.out.println(sumAll(numbers, n -> n > 3));
        System.out.println(sumAll(numbers, n -> n > 0));
        System.out.println(sumAll(numbers, n -> n < 0));
    }

    public static int sumAll(List<Integer> nums, Predicate<Integer> predicate) {
        int total = 0;
        for (int number : nums) {
            if (predicate.test(number)) {
                total += number;
            }
        }
        return total;
    }
}