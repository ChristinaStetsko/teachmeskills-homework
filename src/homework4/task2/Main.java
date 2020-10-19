package homework4.task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Cylinder(4, 15));
        shapes.add(new Ball(3));
        shapes.add(new Pyramid(2, 6));
        shapes.add(new Pyramid(18, 27));
        shapes.add(new Cylinder(3, 4));
        shapes.add(new Ball(8));

        Box box1 = new Box(1000);
        System.out.println("First box:");
        fillBox(shapes, box1);

        Box box2 = new Box(5000);
        System.out.println("\nSecond box:");
        fillBox(shapes, box2);
    }

    public static void fillBox(ArrayList<Shape> array, Box box) {
        for (int i = 0; i < array.size(); i++) {
            if (!box.add(array.get(i))) {
                break;
            }
            if (i == (array.size() - 1)) {
                System.out.println("We added all objects!");
            }
        }
    }
}