public class Main {

    public static void main(String[] args) {
        //Staff
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Иванов Иван Иванович", 37500, 1);
        employee[1] = new Employee("Смирнов Семён Семёнович", 45300, 2);
        employee[2] = new Employee("Петров Пётр Петрович", 24700, 3);
        employee[3] = new Employee("Сидоров Сергей Сергеевич", 66400, 4);
        employee[4] = new Employee("Светлаков Сергей Юрьевич", 58600, 5);

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
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getPayment();
        }
        int averageSalary = sum / employee.length;
        System.out.println("Сумма всех зарплат сотрудникам = " + sum + " рублей.");
        System.out.println("Средняя сумма расходов по оплате " + averageSalary + " рублей.");
    }

    public static void minPayment(Employee[] employees) {
        Employee minPayment = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (minPayment.getPayment() > employees[i].getPayment()) {
                minPayment = employees[i];
            }
        }
        System.out.println("Самая минимальная зарплата у сотрудника: " + minPayment + " рублей.");
    }

    public static void maxPayment(Employee[] employees) {
        Employee maxPayment = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (maxPayment.getPayment() < employees[i].getPayment()) {
                maxPayment = employees[i];
            }

        }
        System.out.println("Самая максимальная зарплата у сотрудника: " + maxPayment + " рублей.");
    }

    private static void printFIO(Employee[] employee) {
        System.out.println("Полный список всех имён сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName());

        }
        // Задача из Теоритеческой части

        String qwe = new String("Привет");
        int asd = qwe.length() / 2;
        System.out.println(asd);

        System.out.println(qwe.substring(0, qwe.length() / 2));
        System.out.println(qwe.substring(asd));


    }


    }



