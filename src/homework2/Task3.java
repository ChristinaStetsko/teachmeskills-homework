package homework2;

public class Task3 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
