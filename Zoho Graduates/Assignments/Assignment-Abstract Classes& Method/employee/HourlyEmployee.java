package employee;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    public static int payPerHour = 100;

    public HourlyEmployee(int employeeId, String employeeName, String employeeEmail, String employeePhone,
            EmployeeType employeeType, int hoursWorked) {
        super(employeeId, employeeName, employeeEmail, employeePhone, employeeType);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculatePay() {
        System.out.println("Pay calculation");
        System.out.println("payPerHour * hoursWorked = totalPay");
        System.out.println("Total Pay :" + payPerHour * hoursWorked);
    }

}
