package homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayFirst = new int[n];
        Random random = new Random();
        int min = 0;

        if (isCorrect(n)) {
            int bound = 0;
            for (int i = 0; i < n; i++) {
                arrayFirst[i] = random.nextInt(n - min) + min;
                if (arrayFirst[i] % 2 == 0 && arrayFirst[i] != 0) {
                    bound++;
                }
            }

            System.out.println(Arrays.toString(arrayFirst));

            int[] arraySec = new int[bound];
            int index = 0;
            for (int i = 0; i < arrayFirst.length; i++) {
                if (arrayFirst[i] % 2 == 0 && arrayFirst[i] != 0) {
                    arraySec[index] = arrayFirst[i];
                    index++;
                }
            }

            System.out.println(Arrays.toString(arraySec));
        }
    }

    private static boolean isCorrect(int n) {
        boolean result = true;
        if (n < 3) {
            result = false;
            System.out.println("Oops! Number must be greater than 3");
        }

        return result;
    }
}
