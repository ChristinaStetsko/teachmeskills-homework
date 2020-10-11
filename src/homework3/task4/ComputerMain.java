package homework3.task4;

import java.util.Scanner;

public class ComputerMain {

    public static void main(String[] args) {
        Computer computer = new Computer("BIT-64", 16, 1024, false);
        computer.print(computer);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 0 or 1 to start computer");
        int choiceToStart = scanner.nextInt();

        if (isCorrect(choiceToStart)) {
            Computer.startComputer(computer, choiceToStart);

            if (computer.isStatus()) {
                System.out.println("Enter number 0 or 1 to stop computer");
                int choiceToStop = scanner.nextInt();

                if (isCorrect(choiceToStop)) {
                    Computer.stopComputer(computer, choiceToStop);
                }
            }
        }
    }

    private static boolean isCorrect(int n) {
        boolean result = true;
        if (n != 1 && n != 0) {
            result = false;
            System.out.println("Oops! Number must be 0 or 1");
        }
        return result;
    }
}