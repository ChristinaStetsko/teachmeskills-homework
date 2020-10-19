package homework4.task3;

public class CelsiusConverter implements Converter {

    @Override
    public double convert(double value) {
        System.out.println(value + " градусов по цельсию это: ");
        return value;
    }
}