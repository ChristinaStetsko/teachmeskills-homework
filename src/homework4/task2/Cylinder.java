package homework4.task2;

public class Cylinder extends SolidOfRevolution {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
        super.volume = Math.PI * Math.pow(radius, 2) * height;
    }
}