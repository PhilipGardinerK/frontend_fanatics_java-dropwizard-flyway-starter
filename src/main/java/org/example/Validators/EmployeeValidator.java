package org.example.Validators;

import org.example.Exceptions.Entity;
import org.example.Exceptions.InvalidException;
import org.example.models.EmployeeRequest;

public class EmployeeValidator {

    public void validateEmployee(final EmployeeRequest employeeRequest)
            throws InvalidException {

        if (employeeRequest.getSalary() < 1) {
            throw new InvalidException(Entity.EMPLOYEE,
                    "Invalid Employee Salary, must be greater than 1");
        }
        if (employeeRequest.getEmployeeFname() == null) {
            throw new InvalidException(Entity.EMPLOYEE,
                    "Invalid Employee FirstName, must not be null");
        }
        if (employeeRequest.getEmployeeLname() == null) {
            throw new InvalidException(Entity.EMPLOYEE,
                    "Invalid Employee LastName, must not be null");
        }
        if (employeeRequest.getBankAcctNo() == null) {
            throw new InvalidException(Entity.EMPLOYEE,
                    "Invalid Employee BankAccountNumber, must not be "
                            + "null");
        }
        if (employeeRequest.getNiNo() == null) {
            throw new InvalidException(Entity.EMPLOYEE,
                    "Invalid Employee, NationalInsurance Number must"
                            + " be greater than 1");
        }
    }

}
