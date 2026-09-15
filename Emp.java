class Employee {
    String empName;
    double salary;
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rahul", 45000);
        Employee emp2 = new Employee("Sneha", 55000);
        Employee emp3 = new Employee("Vikram", 60000);

        Employee.printCompanyInfo();
    }
}