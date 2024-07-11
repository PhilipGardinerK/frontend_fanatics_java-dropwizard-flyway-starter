package org.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeRequest {

    @JsonProperty
    private String employeeFname;

    @JsonProperty
    private String employeeLname;

    @JsonProperty
    private String bankAcctNo;

    @JsonProperty
    private String niNo;

    @JsonProperty
    private double salary;

    @JsonProperty
    private double commRate;

    @JsonCreator
    public EmployeeRequest(
                           @JsonProperty("employeeFname")
                           final String employeeFname,
                           @JsonProperty("employeeLname")
                           final String employeeLname,
                           @JsonProperty("bankAcctNo")
                           final String bankAcctNo,
                           @JsonProperty("niNo")
                           final String niNo,
                           @JsonProperty("salary")
                           final double salary,
                           @JsonProperty("commRate")
                           final double commRate) {
        this.employeeFname = employeeFname;
        this.employeeLname = employeeLname;
        this.bankAcctNo = bankAcctNo;
        this.niNo = niNo;
        this.salary = salary;
        this.commRate = commRate;
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
