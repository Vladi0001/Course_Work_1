public class Main {

    public static void main(String[] args) {
        //Staff
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Иванов Иван Иванович", 37500, 1, 1);
        employee[1] = new Employee("Смирнов Семён Семёнович", 45300, 2, 2);
        employee[2] = new Employee("Петров Пётр Петрович", 24700, 3, 3);
        employee[3] = new Employee("Сидоров Сергей Сергеевич", 66400, 4, 4);
        employee[4] = new Employee("Светлаков Сергей Юрьевич", 58600, 5, 5);

        //
        printAllEmployeeBook(employee);
        sumPayment(employee);
        minPayment(employee);
        maxPayment(employee);
        printFIO(employee);


    }

    private static void printAllEmployeeBook(Employee[] employee) {
        System.out.println("Полный список сотрудников со всеми данными: ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);

        }
    }

    private static void sumPayment(Employee[] employee) {
        int sum = 0;
        int averageSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getPayment();
            averageSalary = sum / employee.length;
        }
        System.out.println("Сумма всех зарплат сотрудникам = " + sum + " рублей.");
        System.out.println("Средняя сумма расходов по оплате " + averageSalary + " рублей.");
    }

    public static void minPayment(Employee[] employees) {
        int i = 0;
        int minPayment = employees[i].getPayment();
        for (i = 0; i < employees.length; i++) {
            if (minPayment > employees[i].getPayment()) {
                minPayment = employees[i].getPayment();
            }

        }
        System.out.println("Самая минимальная зарплата составляет " + minPayment + " рублей.");

    }

    public static void maxPayment(Employee[] employees) {
        int i = 0;
        int maxPayment = employees[i].getPayment();
        for (i = 0; i < employees.length; i++) {
            if (maxPayment < employees[i].getPayment()) {
                maxPayment = employees[i].getPayment();
            }

        }
        System.out.println("Самая максимальная зарплата составляет " + maxPayment + " рублей.");
    }
    private static void printFIO(Employee[] employee) {
        System.out.println("Полный список всех имён сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName());

        }
    }
}


