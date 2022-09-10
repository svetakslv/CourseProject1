public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Булгаков Михаил Афанасьевич", 3, 57_780.73f);
        employees[1] = new Employee("Чехов Антон Павлович", 1, 45_530.21f);
        employees[2] = new Employee("Ахматова Анна Андреевна", 2, 53_420.46f);
        employees[3] = new Employee("Маяковский Владимир Владимирович", 4, 60_220.15f);
        employees[4] = new Employee("Есенин Сергей Александрович", 3, 56_670.89f);
        employees[5] = new Employee("Лаппа Татьяна Николаевна", 5, 62_490.34f);
        employees[6] = new Employee("Пастернак Борис Леонидович", 4, 59_930.65f);
        employees[7] = new Employee("Блок Александр Александрович", 2, 53_340.37f);
        employees[8] = new Employee("Цветаева Марина Ивановна", 1, 44_900.12f);
        employees[9] = new Employee("Полонская Вероника Витольдовна", 5, 63_600.10f);

        printNameAllEmployees();
            System.out.println("Сумма затрат на зарплаты в месяц " + getSumSalaryOfMonth() + " рублей.");
            System.out.println("Сотрудник с минимальной зарплатой " + getMinimumSalary());
            System.out.println("Сотрудник с максимальной зарплатой " + getMaximumSalary());
            System.out.println("Среднее значение зарплат в месяц " + getAverageSalary());
            System.out.println("Список сотрудников: " + getFullNameEmployees());

        }
    public static void printNameAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static float getSumSalaryOfMonth() {
        float sum = 0;
        for (Employee employee : employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    private static float getMinimumSalary() {
        float min = 0;
        float index = 0;
        for (Employee value : employees) {
            if (value != null) {
                min = value.getSalary();
                index = 1;
                break;
            }
        }
        Employee employeeMinimumSalary = null;
        for (Employee employee : employees) {
            if (employee == null) continue;
            if (employee.getSalary() < min) {
                min = employee.getSalary();
                employeeMinimumSalary = employee;
            }
        }
        return min;
    }

    private static float getMaximumSalary() {
        float max = 0;
        float index = 0;
        for (Employee value : employees) {
            if (value != null) {
                max = value.getSalary();
                index = 1;
                break;
            }
        }
        Employee employeeMaximumSalary = null;
        for (Employee employee : employees) {
            if (employee != null) ;
            if (employee.getSalary() > max) {
                max = employee.getSalary();
                employeeMaximumSalary = employee;
            }
        }
        return max;
    }

    private static float getAverageSalary() {
        float average = 0;
        for (Employee employee : employees) {
            average = average + employee.getSalary() / 10;
        }
        return average;
    }
            private static String getFullNameEmployees () {
                String count = String.valueOf(0);
                for (Employee employee : employees) {
                    count = count + employee.getFullName();
                }
                return count;
            }
        }