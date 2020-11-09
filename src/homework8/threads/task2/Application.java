package homework8.threads.task2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Application {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        Deque<Cashbox> cashboxes = new ArrayDeque<>(Arrays.asList(new Cashbox("Касса 1"), new Cashbox("Касса 2")));

        IntStream.range(0, 20)//генерируем 20 покупателей
                .mapToObj(i -> new BuyerThread(Arrays.asList(getProduct(), getProduct(), getProduct(), cashboxes)))  //у каждого по 3 продукта
                .forEach(threadPool::execute);

        System.out.println("Создали 20 покупателей.");

        threadPool.shutdown();
        threadPool.awaitTermination(1L, TimeUnit.HOURS);
    }

    public static Product getProduct() {  //генерация продуктов
        Random random = new Random();
        Product[] values = Product.values();
        return values[random.nextInt(values.length)];
        //return Product.values()[random.nextInt(Product.values().length)];
    }
}
