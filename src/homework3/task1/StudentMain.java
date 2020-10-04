package homework3.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course number:");
        int courseNumber = scanner.nextInt();

        ArrayList<Student> student = new ArrayList<>();
        Student student1 = new Student("Elizabeth", "Blackburn", "20.04.1999", 4);
        Student student2 = new Student("Frances", "Holberton", "20.04.2001", 3);
        Student student3 = new Student("Marie", "Curie", "20.04.2000", 4);
        Student student4 = new Student("Donald", "Knuth", "20.04.1997", 5);
        Student student5 = new Student("Timothy", "Berners-Lee", "20.04.2001", 2);
        Student student6 = new Student("John", "Carmack", "20.04.2003", 1);

        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        student.add(student5);
        student.add(student6);

        Student.printStudent(student, courseNumber);
    }
}