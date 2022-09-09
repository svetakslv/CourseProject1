import java.util.Objects;

public class Employee {
    private String fullName;
    private int numDepartment;
    public float salary;
    private static int counter = 0;
    private int id = ++counter;

    
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

    public Employee(String fullName, int numDepartment, float salary, int counter) {
        this.fullName = fullName;
        this.numDepartment = numDepartment;
        this.salary = salary;
        this.id = ++counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return numDepartment == employee.numDepartment && Float.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, numDepartment, salary, id);
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                "Ф.И.О.: " + fullName +
                ", номер отдела: " + numDepartment +
                ", заработная плата: " + salary +
                ", id=" + id;
    }

}

