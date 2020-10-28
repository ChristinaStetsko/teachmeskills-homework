package homework6.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AutoShow autoShow = new AutoShow();
        System.out.println("\nВыберите, что Вы хотите сделать: " +
                "\n1 - добавить автомобиль" +
                "\n2 - получить информацию по автомобилю" +
                "\n3 - купить автомобиль" +
                "\n4 - получить весь список автомобилей");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                autoShow.addToCarList();
                break;
            case 2:
                autoShow.getInfoSpecificCar();
                break;
            case 3:
                autoShow.buyCar();
                break;
            case 4:
                autoShow.getInfoAllCar();
                break;
        }
    }
}