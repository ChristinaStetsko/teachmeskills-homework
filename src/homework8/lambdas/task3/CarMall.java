package homework8.lambdas.task3;

import java.util.ArrayList;
import java.util.List;

public class CarMall {
    private List<Car> cars = new ArrayList<>();

    public CarMall(){
        cars.add(new Car("KIA", 2006,4000));
        cars.add(new Car("Audi", 2015, 17000));
        cars.add(new Car("Nissan", 2013, 13000));
        cars.add(new Car("Geely", 2018, 9000));
    }

    public List<Car> showCars(CarFilter carFilter){
        ArrayList<Car> filterByPrice = new ArrayList<>();
        for (Car car : cars){
            if (carFilter.showCar(car)){
                filterByPrice.add(car);
            }
        }
        return filterByPrice;
    }
}
