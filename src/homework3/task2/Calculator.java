package homework3.task2;

import java.util.Scanner;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private int result;

    public Calculator() {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scan.nextInt();

        Calculator calculator = new Calculator();
        calculator.setFirstNumber(firstNumber);
        calculator.setSecondNumber(secondNumber);

        int addResult = calculator.add(calculator.getFirstNumber(), calculator.getSecondNumber());
        System.out.println("Addition result = " + addResult);

        int subResult = calculator.subtract(calculator.getFirstNumber(), calculator.getSecondNumber());
        System.out.println("Subtraction result = " + subResult);

        int mulResult = calculator.multiply(calculator.getFirstNumber(), calculator.getSecondNumber());
        System.out.println("Multiplication result = " + mulResult);

        double divResult = calculator.divide(calculator.getFirstNumber(), calculator.getSecondNumber());
        System.out.println("Division result = " + divResult);
    }

    public int add(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    public int subtract(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    public int multiply(int num1, int num2) {
        result = num1 * num2;
        return result;
    }

    public double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
