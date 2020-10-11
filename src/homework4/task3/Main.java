package homework4.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        CelsiusConverter celsiusConverter = new CelsiusConverter();
        FahrenheitConverter fahrenheit = new FahrenheitConverter();
        KelvinConverter kelvin = new KelvinConverter();

        celsiusConverter.convert(temperature);
        fahrenheit.convert(temperature);
        kelvin.convert(temperature);
    }
}