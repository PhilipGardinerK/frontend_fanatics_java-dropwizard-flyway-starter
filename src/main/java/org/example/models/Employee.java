package org.example.models;

public class Employee {

    private int employeeID;
    private int roleID;
    private String employeeFname;
    private String employeeLname;
    private String bankAcctNo;
    private String niNo;
    private double salary;
    private double commRate;


    public Employee(final int employeeID,
                    final int roleID,
                    final String employeeFname,
                    final String employeeLname,
                    final String bankAcctNo,
                    final String niNo,
                    final double salary,
                    final double commRate) {
        this.employeeID = employeeID;
        this.roleID = roleID;
        this.employeeFname = employeeFname;
        this.employeeLname = employeeLname;
        this.bankAcctNo = bankAcctNo;
        this.niNo = niNo;
        this.salary = salary;
        this.commRate = commRate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(final int employeeID) {
        this.employeeID = employeeID;
    }

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(final int roleID) {
        this.roleID = roleID;
    }

    public String getEmployeeFname() {
        return employeeFname;
    }

    public void setEmployeeFname(final String employeeFname) {
        this.employeeFname = employeeFname;
    }

    public String getEmployeeLname() {
        return employeeLname;
    }

    public void setEmployeeLname(final String employeeLname) {
        this.employeeLname = employeeLname;
    }

    public String getBankAcctNo() {
        return bankAcctNo;
    }

    public void setBankAcctNo(final String bankAcctNo) {
        this.bankAcctNo = bankAcctNo;
    }

    public String getNiNo() {
        return niNo;
    }

    public void setNiNo(final String niNo) {
        this.niNo = niNo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(final double salary) {
        this.salary = salary;
    }

    public double getCommRate() {
        return commRate;
    }

    public void setCommRate(final double commRate) {
        this.commRate = commRate;
    }
}
