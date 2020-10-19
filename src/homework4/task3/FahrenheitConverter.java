package homework4.task3;

public class FahrenheitConverter implements Converter {

    @Override
    public double convert(double value) {
        System.out.println((value * 1.8 + 32) + " градусов по Фаренгейту или");
        return value;
    }
}