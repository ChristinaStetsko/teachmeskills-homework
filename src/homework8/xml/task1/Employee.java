package homework8.xml.task1;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String department;
    private int experience;

    public Employee(String firstName, String lastName, String position, String department, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.department = department;
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
