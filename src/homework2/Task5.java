package homework2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (isRight(n)) {
            if (isSimple(n, 2)) {
                System.out.printf("Is number %d simple - YES", n);
            } else {
                System.out.printf("Is number %d simple - NO", n);
            }
        }
    }

    private static boolean isRight(int n) {
        boolean result = true;
        if (n <= 1) {
            result = false;
            System.out.println("Wrong number. Let's try again!");
        }

        return result;
    }

    public static boolean isSimple(int n, int a) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % a == 0) {
            return false;
        } else if (a < n / 2) {
            return isSimple(n, a + 1);
        } else {
            return true;
        }
    }
}