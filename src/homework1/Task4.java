package homework1;

public class Task4 {

    public static void main(String[] args) {
        int[] array = {-3, 1, 12, 3, 4, -5, 6, 8, 9};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
            }
        }

        System.out.println("Сумма отрицательных элементов = " + sum);

        int min = 0;
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            } else if (array[i] < array[min]) {
                min = i;
            }
        }

        int mul = 1;
        if (min < max) {
            for (int i = min; i < max; i++)
                mul *= array[i];
        } else {
            for (int i = max; i <= min; i++)
                mul *= array[i];
        }
        System.out.println("Произведение элементов = " + mul);
    }
}


