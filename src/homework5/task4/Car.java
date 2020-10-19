package homework5.task4;

public class Car {
    String brand;
    int speed;
    int price;
    int random = (int) (Math.random() * 20);

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public void start() throws CarNotStartException {
        if (random % 2 != 0) {
            System.out.println("Car " + getBrand() + " started");
        } else {
            throw new CarNotStartException("Car " + getBrand() + " can't be started");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }
}