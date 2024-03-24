package com.zsgs.interviewpanel.model;

public abstract class Employee {

    private int employeeId;
    private String employeeName;
    private String employeeEmail;
    private String employeePhone;
    private static int employeeIdCount = 1;
    private int credentialId;
    private EmployeeType employeeType;

    public Employee(String employeeName, String employeeEmail, String employeePhone, int credentialId,
            EmployeeType employeeType) {
        this.employeeId = employeeIdCount++;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeePhone = employeePhone;
        this.credentialId = credentialId;
        this.employeeType = employeeType;
    }

    public Employee(int credentialId, EmployeeType employeeType) {
        this.credentialId = credentialId;
        this.employeeType = employeeType;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public int getCredentialId() {
        return credentialId;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }
}
