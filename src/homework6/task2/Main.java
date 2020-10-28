package homework6.task2;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.addProduct(new Product("Чай", 4.30));
        customer1.addProduct(new Product("Кофе", 20.02));
        customer1.addProduct(new Product("Хлеб", 2.30));
        customer1.addProduct(new Product("Масло", 3.80));

        Customer customer2 = new Customer();
        customer2.addProduct(new Product("Чипсы", 2.04));
        customer2.addProduct(new Product("Конфеты", 10.25));
        customer2.addProduct(new Product("Сыр", 8.45));

        Customer customer3 = new Customer();
        customer3.addProduct(new Product("Селёдка", 3.75));
        customer3.addProduct(new Product("Молоко", 1.67));
        customer3.addProduct(new Product("Сок", 3.50));
        customer3.addProduct(new Product("Картошка", 0.50));
        customer3.addProduct(new Product("Винишко", 25.50));

        Checkout checkout = new Checkout();
        checkout.addInQueue(customer1);
        checkout.addInQueue(customer2);
        checkout.addInQueue(customer3);
        checkout.calculate();
    }
}
