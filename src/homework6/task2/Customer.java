package homework6.task2;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Product> products;

    public Customer() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}