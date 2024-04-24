package employee;

public abstract class Employee {
    private int empId;
    private String employeeName;
    private String employeeEmail;
    private String employeePhone;
    private EmployeeType employeeType;

    public Employee(int empId, String employeeName, String employeeEmail, String emplyoeePhone,
            EmployeeType employeeType) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeePhone = emplyoeePhone;
        this.employeeType = employeeType;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void getEmployeeDetails() {
        System.out.println("EmployeeName: " + employeeName + "\nEmployeePhone: " + employeePhone + "\nEmployeeType: +"
                + employeeType);
    }

    public abstract void calculatePay();
}
