package homework8.threads.task2;

import java.util.Deque;
import java.util.List;

public class BuyerThread implements Runnable {

    private static int counter = 0;  //счётчик покупателей вместо имён
    private int number = ++counter;

    private List<Product> products;
    private Deque<Cashbox> cashboxes;

    public BuyerThread(List<Product> products, Deque<Cashbox> cashboxes) {
        this.products = products;
        this.cashboxes = cashboxes;
    }

    public <T> BuyerThread(List<T> asList) {
    }

    @Override
    public void run() {
        try {
            synchronized (cashboxes) {
                while (cashboxes.size() == 0) { //пока нет свободных касс, мы ожидаем
                    cashboxes.wait();
                }
                Cashbox cashbox = cashboxes.poll();
                System.out.println("Обслуживается покупатель " + number + " в кассе " + cashbox.getName());
                products.stream()
                        .peek(product -> sleep())
                        .map(Product::getDescription)
                        .forEach(System.out::println);
                cashboxes.add(cashbox);
                cashboxes.notifyAll(); //поток проверяет все кассы и опять идёт в while
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void sleep() { //вынесено изстроки 32, чтобы не отлавливать InterruptedException на каждом продукте
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}