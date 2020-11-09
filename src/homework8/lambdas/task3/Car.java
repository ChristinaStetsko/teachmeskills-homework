package homework8.lambdas.task3;

public class Car {
    private String company;
    private int year;
    private double price;

    public Car(String company, int year, double price) {
        this.company = company;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
