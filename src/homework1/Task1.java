package homework1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int r = scanner.nextInt();

        if (Math.sqrt(a * a + b * b) < r * 2) {
            System.out.println("You can do it!");
        } else {
            System.out.println("No, you can't");
        }
    }
}
