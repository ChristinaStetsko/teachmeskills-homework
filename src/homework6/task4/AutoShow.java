package homework6.task4;

import java.util.LinkedList;
import java.util.Scanner;

public class AutoShow {
    private LinkedList<Car> cars = new LinkedList<>();

    private Scanner scanner;

    void addToCarList() {
        String newBrand;
        String newModel;
        int newYearOfManufacture;
        double newEngineCapacity;
        int newCoast;

        scanner = new Scanner(System.in);

        System.out.println("Введите марку машины: ");
        newBrand = scanner.nextLine();

        System.out.println("Введите модель машины: ");
        newModel = scanner.nextLine();

        System.out.println("Введите цену: ");
        newYearOfManufacture = scanner.nextInt();

        System.out.println("Введите объём двигателя: ");
        newEngineCapacity = scanner.nextInt();

        System.out.println("Введите цену: ");
        newCoast = scanner.nextInt();

        cars.add(new Car(newBrand,newModel,newYearOfManufacture,newEngineCapacity,newCoast));
        System.out.println("Машина добавлена!");

    }

    void getInfoSpecificCar() {
        scanner = new Scanner(System.in);
        boolean found = false;

        System.out.println("Введите марку машины: ");
        String specificCarMake = scanner.nextLine();

        System.out.println("Введите модель машины: ");
        String specificCarModel = scanner.nextLine();

        for (Car car : cars) {
            if (specificCarMake.equals(car.getBrand()) && specificCarModel.equals(car.getModel())) {
                System.out.printf("Машина марки %s модели %s стоит %.2f денег.\n", car.getBrand(), car.getModel(), car.getCoast());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Нет такой машины!");
        }
    }

    void getInfoAllCar() {
        boolean info = false;
        for (Car car : cars) {
            System.out.printf("Машина марки %s модели %s стоит %.2f денег.\n", car.getBrand(), car.getModel(), car.getCoast());
            info = true;
        }
        if (!info) {
            System.out.println("Нет машин на продажу!");
        }
    }

    void buyCar() {

        scanner = new Scanner(System.in);
        boolean foundForBuy = false;

        System.out.println("Введите марку машины, которую желаете купить: ");
        String buyCarMake = scanner.nextLine();

        System.out.println("Введите модель машины, которую желаете купить: ");
        String buyCarModel = scanner.nextLine();

        for (Car car : cars) {
            if (car.getBrand().contains(buyCarMake) && car.getModel().contains(buyCarModel)) {
                System.out.printf("Машина продана, к оплате: %.2f\n", car.getCoast());

                cars.remove(car);
                foundForBuy = true;
            }
        }
        if (!foundForBuy) {
            System.out.println("Эта машина уже продана");
        }
    }
}