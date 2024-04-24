package employee;

public class Main {
    public static void main(String[] args) {
        Employee hourlyEmployee = new HourlyEmployee(1, "Pravin", "pravin4@gmail.com", "9876543210",
                EmployeeType.Hourly, 2500);
        hourlyEmployee.calculatePay();
        Employee salariedEmployee = new SalariedEmployee(2, "Ameen", "ameen@gmail.com", "8765432190",
                EmployeeType.Salaried, 25);
        salariedEmployee.calculatePay();
    }
}
