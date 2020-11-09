package homework8.lambdas.task4;

import java.util.Arrays;
import java.util.List;

public class PrintArray {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.forEach(n -> System.out.print(n));

        //вариант 2:
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(nums).forEach(System.out::print);
    }
}
