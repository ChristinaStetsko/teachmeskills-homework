package homework6.task2;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Checkout {
    private ArrayDeque<Customer> queue;

    public Checkout() {
        this.queue = new ArrayDeque<>();
    }

    public void addInQueue(Customer customer) {
        this.queue.add(customer);
    }

    public void removeFromQueue() {
        this.queue.remove();
    }

    public void calculate() {
        double sum = 0;
        ArrayList<Product> products = this.queue.element().getProducts();
        for (Product product : products) {
            sum += product.getPrice();
        }

        System.out.println(this.queue.element().toString());
        System.out.println("Сумма чека: " + sum + " руб.");

        removeFromQueue();

        if (this.queue.peek() != null){
            calculate();
        }
    }
}