class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee ID: " + id + ", Employee Name: " + name);
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;

    public HourlyEmployee(String name, int id, double hourlyRate) {
        super(name, id);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}

class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee("John", 101, 15.50);
        Employee emp2 = new SalariedEmployee("Alice", 102, 50000.00);

        // Demonstrating polymorphism
        printEmployeeDetails(emp1);
        printEmployeeDetails(emp2);
    }

    public static void printEmployeeDetails(Employee emp) {
        emp.getEmployeeDetails();
    }
}
