package homework2;

public class Task2 {

    public static void main(String[] args) {
        int a = 1;

        for (int i = 3; i <= 24; i = i + 3) {
            a = a * 2;
            System.out.printf("За %d часов получится %d амёб. \n", i, a);
        }
    }
}
