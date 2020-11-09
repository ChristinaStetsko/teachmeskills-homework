package homework7.task3;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Writer {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку:"); // It's raining men, hallelujah
        String inputString = bufferedReader.readLine();

        StringBuilder stringBuilder = new StringBuilder(inputString).reverse();
        try (FileWriter writer = new FileWriter("/home/christina/tmp/tmp2.txt", false)) {  // Windows: D:\\Tmp\\tmp2.txt"
            writer.write(String.valueOf(stringBuilder));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}