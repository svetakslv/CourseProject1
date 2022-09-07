import java.util.Objects;

public class Employee {
    private String fullName;
    private int numDepartment;
    private float salary;
    private static int counter;
    private int id = counter++;


    public Employee(String fullName, int numDepartment, float salary, int counter) {
        this.fullName = fullName;
        this.numDepartment = numDepartment;
        this.salary = salary;
        this.id = counter;

    }

    public String getFullName() {
        return fullName;
    }

    public int getNumDepartment() {
        return numDepartment;
    }

    public float getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setNumDepartment(int numDepartment) {
        this.numDepartment = numDepartment;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

}

