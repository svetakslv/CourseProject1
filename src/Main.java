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

        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    private static float getSumSalaryOfMonth() {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary() ;
            System.out.println("Сумма затрат на зарплаты в месяц " + sum + " рублей.");
        }
        return sum;
    }

    private static float getMinimumSalary() {
        float min = 44_900.12f;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < min) ;
            min = employees[i].getSalary();
            System.out.println("Сотрудник с минимальной зарплатой" + min);
        }
        return min;
    }

    private static float getMaximumSalary() {
        float max = 63_600.10f;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < max) ;
            max = employees[i].getSalary();
            System.out.println("Сотрудник с максимальной зарплатой" + max);
        }
        return max;
    }

    private static float getAverageSalary() {
        float average = 0;
        for (int i = 0; i < employees.length; i++) {
            average = average + employees[i].getSalary() / 10;
            System.out.println("Сумма затрат на зарплаты в месяц " + average + " рублей.");
        }
        return average;
    }

    private static float getFullNameEmployees() {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            count = Integer.parseInt(count + employees[i].getFullName());
            System.out.println("Список сотрудников: " + count);
        }
        return count;
    }
}


