package homework4.task3;

public class KelvinConverter implements Converter {

    @Override
    public double convert(double value) {
        System.out.println((value + 273.15) + " градусов по Кельвину.");
        return value;
    }
}