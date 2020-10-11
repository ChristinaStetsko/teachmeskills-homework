package homework4.task2;

public class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(radius);
        super.volume = Math.PI * Math.pow(radius, 3) * 4 / 3;
    }
}