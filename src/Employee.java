public class Employee {
    private String fullName;
    private int numDepartment;
    private float salary;
    private static int counter;
    private int id;

    public Employee(String fullName, int numDepartment, float salary, int counter, int id) {
        this.fullName = fullName;
        this.numDepartment = numDepartment;
        this.salary = salary;
        this.id = id;
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

