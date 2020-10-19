package homework4.task2;

public class Box extends Shape {
    public Box(double volume) {
        super.volume = volume;
    }

    public boolean add(Shape shape) {
        if (shape.volume < this.volume) {
            this.volume -= shape.volume;
            System.out.println(shape.getClass().getSimpleName() + " was added to the box.");
            return true;
        } else {
            System.out.println("There is no space for another object!");
            return false;
        }
    }
}