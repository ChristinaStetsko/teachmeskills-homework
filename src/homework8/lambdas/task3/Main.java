package homework8.lambdas.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CarMall carMall = new CarMall();
        List<Car> filterByPrice = carMall.showCars(car -> car.getPrice() > 10000);

        System.out.println(filterByPrice);
    }
}
