package homework5.task4;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Audi", 160, 20000);
        Car car2 = new Car("KIA", 180, 15000);
        Car car3 = new Car("BMW", 220, 35000);

        try {
            car1.start();
        } catch (CarNotStartException e) {
            e.printStackTrace();
        }
        try {
            car2.start();
        } catch (CarNotStartException e) {
            e.printStackTrace();
        }
        try {
            car3.start();
        } catch (CarNotStartException e) {
            e.printStackTrace();
        }
    }
}