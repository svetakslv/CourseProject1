public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Булгаков Михаил Афанасьевич", 3, 57_780.73f, Employee.getCounter());
        employees[1] = new Employee("Чехов Антон Павлович", 1, 45_530.21f, Employee.getCounter());
        employees[2] = new Employee("Ахматова Анна Андреевна", 2, 53_420.46f, Employee.getCounter());
        employees[3] = new Employee("Маяковский Владимир Владимирович", 4, 60_220.15f, Employee.getCounter());
        employees[4] = new Employee("Есенин Сергей Александрович", 3, 56_670.89f, Employee.getCounter());
        employees[5] = new Employee("Лаппа Татьяна Николаевна", 5, 62_490.34f, Employee.getCounter());
        employees[6] = new Employee("Пастернак Борис Леонидович", 4, 59_930.65f, Employee.getCounter());
        employees[7] = new Employee("Блок Александр Александрович", 2, 53_340.37f, Employee.getCounter());
        employees[8] = new Employee("Цветаева Марина Ивановна", 1, 44_900.12f, Employee.getCounter());
        employees[9] = new Employee("Полонская Вероника Витольдовна", 5, 63_600.10f, Employee.getCounter());

        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println(employees[2]);
        System.out.println(employees[3]);
        System.out.println(employees[4]);
        System.out.println(employees[5]);
        System.out.println(employees[6]);
        System.out.println(employees[7]);
        System.out.println(employees[8]);
        System.out.println(employees[9]);

    }
}


