package employee;

public class SalariedEmployee extends Employee {
    private int daysWorked;
    private static int payPerDay = 1000;

    public SalariedEmployee(int empId, String employeeName, String employeeEmail, String employeePhone, EmployeeType employeeType, int daysWorked)
    {
        super(empId, employeeName, employeeEmail, employeePhone, employeeType);
        this.daysWorked = daysWorked;
    }

    @Override
    public void calculatePay() {
        System.out.println("Calculating pay for Salaried Employee"+ getEmployeeName());
        System.out.println("daysWorked * payPerDay = Total pay for employee");
        System.out.println("Total pay for employee :"+payPerDay*daysWorked);

    }

    
}
