public class Employee {

    private String name;
    private int payment;
    private int department;
    private static int counter;
    private static int id;

    public Employee (String name, int payment, int department) {
        this.name = name;
        this.payment = payment;
        this.department = department;
        this.id = counter++;

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPayment() {
        return payment;
    }


    public int getDepartment() {
        return department;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public Employee(String name, int payment, int department, int id) {
        this.name = name;
        this.payment = payment;
        this.department = department;
        this.id = counter++;
    }
    @Override
    public String toString() {
        return "Ф.И.О. - " + name +
                ". Зарплата составляет = " + payment +
                ". Отдел - " + department + ". Его id - " + this.id;
    }

        }

