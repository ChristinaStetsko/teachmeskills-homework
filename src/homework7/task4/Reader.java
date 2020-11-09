package homework7.task4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/christina/tmp/tmp.txt")); // Windows: D:\\Tmp\\tmp2.txt"
            String inputString = bufferedReader.readLine();
            String[] array = inputString.split(" ");
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}