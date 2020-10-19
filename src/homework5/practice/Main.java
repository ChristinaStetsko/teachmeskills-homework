package homework5.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnknownTypeOfFigureException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        switch (s) {
            case "Треугольник":
                Triangle triangle = new Triangle("Треугольник", 8);
                System.out.println("треугольник создан");
                break;
            case "Квадрат":
                Square square = new Square("Квадрат", 4);
                System.out.println("Квадрат создан");
                break;
            case "Круг":
                Circle circle = new Circle("Круг", 4);
                System.out.println("Круг создан");
                break;
            default:
                throw new UnknownTypeOfFigureException("Что-то пошло не так. Выберите другую фигуру");
        }
    }
}