package homework1;

import java.util.Arrays;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {
        int[] array = new int[6];
        Random random = new Random();
        int min = -5;
        int max = 15;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min) + min;
        }

        System.out.println("Unsorted array: " + Arrays.toString(array));

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
