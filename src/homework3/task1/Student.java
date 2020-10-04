package homework3.task1;

import java.util.ArrayList;

public class Student {
    private String name;
    private String surname;
    private String dateOfBirth;
    private int course;

    public Student(String name, String surname, String dateOfBirth, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.course = course;
    }

    public static void printStudent(ArrayList<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("Student name: " + student.getName() + " " + student.getSurname() + " " + "course " + student.getCourse());
            } else {
                System.out.println("Oops! You entered wrong number");
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateOfBirthday() {
        return dateOfBirth;
    }

    public int getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateOfBirth(String dateOfBirthday) {
        this.dateOfBirth = dateOfBirthday;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}