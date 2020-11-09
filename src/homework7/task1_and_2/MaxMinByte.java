package homework7.task1_and_2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxMinByte {

    public static void main(String[] args) {
        String fileName = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите путь и имя файла (например /home/christina/tmp/tmp.txt"); // для Windows D:\Tmp\tmp.txt
            fileName = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileInputStream fileInputStream = null;
        byte[] bytes = new byte[0];
        try {
            fileInputStream = new FileInputStream(fileName);
            bytes = fileInputStream.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bytes.length > 0) {
            byte max = bytes[0];
            byte min = bytes[0];
            for (int i = 0; i < bytes.length; i++) {
                if (max < bytes[i]) {
                    max = bytes[i];
                }
                if (min > bytes[i]) {
                    min = bytes[i];
                }
            }
            System.out.println("Max byte: " + max);
            System.out.println("Min byte: " + min);
        }
    }
}