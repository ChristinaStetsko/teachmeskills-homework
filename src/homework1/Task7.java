package homework1;

import java.util.Random;

public class Task7 {

    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[6][];
        int min = -15;
        int max = 35;

        for (int i = 0; i < array.length; i++) {
            array[i] = new int[random.nextInt(max - min) + min];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(max - min) + min;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
